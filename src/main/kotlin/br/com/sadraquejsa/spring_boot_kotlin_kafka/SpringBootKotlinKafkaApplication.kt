package br.com.sadraquejsa.spring_boot_kotlin_kafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinKafkaApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinKafkaApplication>(*args)
}
