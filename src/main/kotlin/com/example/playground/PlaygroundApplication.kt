package com.example.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@SpringBootApplication
class PlaygroundApplication

fun main(args: Array<String>) {
	runApplication<PlaygroundApplication>(*args)
}
