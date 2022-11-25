// Dado um inteiro N, retorne a menor quantidade de números quadrados perfeitos cuja soma seja N.
// Um quadrado perfeito é um número inteiro cuja raiz quadrada é um valor exato (inteiro).
// Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class Desafio_quadradoPerfeito_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(in);

        List<Integer> quadradosPerfeitos = new ArrayList<>();

        System.out.println("Digite um número: ");
        int entradaUsuario = scanner.nextInt();

        for (int i = 1; i < entradaUsuario; i++) {
            if (verificaQuadradoPerfeito(i)) quadradosPerfeitos.add(0, i);
        }
        System.out.println(quadradosPerfeitos);

        int tamanhoListaQuadrados = quadradosPerfeitos.size();
        int resultado = entradaUsuario;

        for (int i = 0; i < tamanhoListaQuadrados; i++) {

            int varAuxiliar = entradaUsuario; //12
            int contAuxiliar = 0;

            for (int x = i; x < tamanhoListaQuadrados; x++) {
                while((varAuxiliar - quadradosPerfeitos.get(x)) >= 0){
                    varAuxiliar = varAuxiliar - quadradosPerfeitos.get(x);
                    contAuxiliar ++;
                }
            }

            if (contAuxiliar < resultado) resultado = contAuxiliar;
        }

        System.out.println(resultado);

    }
    public static boolean verificaQuadradoPerfeito(int valor) {
        double raizQuadrada = Math.sqrt(valor);
        return ((int) raizQuadrada == raizQuadrada);
    }
}