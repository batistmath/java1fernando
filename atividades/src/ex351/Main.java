package ex351;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite cinco nomes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        System.out.print("Digite um número de 1 a 5: ");
        int numero = input.nextInt();

        if (numero >= 1 && numero <= 5) {
            String nomeEscolhido = nomes[numero - 1];
            System.out.println("O nome correspondente ao número " + numero + " é: " + nomeEscolhido);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 5.");
        }

        input.close();
    }
}
