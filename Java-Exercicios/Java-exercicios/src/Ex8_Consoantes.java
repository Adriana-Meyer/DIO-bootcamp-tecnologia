import java.util.Scanner;

public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int contador = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[contador] = letra;
                quantConsoantes += 1;
            }
            contador++;

        }while(contador < consoantes.length);

        System.out.println("Quantidade de consoantes: " + quantConsoantes);
        System.out.print("As consoantes são: ");

        //ForEach
        for (String consoante : consoantes) {
            if (consoante != null){
                System.out.print(consoante + " ");
            }

        }
    }
}
