package br.com.mensagem.mensageriasqs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MensageriaSqsApplication

fun main(args: Array<String>) {
	runApplication<MensageriaSqsApplication>(*args)
}
