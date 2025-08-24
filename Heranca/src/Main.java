 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Pessoa e Atleta

    Atleta atl1 = new Atleta("Ronaldo", "Futebol");
        {
            System.out.println("Nome: " + atl1.getNome());
            System.out.println("Esporte: " + atl1.getEsporte());
        }

        // 2. Hierarquia de Veículos

        Carro car1 = new Carro("Ford", 5);
        Bicicleta bic1 = new Bicicleta("Caloi", 7);
        System.out.println("Carro: " + car1.getMarca() + " com " + car1.getNumeroDePortas() + " portas ");
        System.out.println("Bicicleta: " + bic1.getMarca() + " com " + bic1.getNumeroDeMarchas() + " marchas");
    }
}