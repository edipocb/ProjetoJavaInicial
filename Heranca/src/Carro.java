public class Carro extends Veiculo{
   private int numeroDePortas;

    public Carro(String marca, int numeroDePortas) {
        super(marca);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
}



