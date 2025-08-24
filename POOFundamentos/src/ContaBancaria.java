public class ContaBancaria {
    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo(){

        return saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        // saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void sacar(double valor){
        // saldo -= valor;
        if (saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }


            }
}
