package CursoParte1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o numero de eleitores da comarca");
        int numeroDeEleitores = in.nextInt();

        System.out.println("digite o numero de votos validos");
        int totalDadosValidos = in.nextInt();

        System.out.println("digite o numero total de votos brancos");
        int totalVotosBrancos = in.nextInt();

        System.out.println("digite o nimero total de votos nulos");
        int totalVotosNulos = in.nextInt();


        System.out.println("O percentual de votos validos é:" + totalDadosValidos * 100.00 / numeroDeEleitores);


    }

}
