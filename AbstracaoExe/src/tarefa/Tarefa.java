package tarefa;

public class Tarefa  implements Concluivel{
    String descricao;
    boolean concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
    }

    @Override
    public void concluir() {

    }

    @Override
    public boolean estaConcluid() {
        return false;
    }
}
