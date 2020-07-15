#language: pt
#encoding: UTF-8
#author: daniel.gustavo
#date: 08/07/2020
#version: 1.0

    Funcionalidade: alterar dados do perfil

      @web @alteracao
        Cenario: Acessar perfil e alterar sexo
        Dado que estou logado no sistema
        E acesso meu perfil
        E altero credenciais de nome
        Entao valido a alteracao