// public class NOME {}

public class Produto {
    // 1. Atributo? Quais?
    // variavel "Especial"
    // Tamanho, preco, cor, unidade, marca, nome
    // public TIPO NOME;

    private String nome;
    private double tamanho;
    private double preco;
    private String cor;
    private int unidade;
    private String marca;
    private int estoque;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getEstoque(){
        return estoque;
    }
    public double setEstoque(){
        return estoque;
    }

    public double getPreco(){
        return preco;
    }
    public double setPreco(){
        return preco;
    }



    public Produto(String nome, double preco, String marca, double tamanho ){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
    }


    // 2. Metodo? Quais?
    // Mostra informacoes do produto
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }

}
