import java.util.ArrayList;
import java.util.Random;

public class exercicio_Map_Dados {
    public static void main(String[] args) {
        Random dado = new Random();

        ArrayList<Integer> lancamentosDado = new ArrayList<>();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;

        while (lancamentosDado.size() < 100) {
            int valor = dado.nextInt(7);

            if(valor == 1){
                lancamentosDado.add(valor);
                num1++;
            } else if(valor == 2){
                lancamentosDado.add(valor);
                num2++;
            } else if(valor == 3){
                lancamentosDado.add(valor);
                num3++;
            } else if(valor == 4){
                lancamentosDado.add(valor);
                num4++;
            } else if(valor == 5) {
                lancamentosDado.add(valor);
                num5++;
            } else if(valor == 6){
                    lancamentosDado.add(valor);
                    num6++;
            }

        }

        System.out.println("Tamanho: " + lancamentosDado.size());
        System.out.println(lancamentosDado);
        System.out.println("Quantidade de 1: " + num1);
        System.out.println("Quantidade de 2: " + num2);
        System.out.println("Quantidade de 3: " + num3);
        System.out.println("Quantidade de 4: " + num4);
        System.out.println("Quantidade de 5: " + num5);
        System.out.println("Quantidade de 6: " + num6);


    }
}
