package CursoParte1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double base;
            double altura;

            System.out.println("Valor da base será");
            base = scanner.nextDouble();
            System.out.println("");
            System.out.println("Valor da altura será");
            altura = scanner.nextDouble();
            System.out.println("");

            double area = (base * altura) / 2;
            System.out.println("A areá do retangulo é essa" + area);

            scanner.close();

    }
}
