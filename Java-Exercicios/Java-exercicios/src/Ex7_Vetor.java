public class Ex7_Vetor {
    public static void main(String[] args) {

        int[] vetor = {6, 4, 9, -3, -10, 50};

        System.out.print("Vetor invertido: ");

        for(int i = (vetor.length - 1); i >= 0; i-- ){
            System.out.print(vetor[i] + " ");
        }
    }
}
