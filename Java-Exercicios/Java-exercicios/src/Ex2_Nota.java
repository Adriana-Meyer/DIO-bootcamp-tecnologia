import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true) {
            System.out.println("Digite uma nota: ");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) break;

            System.out.println("Valor inválido. Tente novamente");

        }

        System.out.println("O programa foi encerrado com sucesso");
    }
}

/*
Solução alternativa

Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
               System.out.println("Valor inválido. Digite novamente: ");
               nota = scan.nextInt();
        }

        System.out.println("O programa foi encerrado com sucesso");
    }

 */
