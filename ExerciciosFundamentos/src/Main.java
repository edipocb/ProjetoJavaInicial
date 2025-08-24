import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        //Fundamentos

//
//        // 1
//        System.out.println("Ola, mundo");
//
//        // 2
//        int numero1 = 10;
//        System.out.println(numero1);
//
//        // 3
//        int a = 5;
//        int b = 3;
//        int soma1 = a + b;
//        System.out.println(soma1);
//
//        // 4
//        // Declarando as variaveis
//        int num1 = 8;
//        int num2 = 7;
//        int soma;
//        // Realizando a soma e imprimindo resultado
//        soma = num1 + num2;
//        System.out.println(soma);
//
//        // Intermediarios
//
//        // 5
//        String nome = "Ana";
//        System.out.println("Ola," + nome);
//
//        // 6
//        int valor;
//        valor = 5 * 2;
//        System.out.println(valor);
//
//        // 7
//        int num3 = 5;
//        int num4 = 3;
//        int num5 = 2;
//        double media;
//
//        media = (double) (num3 + num4 + num5) / 3;
//        System.out.println(media);
//
//        // 8
//        int x = 10;
//        int y = 20;
//        System.out.println(x < y);
//
//
//        // Avancados
//
//        // 9
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int numero = scanner.nextInt();
//        // Compara se o valor digitado e maior ou igual a 16
//        System.out.println(numero >= 16);
//
//        // 10
//        int temperatura = 28;
//        System.out.println(temperatura > 25 && temperatura < 30);
//
//        // 11
//        boolean temCartao = false;
//        double compra = 50.0;
//
//        // !temCartao == false  // vc nao tem um cartao?
//        // temCartao == true
//        System.out.println(temCartao || compra > 100);
//
//
//        // LISTA 2 - ESTRUTURAS CONDICIONAIS
//
//        // 1 - Verificador de maioridade
//        int idadeC = 19;
//        if (idadeC >= 18) {
//            System.out.println("Voce e maior de idade");
//        }
//        else if (idadeC < 18) {
//            System.out.println("Voce e menor de idade");
//        }
//
//
//        // 2 - Verificador de numero positivo, negativo ou zero
//        int numeroC = 90;
//        if (numeroC == 0) {
//            System.out.println("O numero e zero");
//        } else if (numeroC < 0) {
//            System.out.println("O numero e negativo");
//        } else {
//            System.out.println("O numero e positivo");
//        }
//
//        // 3 Claasificacao de aluno
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite a nota do aluno");
//        double nota1 = sc.nextDouble();
//
//        if (nota1 >= 7.0) {
//            System.out.println("Aprovado");
//        }
//        else {
//            System.out.println("Reprovado");
//        }
//
//        //EXERCICIOS INTERMEDIARIOS
//
//        // 4 STATUS DE TAREFA
//        boolean tarefaConcluida = false;
//        if (tarefaConcluida == false) {
//            System.out.println("A tarefa esta pendente");
//        }
//        else {
//            System.out.println("A tarefa foi finalizada com sucesso");
//        }
//
//        // 5 Permissao para entrar na festa
//        int idadeB = 15;
//        boolean acompanhado = false;
//        if (idadeB >= 18) {
//            System.out.println("Entrada permitida");
//        } else if (idadeB == 16 && acompanhado == true) {
//            System.out.println("Entrada permitida");
//        } else if (idadeB == 17 && acompanhado == true) {
//            System.out.println("Entrada permitida");
//        } else {
//            System.out.println("Entrada negada");
//        }
//
//        // 6 Aprovacao de emprestimo
//        double salarioMensal = 2.000;
//        boolean possuiRestricao = false;
//        if (salarioMensal >= 2.000 && possuiRestricao == false) {
//            System.out.println("Emprestimo aprovado");
//        } else {
//            System.out.println("Emprestimo reprovado");
//        }
//
//        // 7 Classificacao de media escolar completa
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Digite a nota do aluno");
//        double nota2 = sc2.nextDouble();
//
//        if (nota2 >= 7) {
//            System.out.println("Aprovado");
//        } else if (nota2 >= 5 && nota2 < 7) {
//            System.out.println("Recuperacao");
//        } else {
//            System.out.println("Reprovado");
//        }
//
//        // Exercícios Avançados
//
//        // 8 Par ou Ímpar com Operador Ternário
//
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Digite um numero inteiro");
//
//        double numero3 = sc3.nextDouble();
//
//        String resultado = numero3 % 2 == 0 ? "Par" : "Impar";
//        System.out.println(resultado);
//
//
//        // 9 Cálculo de Desconto Progressivo
//
//        double valorCompra = 200.99;
//
//        if (valorCompra > 200){
//            double valorDesconto = (valorCompra / 100) * 20;
//            double valorFinal = valorCompra - valorDesconto;
//            System.out.println(valorFinal + " Valor com 20% de desconto");
//        } else if (valorCompra >= 100 && valorCompra <= 200){
//            double valorDesconto = (valorCompra / 100) * 10;
//            double valorFinal = valorCompra - valorDesconto;
//            System.out.println(valorFinal + " Valor com 10% de desconto");
//        } else {
//            System.out.println("Valor nao recebe desconto");
//        }
//
//        // 10 O Erro da Comparação de Textos
//        String senha1 = new String("admin123");
//        String senha2 = new String("admin123");
//
//        //System.out.println("As senhas são iguais? " + (senha1 senha2));
//        System.out.println("As senhas sao iguais? " + senha1.equals(senha2));
//
//        // 11  Cálculo de Média Exata
//
//        System.out.println("Digite a primeira nota do aluno");
//        int notaUm = sc3.nextInt();
//        System.out.println("Digite a segunda nota do aluno");
//        int notaDois = sc3.nextInt();
//
//        double mediaNew = (double) (notaUm + notaDois) / 2;
//        System.out.println("A média é: " + mediaNew);
//
//
//        //Lista 3 - Condicionais / While (04/08)
//
//        // 1 Senha simples
//
//        System.out.println("Digite a senha ");
//        String senha4 = sc3.next();
//
//        if (senha4.equals("1234")) {
//            System.out.println("Acesso liberado");
//        } else  {
//            System.out.println("Senha incorreta");
//        }
//
//        //2 Número dentro de intervalo
//
//        System.out.println("Digite um numero qualquer");
//        int numeroQualquer = sc3.nextInt();
//        if (numeroQualquer > 10 && numeroQualquer <= 20) {
//            System.out.println("O numero esta entre 10 e 20");
//        } else {
//            System.out.println("O numero nao esta entre 10 e 20");
//        }

        //3 Par ou Ímpar

        // Lista 4 - Estruturas de Repetição (05/08)

