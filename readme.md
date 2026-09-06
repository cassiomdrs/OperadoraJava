# Operadora Java

Projeto de estudo desenvolvido em Java para simular um sistema de autoatendimento de uma operadora fictícia.

O programa apresenta menus, valida dados cadastrais e oferece opções relacionadas a planos, segunda via de contas, pedidos de instalação e suporte técnico.

## Funcionalidades

- Consulta de planos e assinaturas;
- Confirmação de contratação de planos;
- Consulta de segunda via de conta;
- Validação de CPF ou número de inscrição;
- Consulta de pedido de instalação;
- Suporte técnico;
- Agendamento de visita técnica;
- Escolha de dia e horário para atendimento.

## Dados fictícios

O programa utiliza os seguintes dados para simulação:

| Tipo | Valor |
|---|---|
| CPF | `1234567890` |
| Número de inscrição | `0026` |

Esses valores são armazenados como `String` para preservar os zeros à esquerda do número `0026`.

## Estrutura principal

O programa utiliza um método `main()` para executar o sistema:

```java
void main() {
    int iniciar = 1;

    menuPrincipal:
    do {
        // menu principal
    } while (iniciar == 0);
}
```

A variável `iniciar` controla a repetição do menu:

- `0`: retorna ao menu principal;
- qualquer outro valor: encerra o programa.

Ao final, uma mensagem de encerramento é exibida:

```java
IO.println("A Operadora Java está sempre à disposição! Agradecemos seu contato!");
```

## Loop utilizado

O programa utiliza o loop `do...while`.

Esse tipo de loop executa o bloco pelo menos uma vez e só depois verifica a condição:

```java
do {
    // comandos do menu
} while (iniciar == 0);
```

No início de cada repetição, `iniciar` recebe `1`. Caso o usuário escolha retornar ao menu e informe `0`, o valor passa a ser `0`, permitindo uma nova repetição.

> O programa utiliza apenas um tipo de loop. Os blocos internos são `switch` aninhados, não loops.

## Menu principal

O menu principal utiliza `switch` para direcionar o usuário:

```java
switch (opcao) {
    case 1:
        // Planos e assinaturas
        break;

    case 2:
        // Segunda via de contas
        break;

    case 3:
        // Pedido de instalação
        break;

    case 4:
        // Suporte técnico
        break;

    default:
        // Opção inválida
        break;
}
```

Cada `case` representa uma funcionalidade do sistema.

O comando `break` encerra o `case` atual e impede que a execução continue para os próximos casos.

## Switches aninhados

O projeto utiliza vários `switch` dentro de outros `switch`.

Exemplo de estrutura:

```text
Menu principal
├── Planos e assinaturas
│   └── Confirmação da contratação
├── Segunda via de contas
│   └── Confirmação do envio por e-mail
├── Pedido de instalação
└── Suporte técnico
    └── Agendamento
        ├── Validação do cadastro
        ├── Escolha do dia
        └── Escolha do horário
```

Essa estrutura permite dividir o atendimento em várias etapas.

## Planos e assinaturas

Na opção de planos, o usuário pode escolher entre quatro opções:

1. Internet de 300MB;
2. Internet de 500MB;
3. Internet de 700MB;
4. Internet de 1GB com séries e filmes.

Depois de escolher um plano, o usuário confirma ou cancela a contratação:

```java
switch (confirmar1) {
    case 1:
        IO.println("Plano confirmado com sucesso!");
        break;

    case 2:
        IO.println("Plano não confirmado.");
        break;

    default:
        // opção inválida
        break;
}
```

Cada plano possui seu próprio `switch` de confirmação.

## Segunda via de contas

O usuário informa o CPF ou o número de inscrição:

```java
String cpf = IO.readln(
    "Digite o número de inscrição ou o CPF do titular: "
);
```

A validação utiliza `String`:

```java
switch (cpf) {
    case "1234567890", "0026":
        // cadastro encontrado
        break;

    default:
        // cadastro não encontrado
        break;
}
```

Quando o cadastro é localizado, o programa informa a fatura e pergunta se o usuário deseja receber a segunda via por e-mail.

## Pedido de instalação

Na opção de instalação, o programa também valida o CPF ou o número de inscrição:

