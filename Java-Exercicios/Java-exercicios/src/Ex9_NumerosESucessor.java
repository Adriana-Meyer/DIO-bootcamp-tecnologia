import java.util.Random;
import java.util.Scanner;

public class Ex9_NumerosESucessor {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[20];

        int contador = 0;
        do{
            //System.out.println("Digite um número entre 0 e 100: ");
            //numeros[contador] = scan.nextInt();

            numeros[contador] = random.nextInt(100);

            contador++;

        }while(contador < numeros.length);

        System.out.print("Números: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores: ");
        for (int numero : numeros) {
            System.out.print((numero+1) + " ");
        }
    }
}

/*
SOLUÇÃO ALTERNATIVA
    import java.util.Random;

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

 */