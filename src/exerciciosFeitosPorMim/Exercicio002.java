package exerciciosFeitosPorMim;

import java.util.Scanner;

//Exercicio de médias
public class Exercicio002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as 4 notas: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double nota4 = teclado.nextDouble();
        double media =  (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado = (media >= 7.0) ? ("Parabéns! Você aprovado com média: " + media) : ("Você foi reprovado com média: " + media);
        System.out.println(resultado);
    }
}
