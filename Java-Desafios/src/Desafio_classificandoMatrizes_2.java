// Dado um array inteiro nums, mova todos os inteiros pares no início do array
// seguido por todos os inteiros ímpares. A primeira linha da entrada deverá conter um inteiro que
// corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Desafio_classificandoMatrizes_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = scanner.nextInt();
        int[] nums = new int[tamanhoArray];

        for ( int i = 0; i < tamanhoArray; i++) {
            nums[i] = scanner.nextInt();
        }

        LinkedHashSet<Integer> novoArray = new LinkedHashSet<>();

        for (int num : nums) {
            if ((num % 2) == 0) {
                novoArray.add(num);
            }
        }

        for (int num : nums) {
            if ((num % 2) != 0) {
                novoArray.add(num);
            }
        }

        // Resultado:
        for (int numero : novoArray) {
            System.out.println(numero);
        }

    }
}
