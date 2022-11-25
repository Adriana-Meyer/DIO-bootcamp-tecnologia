/*
Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */

import java.util.*;

public class exercicio_List_solucionaCrime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<String>();

        System.out.println("Telefonou para a vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("RESPOSTAS: " + respostas);

        Iterator<String> iterator = respostas.iterator();

        int contador = 0;
        while(iterator.hasNext()){
            String itemLista = iterator.next();

            if(itemLista.equals("s")) {
                contador++;
            }
        }
        switch (contador) {
           case (2):
                System.out.println("Suspeita");
                break;
            case (3):
            case (4):
                System.out.println("Cúmplice");
                break;
            case (5):
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}
