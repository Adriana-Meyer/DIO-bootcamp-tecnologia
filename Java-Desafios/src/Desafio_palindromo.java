//construa uma função que recebe uma String e identifique se a mesma é um palíndromo,
// ou seja, se a String é igual a ela mesma invertida.

//Exemplo: Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
//Logo, NÃO é um Palíndromo.
//Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.

import java.util.Scanner;

public class Desafio_palindromo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();

        char[] letrasPalavra = palavra.toCharArray();

        String palavraInvertida = "";
        for (int i = letrasPalavra.length - 1; i >= 0; i--){
           palavraInvertida = palavraInvertida + letrasPalavra[i];
        }

        String resultado = String.valueOf(palavra.equals(palavraInvertida));
        System.out.println(resultado.toUpperCase());

    }
}
