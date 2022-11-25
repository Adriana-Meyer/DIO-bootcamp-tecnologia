/*Crie um conjunto contendo as cores do arco-íris e:

[x] Exiba todas as cores uma abaixo da outra
[x] A quantidade de cores que o arco-íris tem
[x] Exiba as cores em ordem alfabética
[x] Exiba as cores na ordem inversa da que foi informada
[x] Exiba todas as cores que começam com a letra ”v”
[x] Remova todas as cores que não começam com a letra “v”
[x] Limpe o conjunto
[x] Confira se o conjunto está vazio
 */

import java.util.*;

public class exercicio_Set_ArcoIris {
    public static void main(String[] args) {

        Set<String> cores = new LinkedHashSet<>(Arrays.asList(
                "vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println("Todas as cores do array: " + cores);

        System.out.println("--------------------------------");

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("--------------------------------");

        System.out.println("A quantidade de cores que o arco-íris tem: " + cores.size());

        System.out.println("--------------------------------");

        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println("Exiba as cores em ordem alfabética: " + cores2);

        System.out.println("--------------------------------");

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println("Original: " + coresArcoIris3);

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println("Invertido:" + coresArcoIrisList);

        System.out.println("--------------------------------");

        Iterator<String> iterator = cores.iterator();

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.startsWith("v")) {
                System.out.println(next + " ");
            }
        }

        System.out.println("--------------------------------");

        Set<String> cores3 = new TreeSet<>(cores2);
        System.out.println("Cores: " + cores3);

        Iterator<String> iterator1 = cores3.iterator();

        System.out.print("Remova todas as cores que não começam com a letra “v”: ");
        while (iterator1.hasNext()) {
            String next = iterator1.next();

            if (!(next.startsWith("v"))) {
                iterator1.remove();
            }
        }
        System.out.println(cores3);

        System.out.println("--------------------------------");

        System.out.print("Limpe o conjunto: ");
        cores3.clear();

        System.out.println(cores3);

        System.out.println("--------------------------------");

        System.out.println("Confira se o conjunto está vazio: " + cores3.isEmpty());

    }
}
