# Desafio iBank

Com base nos conceitos discutidos sobre dependencia e associações como agregação, composição, implementação e herança; implemente a hieraquia de classes abaixo e suas respectivas operações.


```mermaid
    classDiagram
    Conta ..> Agencia
    Conta o..> Cliente
    Conta o..> Cartao
    Cartao ..> Cliente
    CartaoDeCredito <|.. Cartao

    class CartaoDeCredito {
        <<interface>>
        + pagamentoAPrazo(valor)
    }

    class Agencia {
        - numero
        - endereco
    }

    class Conta {
        - numero
        - saldo
        - limite
        + exibeSaldo()
        + exibeLimite()
    }

    class Cartao {
        + saque(valor)
        + deposito(valor)
    } 

    class Cliente {
        - nome        
    }
```