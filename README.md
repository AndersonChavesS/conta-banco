# Desafio Conta de Banco

## Sobre

Primeiro desafio proposto para o Bootcamp Bradesco - Java Cloud Native. Desafio de projeto "Simulando uma conta bancária atraves do terminal/console". **Nível básico**

## Descrição do desafio

1. Crie o projeto ContaBanco que receberá dados via terminal, contendo as características de conta em banco conforme atributos abaixo:

| Atributo    | Tipo    | Exemplo      |
|:------------|:--------|:-------------|
| numeroConta | int     | 1021         |
| agencia     | String  | 067-8        |
| nomeCliente | String  | MARIO ANDRADE|
| saldo       | double  | 237.48       |

2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação sera solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 (depois ENTER para o próximo campo)

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [nomeCliente]! Obrigado por criar uma conta em nosso banco. Sua agência é [agencia], conta [numeroConta]. Seu saldo de R$[saldo] já está disponível para saque.

Os campos em [] devem ser alterados pelas informações que forem inseridas pelos usuários.
