import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double soma = 0;
        double numDigitado;
        double maiorNumero = 0;

        for (int i = 1; i < 6; i++) {

            System.out.println("Digite um valor: ");
            numDigitado = scan.nextDouble();
            soma += numDigitado;

            if (numDigitado > maiorNumero){
                maiorNumero = numDigitado;
            }
        }

        double media = soma / 5;
        System.out.println("A média dos valores é: " + media);
        System.out.println("O maior número é: " + maiorNumero);

    }
}

/*
SOLUÇÃO ALTERNATIVA
    Scanner scan = new Scanner(System.in);

        double soma = 0;
        double numDigitado;
        double maiorNumero = 0;

        int count = 0;
        do {
            System.out.println("Digite um valor: ");
            numDigitado = scan.nextDouble();

            soma += numDigitado;

             if (numDigitado > maiorNumero){
                maiorNumero = numDigitado;
            }
            count += 1;
        } while(count < 5);

        System.out.println("A média dos valores é: " + (soma/5));
        System.out.println("O maior número é: " + maiorNumero);

 */