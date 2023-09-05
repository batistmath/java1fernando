package ex358;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numMercadorias = 100;
        double[] precoCompra = new double[numMercadorias];
        double[] precoVenda = new double[numMercadorias];

        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        for (int i = 0; i < numMercadorias; i++) {
            System.out.print("Informe o preço de compra da mercadoria " + (i + 1) + ": ");
            precoCompra[i] = input.nextDouble();
            System.out.print("Informe o preço de venda da mercadoria " + (i + 1) + ": ");
            precoVenda[i] = input.nextDouble();

            // Calcula o lucro percentual
            double lucroPercentual = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            // Classifica o lucro em categorias
            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }

        System.out.println("Quantidade de mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + lucroMaior20);

        input.close();
    }
}
