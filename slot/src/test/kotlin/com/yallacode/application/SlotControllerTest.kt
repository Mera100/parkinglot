package com.yallacode.application

import com.yallacode.domain.model.Address
import com.yallacode.domain.model.SlotType
import com.yallacode.domain.service.SlotService
import com.yallacode.repository.entity.ParkingLot
import com.yallacode.repository.entity.Slot
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post
import javax.management.Query.value

@ExtendWith(SpringExtension::class)
@WebMvcTest(SlotController::class)
class SlotControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    private lateinit var slotService: SlotService

    @Nested
    inner class BookSlot() {
        @Test
        fun `when request is without body should return 400 response`() {
            mockMvc.post("/api/v1/slot").andExpect {
                status { is4xxClientError() }
            }
        }

        @Test
        fun `when request is with body should return 200 response`() {
            val parkingLot = ParkingLot(3, "Leo", Address(1, 1.2, 1.2))
            val slot = Slot(1, 1, parkingLot, SlotType.NORMAL, true)
            Mockito.`when`(slotService.bookFreeSlot(3L, SlotType.NORMAL)).thenReturn(slot)
            mockMvc.post("/api/v1/slot") {
                contentType = MediaType.APPLICATION_JSON
                content = """
        {
            "parkingLotId": 3,
            "slotType": "NORMAL"
        }
        """.trimIndent()
            }.andExpect {
                status {
                    isOk()
                    jsonPath("$.parkingLot.id") {
                        value(3)
                    }
                    jsonPath("$.parkingLot.name") {
                        value("Leo")
                    }
                }
            }
        }
    }
}



