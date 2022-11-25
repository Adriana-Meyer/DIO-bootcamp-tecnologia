//Dada uma estrutura de vetor A [a1, a2...an], percorra o vetor fazendo as comparações de A[N] = X.
// Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso.

//Considere um array de 10 elementos do tipo inteiro:
//Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.

//Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array.
//Caso contrario, retorne um texto dizendo que o número não foi encontrado.

import java.util.Scanner;

public class Desafio_buscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();

        boolean temNum = false;

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for(int i = 0 ; i < elementos.length; i++){
            if(num == elementos[i]) {
                System.out.println("Achei " + num + " na posicao " + i);
                temNum = true;
                break;
            }
        }

        if (!temNum) {
            System.out.println("Numero " + num + " nao encontrado!");
        }
    }
}

