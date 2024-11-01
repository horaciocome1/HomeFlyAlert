package io.github.horaciocome1.homeflyalert

import io.github.horaciocome1.homeflyalert.plugins.configureHTTP
import io.github.horaciocome1.homeflyalert.plugins.configureMonitoring
import io.github.horaciocome1.homeflyalert.plugins.configureRouting
import io.github.horaciocome1.homeflyalert.plugins.configureSerialization
import io.ktor.server.application.Application

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureRouting()
}
