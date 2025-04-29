package br.com.sadraquejsa.spring_boot_kotlin_kafka.service

import br.com.sadraquejsa.spring_boot_kotlin_kafka.dto.PagamentoDTO
import br.com.sadraquejsa.spring_boot_kotlin_kafka.producer.PagamentoProducer
import org.springframework.stereotype.Service

@Service
class PagamentoService (
    private val pagamentoProducer: PagamentoProducer
) {

    fun novoPagamento(pagamento: PagamentoDTO) {
        pagamentoProducer.sendNovoPagamento(pagamento)
    }
}