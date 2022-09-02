package exerciciosFeitosPorMim;

import java.util.Scanner;

//Exercicio de soma e raiz quadrada
public class Exercicio001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //entrada via teclado
        System.out.println("Digite um numero: ");
        int entradaTeclado1 = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        int entradaTeclado2 = teclado.nextInt();
        int soma = entradaTeclado1 + entradaTeclado2;
        System.out.println("A soma dos numeros digitados é: " + soma);
        System.out.println("A raiz quadradada de " + soma + " é: " + Math.sqrt(soma));
    }
}
