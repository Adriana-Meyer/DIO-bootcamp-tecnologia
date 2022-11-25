// Dado um array inteiro nums, mova todos os inteiros pares no início do array
// seguido por todos os inteiros ímpares. A primeira linha da entrada deverá conter um inteiro que
// corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.

import java.util.Scanner;

public class Desafio_classificandoMatrizes_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamanhoArray = scanner.nextInt();

        int [] numeros = new int[tamanhoArray];
        int primeiroDoIndex = 0;

        for (int i = 0; i < tamanhoArray; i++){
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < tamanhoArray; i++) {
            if(numeros[i] % 2 == 0) {
                int varAuxiliar = numeros[primeiroDoIndex];
                numeros[primeiroDoIndex] = numeros[i];
                numeros[i] = varAuxiliar;
                primeiroDoIndex++;
            }
        }

        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}