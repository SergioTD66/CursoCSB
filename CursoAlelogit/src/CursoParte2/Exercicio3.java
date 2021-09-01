package CursoParte2;


import java.util.Scanner;

public class Exercicio3 {
    /*
    Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
    Escreva um algoritmo que determina o maior também.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o 1º numero");
        int primeiroN = in.nextInt();
        System.out.println("Digite o 2º numero");
        int segundoN = in.nextInt();

        if (primeiroN == segundoN){
            System.out.println("Os numeoros sao iguais");
        }else if (primeiroN > segundoN){
            System.out.println("O primeiro numero é menor");
        }else{
            System.out.println("O segundo numero é manor");
        }

        in.close();

    }
}
