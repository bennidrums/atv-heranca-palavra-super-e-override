# Atividade de Herança, super e Override

Esse projeto foi desenvolvido durante meus estudos de Java na EBAC. A atividade simula uma compra em uma loja chamada Racoon City Store e foi usada para praticar herança e reutilização de código.

## O que o programa faz

- Permite selecionar produtos para uma compra pelo terminal.
- Trabalha com cinco tipos de produto: televisão, rádio, videogame, tablet e celular.
- Conta quantas unidades de cada tipo foram selecionadas.
- Soma os preços dos produtos e mostra o valor total da compra.
- Exibe um resumo no checkout.

## Conceitos praticados

- Herança com a classe base `Produto`
- Uso de `extends` para criar tipos específicos de produto
- Uso de `super()` para chamar o construtor da classe pai
- Encapsulamento com atributos privados e getters
- Polimorfismo usando um array de objetos do tipo `Produto`
- Uso de `instanceof` para identificar os tipos de produto
- Laços de repetição, condicionais e tratamento de `InputMismatchException`

## Como executar

1. Abra o projeto em uma IDE que suporte Java, como o IntelliJ IDEA.
2. Confira se o JDK está configurado.
3. Execute a classe `LojaRacoonCityMain`.
4. Escolha a quantidade de produtos e use o menu no terminal.

## Observação

O programa é uma simulação para estudo: não existe pagamento real nem estoque conectado a um sistema externo. Os produtos e preços estão definidos no código, e os dados da compra ficam na memória durante a execução.

## Objetivo

Praticar como uma classe mais específica pode herdar atributos e comportamentos de uma classe base, aproveitando o construtor da classe pai e mantendo o código organizado.
