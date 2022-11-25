//O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n.
// Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação
// por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.

// Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
// Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas.
// Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11.

// Dado um inteiro N, retorne o fatorial desajeitado de N.

import java.util.*;

public class Desafio_fatorialDesajeitado {

    public static void main(String args[]) {

        int numero = new Scanner(System.in).nextInt();
        int temp = 0;
        int resultado = 0;

        List<Integer> listaNumeros = new ArrayList<>();

        while (numero >= 3) {
            temp = numero * (numero - 1) / (numero - 2);
            numero -= 3;

            if (listaNumeros.isEmpty()){
                listaNumeros.add(temp);
            }else{
                listaNumeros.add(temp*(-1));
            }

            listaNumeros.add(numero);
            numero--;
        }

        if (numero == 2){
            temp = numero * (numero - 1);
            listaNumeros.add(temp*(-1));

        }else if (numero == 1){
            listaNumeros.add(numero*(-1));
        }

        for (int n : listaNumeros) resultado += n;

        System.out.println(resultado);
    }
}