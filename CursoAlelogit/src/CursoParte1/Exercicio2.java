package CursoParte1;

import java.util.Scanner;

public class Exercicio2 {


    public static void exemplo1() {
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();

        System.out.println("O antecessor do numero digitado é");
        System.out.println(numero - 1);

        //mostrar o antecessor

        scanner.close();
    }


    public static void main(String[] args) {
        exemplo1();
    }
}