```java
String opcaoPedido = IO.readln(
    "Digite número do pedido ou CPF do titular: "
);
```

Os valores válidos são:

```java
case "1234567890", "0026":
```

O uso de `String` é importante porque mantém o valor `"0026"` exatamente como foi digitado.

## Suporte técnico

O menu de suporte apresenta cinco problemas:

1. Internet lenta;
2. Falta de internet;
3. Site específico não abre;
4. Jogo com latência alta;
5. Agendamento de visita técnica.

As quatro primeiras opções exibem orientações ao usuário.

A quinta opção inicia um fluxo mais completo de agendamento.

## Agendamento de visita técnica

O agendamento segue estas etapas:

1. Solicitação do CPF ou número de inscrição;
2. Validação do cadastro;
3. Escolha do dia;
4. Escolha do horário;
5. Exibição da confirmação.

### Escolha do dia

As opções disponíveis são:

- Segunda-feira;
- Quarta-feira;
- Sexta-feira.

O programa converte a opção numérica em texto:

```java
switch (agendamentoDiaOpcao) {
    case 1:
        agendamentoDia = "Segunda-feira";
        break;

    case 2:
        agendamentoDia = "Quarta-feira";
        break;

    case 3:
        agendamentoDia = "Sexta-feira";
        break;
}
```

### Escolha do horário

Os horários disponíveis são:

- 09:00h;
- 11:00h;
- 14:00h;
- 16:00h.

Depois das escolhas, o programa exibe:

```java
IO.println(
    "\nAgendamento realizado com sucesso!"
    + "\nDia: " + agendamentoDia
    + "\nHorário: " + agendamentoHorario
);
```

## Uso de rótulo e `continue`

O rótulo `menuPrincipal:` identifica o início do loop:

```java
menuPrincipal:
do {
    // menu
} while (iniciar == 0);
```

Ele é utilizado junto com:

```java
continue menuPrincipal;
```

Esse comando interrompe imediatamente o fluxo atual e retorna ao início do loop.

No projeto, ele é usado quando o usuário informa um dia ou horário inválido:

```java
default:
    IO.println("Horário inválido!");
    iniciar = Integer.parseInt(
        IO.readln(
            "Digite 0 para voltar ao menu principal "
            + "ou qualquer número para encerrar: "
        )
    );
    continue menuPrincipal;
```

## Tratamento de opções inválidas

Os blocos `default` tratam escolhas que não existem no menu:

```java
default:
    IO.println("Desculpe, essa opção não existe!");
    iniciar = Integer.parseInt(
        IO.readln(
            "Digite 0 para voltar ao menu principal "
            + "ou qualquer número para encerrar: "
        )
    );
    break;
```

O usuário pode:

- Digitar `0` para voltar ao menu principal;
- Digitar qualquer outro número para encerrar o programa.

## Entrada de dados

Entradas numéricas são convertidas com `Integer.parseInt()`:

```java
int opcao = Integer.parseInt(
    IO.readln("Escolha uma opção: ")
);
```

Entradas que podem conter zeros à esquerda são lidas como `String`:

```java
String cpf = IO.readln("Digite o CPF: ");
```

Essa diferença evita que o valor `0026` perca os zeros iniciais.

## Pontos importantes do aprendizado

Este projeto demonstra:

- Declaração de variáveis;
- Entrada e saída de dados;
- Conversão de `String` para `int`;
- Loop `do...while`;
- Estrutura `switch...case`;
- `switch` aninhado;
- Uso de `break`;
- Uso de `default`;
- Uso de rótulo;
- Uso de `continue`;
- Comparação de valores `String`;
- Validação de opções;
- Organização de um fluxo de atendimento.

## Conclusão

A **Operadora Java** é um projeto introdutório que demonstra como construir um sistema de atendimento em linha de comando.

A combinação de `do...while`, `switch`, `break`, `default` e `continue` permite criar diferentes caminhos de atendimento e controlar o retorno ao menu ou o encerramento do programa.

O projeto também demonstra a importância de escolher o tipo correto para cada dado. Valores como CPF e número de inscrição devem ser tratados como `String`, especialmente quando podem conter zeros à esquerda.