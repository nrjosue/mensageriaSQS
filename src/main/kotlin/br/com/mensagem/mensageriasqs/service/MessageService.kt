package br.com.mensagem.mensageriasqs.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Service

@Service
class MessageService(
    private val queueMessagingTemplate: QueueMessagingTemplate
) {

    @Value("\${cloud.aws.end-point.url}")
    private lateinit var destinationName: String

    fun send(msg: String){
        queueMessagingTemplate.send(destinationName, MessageBuilder.withPayload(msg).build())
    }

    @SqsListener("alura-sqs")
    fun getMessage(msg: String){
        println("===============================================================")
        println("Essa é a mensagem consumida ${msg}")
    }

}