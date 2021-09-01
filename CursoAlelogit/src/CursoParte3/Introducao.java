package CursoParte3;

import javax.xml.stream.events.StartElement;

public class Introducao {
    public static void main(String args[]){
        int contagem = 1;

        while (contagem <= 10) {
            System.out.println(contagem);
            // contagem = contagem + 1;
            contagem++;
        }

        int numero = 11;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 10);


    }
}
