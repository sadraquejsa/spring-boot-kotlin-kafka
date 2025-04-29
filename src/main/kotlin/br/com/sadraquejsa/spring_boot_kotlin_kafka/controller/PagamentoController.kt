package br.com.sadraquejsa.spring_boot_kotlin_kafka.controller

import br.com.sadraquejsa.spring_boot_kotlin_kafka.dto.PagamentoDTO
import br.com.sadraquejsa.spring_boot_kotlin_kafka.service.PagamentoService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pagamento")
class PagamentoController(
    private val pagamentoService: PagamentoService) {

    @PostMapping
    fun novoPagamento(@RequestBody pagamento: PagamentoDTO) {
        pagamentoService.novoPagamento(pagamento);
    }
}