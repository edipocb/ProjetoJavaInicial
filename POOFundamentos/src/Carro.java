public class Carro {

    public String marca;
    public String modelo;
    public int ano;

    public Carro(String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("Descricao: " + marca);
        System.out.println("Marca: " + modelo);
        System.out.println("Modelo: " + ano);
    }

    
}
