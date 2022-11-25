import java.util.Random;
import java.util.Scanner;

public class Ex10_MatrizMultidimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for(int linhas = 0; linhas < matriz.length; linhas++) {
            for( int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                System.out.println("Numero: ");
                matriz[linhas][colunas] = scan.nextInt();
            }
        }

        System.out.println("MATRIZ: ");
        for (int[] linha : matriz ) {
            for (int itemColuna : linha) {
                System.out.print(itemColuna + " ");
            }
            System.out.println(); //pular linha
        }


    }
}

/*Solução alternativa
    Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++) {
            for( int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

 */
