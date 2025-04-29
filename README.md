# spring-boot-kotlin-kafka
Projeto de demonstração das tecnologias Spring Boot, Kotlin e Kafka

## Funcionalidades

- Registra pagamentos

## Documentação da API

#### Registra o pagamento

```http
  POST /pagamento
```

| Parâmetro   | Tipo     | Descrição                                                 |
| :---------- |:---------|:----------------------------------------------------------|
| `id` | `String` | **Obrigatório**. A chave identificadora do pagamento             |
| `valor` | `Double` | **Obrigatório**. Valor do pagamento                           |
| `data` | `LocalDateTime`   | **Obrigatório**. Data em que o pagamento foi realizado|
| `categoria` | `String` | **Obrigatório**. Categoria do pagamento                   |

## Autores

- [Sadraque Jose](https://www.github.com/sadraquejsa)
