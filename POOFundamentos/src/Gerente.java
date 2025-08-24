public class Gerente  extends Funcionario{
    public String codigo;

    public Gerente( String nome, String cpf, double salario, String codigo) {
        super(nome, cpf, salario);
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
}


