# Project-bank-menu
🏦 Java Bank — Caixa Eletrônico
Simulação de um caixa eletrônico simples desenvolvido em Java, com foco na prática de lógica de programação e orientação a objetos.

📋 Funcionalidades

Ver saldo — exibe o saldo atual da conta
Depositar — adiciona valor ao saldo com limite de R$ 500,00 por operação
Sacar — remove valor do saldo com limite de 3 saques por sessão
Sair — encerra a sessão exibindo o resumo completo das operações


🔒 Regras de Negócio

Saldo inicial: R$ 1.000,00
Limite de depósito por operação: R$ 500,00
Limite de saques por sessão: 3 saques
Saque bloqueado caso o saldo seja insuficiente


🛠️ Tecnologias

Java
Scanner (entrada de dados via terminal)


📁 Estrutura do Projeto
ProjetoStandard/
└── CaixaEletronico.java   # Classe principal com atributos, métodos e main

▶️ Como executar

Clone o repositório

bashgit clone https://github.com/seu-usuario/java-bank.git

Compile o arquivo

bashjavac CaixaEletronico.java

Execute o programa

bashjava ProjetoStandard.CaixaEletronico

💡 Conceitos praticados

Orientação a objetos
Loop do while
Estrutura switch
Condicionais if / else aninhados
Operadores aritméticos e lógicos
Atributos e métodos de classe


📊 Exemplo de uso
--------------------------
Bem vindo ao Java Bank----
Selecione uma opção-------
1.Ver saldo atual---------
2.Depositar---------------
3.Sacar-------------------
0.Sair--------------------
--------------------------
> 1
Seu saldo atual é de 1000.0 reais.
> 3
Quanto você deseja sacar?
> 200
Saque realizado com sucesso
Seu saldo é de 800.0 reais.
> 0
O total de depósitos foram 0 depósitos.
O total de saques foram 1 saques.
Saldo final é 800.0 reais.

👨‍💻 Autor
Desenvolvido como primeiro projeto prático de Java, com foco em lógica de programação e orientação a objetos.