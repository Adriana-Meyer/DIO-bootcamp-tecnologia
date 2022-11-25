import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10: ");
        int numero = scan.nextInt();

        while(numero <= 0 || numero > 10) {
            System.out.println("Número inválido. Digite novamente: ");
            numero = scan.nextInt();
        }

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
