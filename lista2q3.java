import java.util.Scanner;

public class lista2q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {50, 10, 2, 4, 6, 8, 9, 0, 33, 12};

        exibirVetor(vetor);
        elementoSimetrico(vetor);
    }
    public static void elementoSimetrico(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            int elementoSimetrico = vetor[vetor.length - 1 - i];
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(vetor[i] + " - " + elementoSimetrico);
        }
        }


        public static void exibirVetor(int[] vetor) {

            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }

}

