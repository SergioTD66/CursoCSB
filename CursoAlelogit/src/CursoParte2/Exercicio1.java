package CursoParte2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite um numero");
        int numero = in.nextInt();

            if (numero % 2 == 0) System.out.println("É um numero par");
        else {
            System.out.println("É um numero impar");
        }

        in.close();
    }
}
