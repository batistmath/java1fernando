package ex348;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int c = 0;
        int x = 0;
        String[] nomes = new String[5];
        float[] notas1 = new float[5];
        float[] notas2 = new float[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Pressione ENTER para começar! ->");
        while (c <= 1) {
            System.out.printf(" Digite o nome do aluno "+(c+1)+" :");
            nomes[c] = input.next();
            System.out.printf("Digite a nota 1 do aluno "+(c+1)+" :");
            notas1[c] = input.nextFloat();
            System.out.printf("Digite a nota 2 do aluno "+(c+1)+" :");
            notas2[c] = input.nextFloat();

            c = c + 1;
        }

        System.out.println("=== Notas dos Alunos ===");
        while (x <= 1) {
            System.out.println("Nome: "+nomes[x]+" - Nota 1: "+notas1[x]+" - Nota 2: "+notas2[x]+" - Media: "+((notas1[x] + notas2[x])/2));
            
            x = x + 1;
        }



    }
    
}
