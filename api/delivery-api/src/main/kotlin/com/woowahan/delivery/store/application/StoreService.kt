package com.woowahan.delivery.store.application

import com.woowahan.delivery.store.domain.Store
import com.woowahan.delivery.store.infrastructure.StoreRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
@Transactional
class StoreService(
    private val storeRepository: StoreRepository
) {

    fun findByStoreId(storeId: Long): Optional<Store> {
        return storeRepository.findById(storeId)
    }



}