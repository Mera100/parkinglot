package com.yallacode.application

import com.yallacode.domain.model.SlotType
import lombok.Builder
import lombok.Data

@Data
@Builder
class BookSlotDto(

    var parkingLotId: Long,
    var slotType: SlotType
)