package exerciciosFeitosPorMim;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valorDigitado = teclado.nextDouble();

        if (valorDigitado%2 == 0) {
           for (double i = 0; i < 4; i++) {
               System.out.println("O valor digitado é par.");
           }
        }
        else {
            for (double i = 0; i < 3; i++) {
                System.out.println("O valor digitado é ímpar.");
            }
        }
        Scanner frase = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String fraseDigitada = frase.nextLine();
        String fraseUpper = fraseDigitada.toUpperCase();
        String fraseInvertida = "";
        for (int i = fraseUpper.length(); i > 0; i--) {
            fraseInvertida = fraseInvertida + fraseUpper.charAt(i-1);
        }
        System.out.println("Sua frase invertida é: " + fraseInvertida);

        Date data = new Date();
        SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data e hora: " + dataHora.format(data));
    }
}
