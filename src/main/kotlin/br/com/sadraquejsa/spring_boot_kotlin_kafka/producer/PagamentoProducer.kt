package br.com.sadraquejsa.spring_boot_kotlin_kafka.producer

import br.com.sadraquejsa.spring_boot_kotlin_kafka.constants.PAGAMENTO_TOPIC_NAME
import br.com.sadraquejsa.spring_boot_kotlin_kafka.dto.PagamentoDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class PagamentoProducer (
    private val kafkaTemplate: KafkaTemplate<String, PagamentoDTO>,
    private val objectMapper: ObjectMapper) {

    fun sendNovoPagamento(pagamento: PagamentoDTO) {
        kafkaTemplate.send(PAGAMENTO_TOPIC_NAME, pagamento);
    }
}