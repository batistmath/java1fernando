package ex356;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAlunos = 15;
        String[] nomes = new String[numAlunos];
        double[] notasPR1 = new double[numAlunos];
        double[] notasPR2 = new double[numAlunos];
        double[] medias = new double[numAlunos];
        String[] situacao = new String[numAlunos];

        // Coleta os nomes e notas das PR1 e PR2 de cada aluno
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
            System.out.print("Nota da PR1 do aluno " + (i + 1) + ": ");
            notasPR1[i] = input.nextDouble();
            System.out.print("Nota da PR2 do aluno " + (i + 1) + ": ");
            notasPR2[i] = input.nextDouble();

            // Calcula a média arredondada
            medias[i] = Math.round((notasPR1[i] + notasPR2[i]) / 2.0);

            // Determina a situação (AP ou RP)
            situacao[i] = (medias[i] >= 6) ? "AP" : "RP";

            // Limpa o buffer de entrada
            input.nextLine();
        }

        // Imprime a listagem de alunos com nome, notas, média e situação
        System.out.println("Listagem de Alunos:");
        System.out.println("--------------------------------------------------");
        System.out.println("Nome\t\tNota PR1\tNota PR2\tMédia\tSituação");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println(nomes[i] + "\t\t" + notasPR1[i] + "\t\t" + notasPR2[i] + "\t\t" + medias[i] + "\t" + situacao[i]);
        }
        System.out.println("--------------------------------------------------");

        input.close();
    }
}
