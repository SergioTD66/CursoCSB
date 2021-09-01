package CursoParte2;

/*
//Elabore um algoritmo que dada a idade de um nadador classifique-o em uma as
// seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
// Juvenil B = 14 a 17 anos
// Adultos = Maiores de 18 anos
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade = in.nextInt(); ;

        /*if (idade >= 5 && idade <= 7)
        {
            System.out.println("infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adultos");
        } else
            System.out.println("Pessoa menor de 5 anos");*/

        if (idade > 4 && idade < 8)
        {
            System.out.println("infantil A");
        } else if (idade > 9 && idade < 11) {
            System.out.println("infantil B");
        } else if (idade > 12 && idade < 13) {
            System.out.println("juvenil A");
        } else if (idade > 14 && idade < 18) {
            System.out.println("juvenil B");
        } else if (idade > 17) {
            System.out.println("Adultos");
        } else {
            System.out.println("Pessoa menor de 5 anos");
        }
        in.close();
}

}
