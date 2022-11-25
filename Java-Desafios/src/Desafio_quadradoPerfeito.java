// Dado um inteiro N, retorne a menor quantidade de números quadrados perfeitos cuja soma seja N.
// Um quadrado perfeito é um número inteiro cuja raiz quadrada é um valor exato (inteiro).
// Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio_quadradoPerfeito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int entradaUsuario = scan.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= entradaUsuario; i++ ){
            if (ehQuadradoPerfeito(i)) {
                numeros.add(i);
            }
        }

        System.out.println(numeros);
        ArrayList<ArrayList<Integer> > arrayResultado = somaCombinatoria(numeros, entradaUsuario);

        // imprimir todas as combinações em arrayResultado

        for (int i = 0; i < arrayResultado.size(); i++) {

            System.out.print("(");
            for (int j = 0; j < arrayResultado.get(i).size(); j++) {
                System.out.print(arrayResultado.get(i).get(j) + " ");
            }
            System.out.print(") ");
        }

        int resultado = arrayResultado.get(arrayResultado.size() - 1 ).size();
        System.out.println(resultado);
    }

    //Verifica se é um quadrado perfeito
    static boolean ehQuadradoPerfeito(double num) {
       double raizQuadrada = Math.sqrt(num);
       return ((raizQuadrada - Math.floor(raizQuadrada)) == 0);
    }

    static ArrayList<ArrayList<Integer> > somaCombinatoria(ArrayList<Integer> arr, int soma2){
        ArrayList<ArrayList<Integer> > arrayNaoOrdenado = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        encontraNumeros(arrayNaoOrdenado, arr, soma2, 0, temp);
        return arrayNaoOrdenado;

    }
    static void encontraNumeros(ArrayList<ArrayList<Integer> > resultado,
                    ArrayList<Integer> array, int soma, int index,
                    ArrayList<Integer> arraytemporario) {
        if (soma == 0) {
            resultado.add(new ArrayList<>(arraytemporario));
            return;
        }

        for (int i = index; i < array.size(); i++) {
            if ((soma - array.get(i)) >= 0) {
                arraytemporario.add(array.get(i));
                encontraNumeros(resultado, array, soma - array.get(i), i, arraytemporario);
                arraytemporario.remove(array.get(i));
            }
        }
    }
}
