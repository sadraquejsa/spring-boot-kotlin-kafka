package br.com.sadraquejsa.spring_boot_kotlin_kafka.consumer

import br.com.sadraquejsa.spring_boot_kotlin_kafka.constants.GROUP_ID
import br.com.sadraquejsa.spring_boot_kotlin_kafka.constants.PAGAMENTO_TOPIC_NAME
import br.com.sadraquejsa.spring_boot_kotlin_kafka.dto.PagamentoDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class PagamentoConsumer(
    private val objectMapper: ObjectMapper
) {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [PAGAMENTO_TOPIC_NAME], groupId = GROUP_ID)
    fun processarPagamento(pagamento: PagamentoDTO) {
        logger.info("Pagamento recebido via : [${pagamento.categoria}] no valor de [${pagamento.valor}]")
    }
}