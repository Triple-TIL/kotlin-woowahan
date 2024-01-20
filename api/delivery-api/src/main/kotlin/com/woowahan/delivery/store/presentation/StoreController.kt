package com.woowahan.delivery.store.presentation

import com.woowahan.delivery.store.application.StoreService
import com.woowahan.delivery.store.presentation.dto.StoreResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@Tag(name = "StoreDetailPageController", description = "상점 상세 페이지 컨트롤러")
@RestController
class StoreController(
    val storeService: StoreService
) {

    @GetMapping("/display/stores/{storeId}")
    fun list(@PathVariable storeId: Long): StoreResponse {
        return StoreResponse(
            storeId = 1L,
            storeName = ""
        )
    }
}