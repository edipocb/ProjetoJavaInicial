//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// fluxo criar funcao
// 1. Criar esqueleto d funcao
// 2. Definir se tem retorno ou nao
// 3. Definir se tem parametro ou nao

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


    //Extra 1 - Converter Celsius para Fahrenheit
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    //Extra 2 - Calcular Área de um retângulo
    public static double calcularAreaRetangulo(double base, double altura) {
        double area;
        return area = base * altura;
    }

    //Intermediários- 4. Verificar se um número é par
    public static boolean ehPar(int num4){

        return num4 % 2 == 0;
    }

    //Intermediários -5. Calcular média de três notas

    public static double calcularMedia(double nota1, double nota2, double nota3) {

        return (nota1 + nota2 + nota3) / 3;
    }

    // Intermediários 6. Mostrar uma linha decorativa

    public static void linha(){
        for (int i = 0; i < 30 ; i++) {
            System.out.print("-");

        }
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

        double celsius = 20;
        double resultado = converterCelsiusParaFahrenheit(celsius);
        System.out.println(resultado);
        //converterCelsiusParaFahrenheit(30)

        double calculo = calcularAreaRetangulo(10, 15);
        System.out.println("Area do retanculo e: " + calculo);

        double media = calcularMedia(7.5, 6.5, 7.0);
        System.out.println("A media e: " + media);

        linha();
    }
}