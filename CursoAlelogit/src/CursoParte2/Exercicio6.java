package CursoParte2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
    Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
    O algoritmo deverá perguntar qual é a escolha do jogador 1
    (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2.
    No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
    * */

//        System.out.println(" Jogador 1 - Digite 1 para PEDRA, 2 para PAPEL ou 3 para TESOURA: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Jogador 2 - Digite 1 para PEDRA, 2 para PAPEL ou 3 para TESOURA: ");
//        int b = scanner.nextInt();
//
//        if (a == b)
//            System.out.println("Empate");
//        else if (a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1)
//            System.out.println("Jogador 2 venceu!");
//        else
//            System.out.println("Jogador 1 venceu!");

            System.out.println(" Jogador 1 - Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA: ");
            int jogador1 = scanner.nextInt();

            System.out.println("Jogador 2 - Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA: ");
            int jogador2 = scanner.nextInt();

            if (jogador1 == jogador2)
                System.out.println("Empate");
            else if (jogador1 - jogador2 == -2 || jogador1 - jogador2 == 1)
                System.out.println("Jogador 1 venceu!");
            else
                System.out.println("Jogador 2 venceu!");


            scanner.close();

        }


/* int jogador1;
        int jogador2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 1 para pedra");
        System.out.println("Digite 2 para papel");
        System.out.println("Digite 3 para tesoura");
        System.out.println("Digite um das escolhas");
         jogador1 = in.nextInt();
         switch (jogador1){
             case 1:
             System.out.println("Jogador1 escolheu pedra");
             break;
             case 2:
                 System.out.println("Jogador1 escolheu papel");
                 break;
             case 3:
                 System.out.println("Jogador1 escolheu tesoura");
                 break;
             default:
                 System.out.println("não existe essa opção");
                 break;
         }
         jogador2 = (int)(Math.random()*3 + 1);
        switch (jogador2){
            case 1:
                System.out.println("Jogador1 escolheu pedra");
                break;
            case 2:
                System.out.println("Jogador1 escolheu papel");
                break;
            case 3:
                System.out.println("Jogador1 escolheu tesoura");
                break;
            default:
                System.out.println("não existe essa opção");
                break;
        }*/
    }

