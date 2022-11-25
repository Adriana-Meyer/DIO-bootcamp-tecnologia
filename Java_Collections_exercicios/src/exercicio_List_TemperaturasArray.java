/* Faça um programa que receba a temperatura média dos 6
        primeiros meses do ano e armazene-as em uma lista.

        Após isto, calcule a média semestral das temperaturas e
        mostre todas as temperaturas acima desta média, e em que
        mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
        – Fevereiro e etc).
 */

import java.util.*;

public class exercicio_List_TemperaturasArray {
    public static void main(String[] args) {

        ArrayList<Double> temperaturas = new ArrayList<>();
        temperaturas.add(24.5);
        temperaturas.add(15.4);
        temperaturas.add(28.5);
        temperaturas.add(35.0);
        temperaturas.add(21.0);
        temperaturas.add(30.2);

        System.out.println(temperaturas.toString());

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        double media = (soma / temperaturas.size());
        System.out.println("Média das temperaturas: " + media + "ºC");


        Iterator<Double> iterator1 = temperaturas.iterator();

        System.out.println("Temperaturas acima da média: ");
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            Double temperatura = next;


            if (temperatura > media) {
              System.out.println(temperatura + "ºC" + verificaMesAno(temperaturas.indexOf(temperatura)));
            }
        }

    }
    public static String verificaMesAno(int mes){
        if (mes == 0){
            return (" - Janeiro");
        } else if (mes == 1) {
            return (" - Fevereiro");
        } else if (mes == 2){
                return (" - Março");
        } else if (mes == 3){
            return (" - Abril");
        } else if (mes == 4){
            return (" - Maio");
        } else if (mes == 5) {
            return (" - Junho");
        } else {
            return ("mês não mensurado.");
        }
    }
}