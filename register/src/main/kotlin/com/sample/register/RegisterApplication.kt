package com.sample.register

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class RegisterApplication

fun main(args: Array<String>) {
    runApplication<RegisterApplication>(*args)
}
