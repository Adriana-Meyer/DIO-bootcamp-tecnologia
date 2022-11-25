//Dado um número e o seu limite , encontre a soma de todos os múltiplos do número até o seu limite.

import java.util.Scanner;

public class Desafio_numerosMultiplos {
    public static void main(String[] args) {

       int numero, limite;
       int resultado = 0;

       Scanner input = new Scanner(System.in);
       numero = input.nextInt();
       limite = input.nextInt();

       for (int i = numero; i <= limite; i++){
             if(i % numero == 0){
                resultado = resultado + i;
             }
       }

    System.out.println(resultado);

    }
}
