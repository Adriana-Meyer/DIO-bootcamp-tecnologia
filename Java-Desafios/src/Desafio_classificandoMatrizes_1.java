//Dado um array inteiro nums, mova todos os inteiros pares no início do array
// seguido por todos os inteiros ímpares. A primeira linha da entrada deverá conter um inteiro que
// corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.

import java.util.LinkedHashSet;
import java.util.Scanner;
import static java.lang.System.out;

public class Desafio_classificandoMatrizes_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamanhoLista = scanner.nextInt();

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        for (int i = 0; i < tamanhoLista; i++){
            numeros.add(scanner.nextInt());
        }

        for (int num : numeros) if ((num % 2) == 0) out.println(num);
        for (int num : numeros) if ((num % 2) != 0) out.println(num);

    }
}
