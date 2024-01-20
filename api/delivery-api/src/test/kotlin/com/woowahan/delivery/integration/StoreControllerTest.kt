package com.woowahan.delivery.integration

import com.fasterxml.jackson.databind.ObjectMapper
import com.woowahan.delivery.store.presentation.dto.StoreResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
@AutoConfigureMockMvc
class StoreControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @Autowired
    private lateinit var context: WebApplicationContext

    @DisplayName("상품 상세 정보와 메뉴를 조회 할 수 있다.")
    @Test
    fun test_store_detail_and_menus() {
        val storeId = 1L
        val url = "/display/stores/$storeId"

        val mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get(url))
            .andExpect(status().isOk)
            .andReturn()

        val storeResponse = objectMapper.readValue(mvcResult.response.contentAsString, StoreResponse::class.java)
        assertThat(storeResponse).isNotNull
        assertThat(storeResponse.storeId).isEqualTo(storeId)
    }

}