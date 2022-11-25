import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int fatorial = numero;

        for(int i = (numero-1); i > 0; i--){
            fatorial = fatorial * i;
        }

        System.out.println(numero + "! = " + fatorial);
    }
}

