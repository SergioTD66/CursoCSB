package CursoParte1;


import javax.imageio.stream.ImageInputStream;

public class Introducao {
    // Indica a declaração de uma classe. Tudo em Java deve ficar dentro de uma classe, não existem variaveis ou funções globais.

    public static void teste() {

        //declarando calculo simples, identificando x como um numero e fazendo o sistema calcular seguindo os dados apresentados
        int x = 3;// Int determina a variavel o que "x" será.
        System.out.println(x /= 3);// soma o valor de x do "int" com o proximo comando que você quiser.

        int r = 5; // Essa declaração diz que r sempre será o valor ou palavra, após "=" independente da função.
        int t = r++; // Ao colocar o "++" o sistema entende que deve monstrar o proxima valor seguinte, se r é 5 então com o ++ vira o valor 6.

        System.out.println(r);// Usando o atalho "sout" o sistema apresenta o comando para fazer o console mostrar o resultado
        // no local entre parenteses podemos colocar outras funções para ser apresentadas.

        // outros testes.
        byte j = 60;
        short k = 24;
        int l = 30;
        long m = 12L;
        long resultado = 0L;

        System.out.println(resultado += j); // resultado = 60 (0 mais 60)
        System.out.println(resultado += k);// resultado = 84 (60 mais 24)
        System.out.println(resultado /= m); // resultado = 7  (84 dividido por 12)
        System.out.println(resultado -= l); // resultado = -23(7 menos 30)
        System.out.println(resultado = -resultado); // resultado = 23 ( -(-23) )




    }


        public static void exemplo() {
// Metodo main, ponto de entrada do programa.
            System.out.println("ola mundo");
            //chamada de metodo; Camadas de métodos são feitas seguindo a forma: <objeto>.<metodo>(<parametros>);
            //Neste caso, o objeto é System.out, o método é println, e o parâmetro é o sting "Alô, mundo".

            boolean meuPrimeiroMentiroso = false;

        char meuPrimeiroChar = 'a';
        // char usa '' para ser diferente de String
        String minhaPrimeiraString = "ab";

        byte meuPrimeiroByte = 0;
        // conjunto de bytes (numeros)

        int meuPrimeiroInt =2_147_483_647;

        System.out.println(" Valor Min int/Integer ->"+Integer.MIN_VALUE );
        System.out.println(" Valor Max int/Integer ->"+Integer.MAX_VALUE );


        long meuPrimeirolong = 1L;

        float meuPrimeiroFloat = 0.0f;

        double meuPrimeiroDuooble = 0.0;

        short meuPrimeiroShotr = 0;

            System.out.println(1 + 1);
            System.out.println(100 - 99);
            System.out.println(20 * 5);
            System.out.println(20 / 5);



        }

    public static void main(String[] args) {
        teste();
    }
}

