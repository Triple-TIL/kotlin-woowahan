package com.woowahan.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChattingWebApplication

fun main(args: Array<String>) {
    runApplication<ChattingWebApplication>(*args)
}