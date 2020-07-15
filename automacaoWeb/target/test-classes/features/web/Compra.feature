#language: pt
#encoding: UTF-8
#author: daniel.gustavo
#date: 14/07/2020
#version: 1.0

  Funcionalidade: compra com cartao de credito

    @web @compra
      Cenario: realizar compra com sucesso utilizando cartao de credito
      Dado que estou logado no sistema
      E que clico no produto escolhido
      E acesso o carrinho de compras
      Quando preencho informaçoes de pagamento
      Entao valido a compra finalizada