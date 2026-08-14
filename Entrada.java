import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //nextLine(): para fazer leitura de uma string

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        //nextInt(): para fazer a leitura de um inteiro

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        //nextDouble(): para fazer leitura de um double

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Dados informados: \n ");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "m");

        
        entrada.close();

    }
}
