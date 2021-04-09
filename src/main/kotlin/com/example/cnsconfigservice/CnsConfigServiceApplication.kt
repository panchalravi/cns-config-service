package com.example.cnsconfigservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CnsConfigServiceApplication

fun main(args: Array<String>) {
    runApplication<CnsConfigServiceApplication>(*args)
}
