package exerciciosFeitosPorMim.app;

import exerciciosFeitosPorMim.ContaCorrente;
import exerciciosFeitosPorMim.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123456-0");
        contaCorrente.depositar(100.00);
        contaCorrente.sacar(70.00);

        ContaCorrente contaCorrente2 = new ContaCorrente("923456-0");
        contaCorrente2.depositar(1000.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca("11789-0");
        contaPoupanca.depositar(5000.00);

        ContaPoupanca contaPoupanca2 = new ContaPoupanca("18789-0");
        contaPoupanca2.depositar(500.00);

        List<ContaCorrente> contascorrente = new ArrayList<>();
        contascorrente.add(contaCorrente);
        contascorrente.add(contaCorrente2);

        List<ContaPoupanca> contaspoupanca = new ArrayList<>();
        contaspoupanca.add(contaPoupanca);
        contaspoupanca.add(contaPoupanca2);

        for(ContaCorrente conta : contascorrente) {
            conta.imprimirSaldo();
        }

        for(ContaPoupanca conta : contaspoupanca) {
            conta.imprimirSaldo();
        }
    }
}
