package ProjetoStandard;

import java.util.Scanner;

public class CaixaEletronico {

    //Scanner Input
    Scanner scanner = new Scanner(System.in);

    //Atributos CaixaEletronico
    double saldoInicial;
    int saqueRealizado;
    int totalSaques;
    int totalDepositos;


    //Atributos Imput
    int imputInicial;
    double scannerDepositar;
    double scannerSacar;


    public void menuInicial() {
        do{
            System.out.println("--------------------------");
            System.out.println("Bem vindo ao Java Bank----");
            System.out.println("Selecione uma opção-------");
            System.out.println("1.Ver saldo atual---------");
            System.out.println("2.Depositar---------------");
            System.out.println("3.Sacar-------------------");
            System.out.println("0.Sair--------------------");
            System.out.println("--------------------------");
            imputInicial = scanner.nextInt();
            System.out.println("Você selecionou a opção " + imputInicial);

            switch (imputInicial) {
                case 1:
                    verSaldo();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
            }
        }while (imputInicial != 0);
            sair();
    }


    public void verSaldo() {
        System.out.println("--------------------------");
        System.out.println("Seu saldo atual é de " + saldoInicial + " reais.");
    }


    public void depositar() {
        System.out.println("Quanto você deseja depositar ?");
        scannerDepositar = scanner.nextDouble();

        if (scannerDepositar <= 500.00) {
            saldoInicial = saldoInicial + scannerDepositar;
            totalDepositos++;
            System.out.println("Você depositou " + scannerDepositar + " reais");

        }else {
            System.out.println("Você excedeu o valor limite permitido de deposito");
        }
        System.out.println("--------------------------");
        System.out.println("Seu saldo atual é de " + saldoInicial + " reais.");
    }


    public void sacar() {
        System.out.println("Quanto você deseja sacar? ");
        scannerSacar = scanner.nextDouble();

        if (saqueRealizado < 3) {
            if (scannerSacar <= saldoInicial) {
                saldoInicial = saldoInicial - scannerSacar;
                saqueRealizado++;
                totalSaques++;
                System.out.println("Saque realizado com sucesso");
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Limite de saques atingido, tente amanhã");
        }
        System.out.println("--------------------------");
        System.out.println("Seu saldo é de " + saldoInicial + " reais.");
    }


    public void sair(){
        System.out.println("Você realizou " + totalDepositos + " depósitos.");
        System.out.println("Você realizou " + totalSaques + " saques.");
        System.out.println("Saldo final é " + saldoInicial + " reais.");
    }

    //Código executável
    public static void main(String[] args) {
            //Criando o objeto
            CaixaEletronico caixaEletronico = new CaixaEletronico();

            //Inicializando o Scanner
            Scanner scanner = new Scanner(System.in);

            //Inicializando os atributos (características)
            //Valor Inicial
            caixaEletronico.saldoInicial = 1000.00;

            //Chamando a função Menu Iniciar
            caixaEletronico.menuInicial();
}
}

