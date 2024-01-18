package com.woowahan.client.handler.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseMessage(@JsonProperty("content") val content: String) {
}