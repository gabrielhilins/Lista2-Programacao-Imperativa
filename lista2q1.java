import java.util.Scanner;

public class lista2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = quantidadeNotas(scanner);
        double[] notas = obterNotas(scanner, quantidade);
        double media = calculaMedia(notas);
        exibeMedia(media);
        exibeNotas(notas, media);
    }

    // Função para obter a quantidade de notas do usuário
    public static int quantidadeNotas(Scanner scanner) {
        System.out.print("Digite a quantidade de notas: ");
        int quantidade = scanner.nextInt();
        while (quantidade <= 0) {
            System.out.println("A quantidade de notas deve ser maior que zero. Tente novamente.");
            System.out.print("Digite a quantidade de notas: ");
            quantidade = scanner.nextInt();
        }
        return quantidade;
    }

    // Função para obter as notas do usuário e validar cada entrada
    public static double[] obterNotas(Scanner scanner, int quantidade) {
        double[] notas = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota #" + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
                System.out.print("Digite a nota #" + (i + 1) + ": ");
                nota = scanner.nextDouble();
            }
            notas[i] = nota;
        }
        return notas;
    }

    // Função para calcular a média das notas
    public static double calculaMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public static void exibeMedia(double media) {
        System.out.println("Média das notas: " + media);


    }

    // Função para exibir notas acima e abaixo da média
    public static void exibeNotas(double[] notas, double media) {
        System.out.println("\nNotas maiores do que a média:");
        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }

        System.out.println("\nNotas menores do que a média:");
        for (double nota : notas) {
            if (nota < media) {
                System.out.println(nota);
            }
        }
    }
}
