package com.woowahan.delivery.store.infrastructure

import com.woowahan.delivery.store.domain.Store
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository: JpaRepository<Store, Long>