//Receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0,
// usando recursividade.

import java.util.*;

public class Desafio_chamadaRecursiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = leitor.nextInt();

        int resultado = somatorio(N);

        System.out.println(resultado);
    }

    //Método que calcula o somatório de um número usando recursividade.

    public static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}