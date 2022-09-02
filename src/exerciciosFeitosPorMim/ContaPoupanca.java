package exerciciosFeitosPorMim;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String identificadorConta) {
        super.identificadorConta = identificadorConta;
        super.tipo = "Conta poupança";
    }

    public double rendimentos() {
        return (super.saldo) * 0.01;
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + super.identificadorConta + " Saldo: " + super.saldo + " Tipo: " + super.tipo + " Rendimentos: " + rendimentos());
    }
}
