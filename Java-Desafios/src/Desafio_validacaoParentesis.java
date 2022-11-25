//Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine
// se é uma determinada string válida. Uma string é considerada válida se:
// Caracteres de abertura devem ser fechadas pelo mesmo tipo, com uma chave correspondente.
// Uma string vazia é considerada válida.

import java.util.Scanner;

public class Desafio_validacaoParentesis {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }
    public static boolean ehValido(String s) {
        char[] letrasPalavra = s.toCharArray();

        String primeiro = String.valueOf(letrasPalavra[0]);
        String ultimo = String.valueOf(letrasPalavra[letrasPalavra.length-1]);

        if(primeiro.equals("(") && ultimo.equals(")")){
            return true;
        } else if (primeiro.equals("[") && ultimo.equals("]")){
            return true;
        } else if (primeiro.equals("{") && ultimo.equals("}")){
            return true;
        } else if (primeiro.equals(" ") && ultimo.equals(" ")){
            return true;
        } else {
            return false;
        }
    }
}
