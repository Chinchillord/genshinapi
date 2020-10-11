package com.rack.genshinapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenshinApiApplication

fun main(args: Array<String>) {
	runApplication<GenshinApiApplication>(*args)
}