//        System.out.println("Digite sua senha");
//        int senha5 = sc.nextInt();
//        while (senha5 != 123) {
//            System.out.println("Senha incorreta");
//            System.out.println("Digite a senha novamente");
//            senha5 = sc.nextInt();
//        }


        // 2 - Contador Crescente

//        int numero5 = 0;
//        while (numero5 < 10) {
//            System.out.println(numero5);
//            numero5++;
//        }


        //  DO-WHILE
        // 1 Repetição de Processo
//        String resposta;
//        do {
//            System.out.println("Executando o processo");
//            System.out.println("Qual e o proximo passo?");
//            resposta = sc.nextLine();
//        } while (resposta.equals("S") || resposta.equals("s"));


        // 2 - Somador de Números

//        int num5;
//        int soma = 0;
//        do {
//            System.out.println("Digite um numero inteiro");
//            num5 = sc.nextInt();
//            soma += num5;
//        } while (num5 != 0);
//        {
//            System.out.println("A soma de todos os números digitas é: " + soma);
//        }

        // For
        //FUNDAMENTAL
        //1 - Contagem

//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Tempo!");

//
//        System.out.println("Digite um numero inteiro:");
//        int numInt = sc.nextInt();
//
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(numInt + "x" + i + "=" + (numInt * i));
//        }

//        System.out.println("Digite um numero inteiro positivo: ");
//        int numPositivo = sc.nextInt();
//        for (int i = 1; i <= numPositivo; i++) {
//            int resultado = i * (i + 1);
//            System.out.println(resultado);
//        }

//        //1. Contagem regressiva Peça um número ao usuário e faça uma contagem regressiva até 0.
//
//        System.out.println("Digite um numero inteiro");
//        int num8 = sc.nextInt();
//        for (int i = num8; i >= 0; i--) {
//            System.out.println(i);
//
//        }


//        String[] nomes = new String[3];
//
//        System.out.println("Digite seu nome 1: ");
//        nomes[0] = sc.nextLine();
//        System.out.println("Digite seu nome 2: ");
//        nomes[1] = sc.nextLine();
//        System.out.println("Digite seu nome 3: ");
//        nomes[2] = sc.nextLine();
//
//        for (int i = 0; i < nomes.length ; i++) {
//            System.out.println("Os nomes digitados foram: " + nomes[i]);
//        }

        int[] notas = new int[3];


//        System.out.println("Digite sua nota 1: ");
//        notas[0] = sc.nextInt();
//        System.out.println("Digite sua nota 2: ");
//        notas[1] = sc.nextInt();
//        System.out.println("Digite sua nota 3: ");
//        notas[2] = sc.nextInt();
//
//        System.out.println("As notas digitas foram: " + notas[0] + "," + notas[1] + "," + notas[2]);

 }
}