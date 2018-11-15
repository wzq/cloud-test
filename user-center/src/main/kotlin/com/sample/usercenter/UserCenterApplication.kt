package com.sample.usercenter

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@EnableDiscoveryClient
@SpringBootApplication
class UserCenterApplication

fun main(args: Array<String>) {
    runApplication<UserCenterApplication>(*args)
}


@RestController
class UserCenterController{

    @Autowired
    lateinit var client: DiscoveryClient

    @RequestMapping("/user/{appName}")
    fun getUser(@PathVariable appName:String): String? {
        client.getInstances(appName).forEach {
            println(it.uri)
        }
        return "hello word"
    }
}