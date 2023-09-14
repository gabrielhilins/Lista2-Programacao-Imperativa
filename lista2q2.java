import java.util.Scanner;

public class lista2q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int tamanho = 20;
        int[] vet = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vet[i] = scanner.nextInt();
        }
        vet = inverteVetor(vet);

        exibirVetor(vet);
    }
    public static int[] inverteVetor(int[] vet) {
        int[] temp = new int[vet.length];
        for (int i = 0; i < vet.length; i++) {
            temp[i] = vet[vet.length - i - 1];
        }
        return (temp);
    }
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
