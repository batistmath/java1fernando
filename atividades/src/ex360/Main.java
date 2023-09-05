package ex360;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a data de nascimento (ddmm) ou 9999 para sair: ");
            String data = input.next();

            if (data.equals("9999")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            if (data.length() != 4) {
                System.out.println("Formato de data inválido. Digite uma data no formato ddmm.");
                continue;
            }

            String diaStr = data.substring(0, 2);
            String mesStr = data.substring(2);

            int dia = Integer.parseInt(diaStr);
            int mes = Integer.parseInt(mesStr);

            if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
                System.out.println("Data de nascimento inválida.");
                continue;
            }

            determinarHoroscopo(dia, mes);
        }

        input.close();
    }

    public static void determinarHoroscopo(int dia, int mes) {
        String horoscopo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            horoscopo = "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            horoscopo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            horoscopo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            horoscopo = "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            horoscopo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            horoscopo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            horoscopo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            horoscopo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            horoscopo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            horoscopo = "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            horoscopo = "Aquário";
        } else {
            horoscopo = "Peixes";
        }

        System.out.println("O horóscopo é: " + horoscopo);
    }
}
