package ex346;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = "";

        while (true) {
            System.out.println("MENU");
            System.out.println("1 - Inserir uma frase");
            System.out.println("2 - Imprimir o comprimento da frase");
            System.out.println("3 - Imprimir os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("4 - Imprimir a frase espelhada");
            System.out.println("5 - Terminar o algoritmo");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite uma frase: ");
                    frase = input.nextLine();
                    break;
                case 2:
                    System.out.println("O comprimento da frase é: " + frase.length());
                    break;
                case 3:
                    if (frase.length() >= 4) {
                        String doisPrimeiros = frase.substring(0, 2);
                        String doisUltimos = frase.substring(frase.length() - 2);
                        System.out.println("Os dois primeiros caracteres são: " + doisPrimeiros);
                        System.out.println("Os dois últimos caracteres são: " + doisUltimos);
                    } else {
                        System.out.println("A frase não tem pelo menos 4 caracteres para mostrar os dois primeiros e os dois últimos.");
                    }
                    break;
                case 4:
                    String fraseEspelhada = new StringBuilder(frase).reverse().toString();
                    System.out.println("A frase espelhada é: " + fraseEspelhada);
                    break;
                case 5:
                    System.out.println("Algoritmo encerrado.");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
