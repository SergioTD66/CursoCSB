package Desafio;

import java.util.Scanner;

public class BancoOlela {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in).useDelimiter("\n");

        // Identificando as classes
        double refeicao, transporte, alimentacao;
        double gastoRef, gastoTransp, gastoAlim;

        //Sistema de registro de valores
        System.out.println("Digite qual seu saldo em refeicao");
        refeicao = conta.nextInt();
        System.out.println("Digite qual seu saldo em transporte");
        transporte = conta.nextInt();
        System.out.println("Digite qual seu saldo em alimentação");
        alimentacao = conta.nextInt();

        //Local para o sistema retornar
        char novacompra = 's';

        do {
            System.out.println("Digite a opção que deseja usar r = Refeição, t = Transporte, a = Alimentação ou c = Consultar Saldo");
            char decisao = conta.next().charAt(0);

            double resultado;
            //Operção principal do banco
            switch (decisao) {
                case 'r':
                    System.out.println("digite o valor que deseja gastar em Refeição");
                    gastoRef = conta.nextInt();
                    resultado = refeicao - gastoRef;
                    System.out.printf("A soma entre o valor R$ %.2f - R$ %.2f é igual: R$ %.2f", refeicao, gastoRef, resultado);
                    refeicao = resultado;

                    break;
                case 't':
                    System.out.println("digite o valor que deseja gastar em Transporte");
                    gastoTransp = conta.nextInt();
                    resultado = transporte - gastoTransp;
                    System.out.printf("A soma entre o valor R$ %.2f - R$ %.2f é igual: R$ %.2f", transporte, gastoTransp, resultado);
                    transporte = resultado;
                    break;

                case 'a':
                    System.out.println("digite o valor que deseja gastar em Alimentação");
                    gastoAlim = conta.nextInt();
                    resultado = alimentacao - gastoAlim;
                    System.out.printf("A soma entre o valor R$ %.2f - R$ %.2f é igual: R$ %.2f", alimentacao, gastoAlim, resultado);
                    alimentacao = resultado;
                    break;

                case 'c':
                    System.out.println("O saldo atual disponivel de Refeição é R$:" + refeicao);
                    System.out.println("O saldo atual disponivel de Transporte é R$:" + transporte);
                    System.out.println("O saldo atual disponivel de Alimentação é R$:" + alimentacao);

            }
            //Comando para retornar
            System.out.println("\nDeseja fazer mais compras ? [s,n]");
            novacompra = conta.next().charAt(0);

        } while (novacompra == 's');

    }
}