package br.com.sadraquejsa.spring_boot_kotlin_kafka.dto

import java.time.LocalDateTime
import java.util.Date

data class PagamentoDTO(val id: String, val valor: Double, val data: LocalDateTime, val categoria: String) {
}