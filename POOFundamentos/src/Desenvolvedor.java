public class Desenvolvedor  extends Funcionario {
    public String linguagem;

    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void exibirDev(){
        System.out.println("Dev: " + this.nome);
    }
}
