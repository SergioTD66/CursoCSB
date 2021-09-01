import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
//Construa um algoritmo usando uma estrutura de repetição que calcule
// o fatorial de um número.
        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual o numero que deseja saer o fatorial?");
        int numero = scanner.nextInt();

        long fatorial = 1;

        while (numero >1) {
            fatorial = fatorial*numero;
            numero= numero-1;

        }
        System.out.printf("Digite o %d", fatorial);

        scanner.close();
    }
}
