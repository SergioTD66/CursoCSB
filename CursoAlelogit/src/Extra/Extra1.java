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
    public static void main(String[] args) {
        finonnaci();
    }
}


