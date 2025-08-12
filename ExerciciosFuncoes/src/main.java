//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {

    // 1. Exibir uma mensagem de boas-vindas
    public static void mostrarMensagem() {
        System.out.println("Bem-vindo(a) ao programa");
    }

    // 2. Mostrar o dobro de um número
    public static void mostrarDobro(int num1){
        int resultado = num1 * 2;
        System.out.println(resultado);
    }

    //3. Retornar a divisão de dois números inteiros
    public static int dividir(int num2, int num3) {
        int divisao = num2 / num3;
        return divisao;


    }
    //4. Verificar se um número é par
    public static boolean ehPar(int num4){
        return num4 % 2 == 0;
    }

    public static void main(String[] args) {
        mostrarMensagem();
        mostrarDobro(15);

        int dividir = dividir(20,2);
        System.out.println(dividir);


        int valor = 8;
        if(ehPar(valor)) {
            System.out.println(valor + " É par ");
        } else {
            System.out.println(valor + " É impar ");
        }
    }
}