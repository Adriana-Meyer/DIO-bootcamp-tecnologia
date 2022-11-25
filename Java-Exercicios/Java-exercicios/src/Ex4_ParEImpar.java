import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int repeticoes;
        int numDigitado;
        int numPares = 0;
        int numImpares = 0;

        System.out.println("Quantos números você deseja informar? ");
        repeticoes = scan.nextInt();

        int contador = 0;
        do {
            System.out.println("Digite um número: ");
            numDigitado = scan.nextInt();

            if (numDigitado % 2 == 0){
                numPares += 1;
            } else {
                numImpares += 1;
            }
            contador++;

        } while(contador < repeticoes);

        System.out.println("Quantidade de números pares: " + numPares);
        System.out.println("Quantidade de números ímpares: " + numImpares);
    }
}
