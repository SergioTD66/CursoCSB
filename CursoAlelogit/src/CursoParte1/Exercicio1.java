package CursoParte1;

public class Exercicio1 {
    public static void main(String[] args) {
/*
Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo
com que o valor que está em Y passe para Z e vice-versa.
Ao final, escrever os valores que ficaram armazenados nas variáveis.
 */
        /*
        Identificando o exercicio
        1º- O exercicio pede um valor e uma variavel, logo teremos um "int" determinando
        uma variavel e etribuindo um valor: int y = 99 e x = 11.
        2º- O exercicio pede que uma variavel seja interligada com outra e esta fique disponivel para
        fazer outra interligação, ou seja, precisa de uma "int" com o valor 0.
        3º- portanto criar duas variaveis com valor e uma terceira sem para fazer a tranferencia entre as duas.

         */
        int y = 99; //primeira variavel.
        int z = 11; //segunda variavel.
        int coringa = 0; //variavel extra.

        coringa = y; //variavel extra pega a primeira para deixa-la livre.
        y = z; // variavel y tranfere dados para variavel z
        z = coringa; // variavel z pega os dados da variavel extra.

        System.out.println(y); //neste momento y esta com os dados do z, ja que foi fornecido para o extra
        System.out.println(z); //Como z disse que era igual extra com os dados de y, então z tem os dados de y

            }
}
