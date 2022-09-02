package exerciciosFeitosPorMim;

public class Conta {

    protected String identificadorConta;
    protected double saldo;
    protected String tipo;

    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Você não pode sacar esse valor. Seu saldo é: " + this.saldo);
        }
        saldo = saldo - saque;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "identificadorConta='" + identificadorConta + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
