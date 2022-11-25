/*
Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265

[x] Crie um dicionário e relacione os estados e suas populações;
[x] Substitua a população do estado do RN por 3.534.165;
[x] Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
[x] Exiba a população PE;
[x] Exiba todos os estados e suas populações na ordem que foi informado;
[x] Exiba os estados e suas populações em ordem alfabética;
[x] Exiba o estado com o menor população e sua quantidade;
[x] Exiba o estado com a maior população e sua quantidade;
[x] Exiba a soma da população desses estados;
[x] Exiba a média da população deste dicionário de estados;
[x] Remova os estados com a população menor que 4.000.000;
[x] Apague o dicionário de estados;
[x] Confira se o dicionário está vazio.

 */

import java.util.*;

public class exercicio_Map_EstadosBr {
    public static void main(String[] args) {

        System.out.println("\n------ Crie um dicionário e relacione os estados e suas populações -----\n");
        Map<String, Integer> estadosBrasileiros = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosBrasileiros.toString());

        System.out.println("\n------ Substitua a população do estado do RN por 3.534.165 -----\n");
        estadosBrasileiros.put("RN", 3534165);
        System.out.println(estadosBrasileiros);

        System.out.println("\n------ Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277 -----\n");
        System.out.println("Está no dicionário? " + estadosBrasileiros.containsKey("PB"));
        estadosBrasileiros.put("PB", 4039277);
        System.out.println("Atualizado: " + estadosBrasileiros);

        System.out.println("\n------ Exiba a população PE -----\n");
        System.out.println("População PE:" + estadosBrasileiros.get("PE"));

        System.out.println("\n------ Exiba todos os estados e suas populações na ordem que foi informado -----\n");
        Map<String, Integer> estadosBrasileiros1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosBrasileiros1.toString());

        System.out.println("\n------ Exiba os estados e suas populações em ordem alfabética -----\n");
        Map<String, Integer> estadosBrasileiros2 = new TreeMap<>(estadosBrasileiros1);
        System.out.println(estadosBrasileiros2.toString());

        System.out.println("\n------ Exiba o estado com o menor população e sua quantidade -----\n");

        Integer menorPopulacao = Collections.min(estadosBrasileiros2.values());
        String estado = "";
        for (Map.Entry<String, Integer> entry: estadosBrasileiros2.entrySet()) {
            if(entry.getValue().equals(menorPopulacao)) {
                estado = entry.getKey();
                System.out.println("Estado com a menor população: " + estado + " - " + menorPopulacao);
            }
        }

        System.out.println("\n------ Exiba o estado com a maior população e sua quantidade -----\n");

        Integer maiorPopulacao = Collections.max(estadosBrasileiros2.values());
        String estadoBr = "";
        for (Map.Entry<String, Integer> entry: estadosBrasileiros2.entrySet()) {
            if(entry.getValue().equals(maiorPopulacao)) {
                estadoBr = entry.getKey();
                System.out.println("Estado com a maior população: " + estadoBr + " - " + maiorPopulacao);
            }
        }

        System.out.println("\n------ Exiba a soma da população desses estados -----\n");

        Iterator<Integer> iterator = estadosBrasileiros2.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);

        System.out.println("\n------ Exiba a média da população deste dicionário de estados -----\n");
        System.out.println("Média da população: " + soma/estadosBrasileiros2.size());

        System.out.println("\n------ Remova os estados com a população menor que 4.000.000 -----\n");
        System.out.println(estadosBrasileiros2);

        Iterator<Integer> iterator1 = estadosBrasileiros2.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(estadosBrasileiros2);

        System.out.println("\n------ Apague o dicionário de estados -----\n");
        estadosBrasileiros2.clear();
        System.out.println("Dicionário: " + estadosBrasileiros2);

        System.out.println("\n------ Confira se o dicionário está vazio -----\n");
        System.out.println("Está vazio? " + estadosBrasileiros2.isEmpty());
    }
}
