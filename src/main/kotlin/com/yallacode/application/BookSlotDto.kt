package com.yallacode.application

import lombok.Builder
import lombok.Data

@Data
@Builder
class BookSlotDto(

    var parkingLotId: Int,
    var slotType: String
)