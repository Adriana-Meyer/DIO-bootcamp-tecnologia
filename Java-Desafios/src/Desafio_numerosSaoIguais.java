// Dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”.
// Caso contrário, retorne "Nao sao iguais!”.

import java.util.Scanner;

public class Desafio_numerosSaoIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A, B;

        A = leitor.nextInt();
        B = leitor.nextInt();

        if (A == B){
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}

