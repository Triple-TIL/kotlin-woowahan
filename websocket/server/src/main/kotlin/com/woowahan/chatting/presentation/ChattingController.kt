package com.woowahan.chatting.presentation

import com.woowahan.chatting.domain.ChattingMessage
import com.woowahan.chatting.presentation.dto.ChattingResponse
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils

@Controller
class ChattingController {

    private val log = KotlinLogging.logger {}

    @MessageMapping("/chatting-message")
    @SendTo("/topic/chatting")
    fun chatting(chattingMessage: ChattingMessage): ChattingResponse {
        log.info { ">>> Received Message: ${chattingMessage.message}" }
        return ChattingResponse(HtmlUtils.htmlEscape(chattingMessage.message))
    }
}