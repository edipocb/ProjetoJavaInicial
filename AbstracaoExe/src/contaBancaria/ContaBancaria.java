package contaBancaria;

public class ContaBancaria implements OperacoesConta{

    String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo = valor + saldo;{
            System.out.println("Novo saldo e: " +  saldo);
        }
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    @Override
    public double consultarSaldo() {
        return 0;
    }
}
