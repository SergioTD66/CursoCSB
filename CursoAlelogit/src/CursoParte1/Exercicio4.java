package CursoParte1;

import java.util.Scanner;

public class Exercicio4 {
    //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
    // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double brancos, nulos, validos;

        System.out.println("valor de brancos");
        brancos = scanner.nextDouble();
        System.out.println("");
        System.out.println("valor nulos");
        nulos = scanner.nextDouble();
        System.out.println("");
        System.out.println("valor validos");
        validos = scanner.nextDouble();
        System.out.println("");

        double total_ele = (brancos + nulos + validos) ;
        System.out.println("O total de eleitores foi" + total_ele);
        System.out.println("");

        double porcetagembranco = (brancos * 100) / total_ele;
        System.out.println("A porcetagem de brancos foi: %.2f%%%" + porcetagembranco);
        double porcetagemnulos = (nulos * 100) / total_ele;
        System.out.println("A porcetagem de nulos foi: %.2f%%%" + porcetagemnulos);
        double porcetagemvalidos = (validos * 100) / total_ele;
        System.out.println("A porcetagem de validos foi:\n12" + porcetagemvalidos);


        scanner.close();

    }
}
