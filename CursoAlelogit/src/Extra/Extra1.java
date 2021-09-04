package Extra;

public class Extra1 {

    public static void banana() {
        System.out.println();


        String str = "Banana";
        int tamanhoString = str.length();

        String strDeSaida = "";


        for (int i = 0; i < tamanhoString; i++) {

            strDeSaida = strDeSaida + str.charAt(i);
            //System.out.println(str.charAt(i));
            for (int j = i + 1; j < tamanhoString; j++) {
                int posicao;
                if (j > tamanhoString - 1) {
                    posicao = j - tamanhoString;
                } else {
                    posicao = j;
                }


                strDeSaida += str.charAt(posicao);
                // System.out.println(str.charAt(j));
            }
            System.out.println("\n");
        }


    }

    public static void finonnaci(){

        int numero = 9;
        int antecessor = 0;
        for(int i = 0; i < numero + 1; i++) {
            System.out.println(antecessor + i);
            antecessor++;
        }

    }
    public static void bananaRev() {
        // para i = 0
        // até i < 10
        // i = i + 1

        String input = "Banana";

        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                int posicao;
                if (j + i > input.length() - 1) {
                    posicao = input.length() - i - j;

                    if (posicao < 0) {
                        posicao *= -1;
                    }

                } else {
                    posicao = j + i;
                }
                System.out.print(input.charAt(posicao));
            }
            System.out.println();
        }
    }
    public static void bananaTeste() {
        // para i = 0
        // até i < 10
        // i = i + 1

        String input = "Banana";

        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                int posicao;
                if (j + i > input.length() - 6) {
                    posicao = input.length() - i - j;

                    if (posicao < 0) {
                        posicao *= -1;
                    }

                } else {
                    posicao = j + i;
                }
                System.out.print(input.charAt(posicao));
            }
            System.out.println();

        }
    }

    public static void bananaNovo() {
        // para i = 0
        // até i < 10
        // i = i + 1

        String input = "Banana";

        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                int posicao;
                if (j + i > input.length() - 1) {
                    posicao = input.length() - i - j;

                    if (posicao < 0) {
                        posicao *= -1;
                    }

                } else {
                    posicao = j + i;
                }
                System.out.print(input.charAt(posicao));
            }
            System.out.println();
        }
    }


    public static void bananaSubStr() {
        String input = "Banana";
        for (int i = 0; i <= input.length(); i++) {
            System.out.println(input.substring(i) + input.substring(0, i));
        }

        System.out.println("--- By Sergio");

        for (int i = 0; i <= input.length(); i++) {
            System.out.println(input.substring(input.length() - i) + input.substring(0, input.length() - i));
        }
    }

    public static void main(String[] args) {
        bananaTeste();
    }
}


