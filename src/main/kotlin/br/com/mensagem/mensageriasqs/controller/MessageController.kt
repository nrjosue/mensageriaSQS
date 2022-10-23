package br.com.mensagem.mensageriasqs.controller

import br.com.mensagem.mensageriasqs.model.Messagem
import br.com.mensagem.mensageriasqs.service.MessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.function.EntityResponse

@RestController
@RequestMapping("/messages")
class MessageController(
    private val messageService: MessageService
) {

    @GetMapping()
    fun send() {
         messageService.send("Mensagem vinda do app")
    }
}