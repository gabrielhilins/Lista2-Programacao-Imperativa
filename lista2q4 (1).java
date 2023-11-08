import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner dado = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5]; 
        
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + " do vetor A");
            A[i] = dado.nextInt();
            System.out.println("Digite o valor " + (i + 1) + " do vetor B");
            B[i] = dado.nextInt();
        }
        
        System.out.println("Os valores iguais:");
        exibirInter(A, B);
    }
    
    public static void exibirInter(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.println(A[i] + " ");
                }
            }
        }
    }
}
