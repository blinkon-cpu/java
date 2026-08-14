import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = leitor.nextDouble();

        if (!(nota >= 7)) {
            System.out.println("Aluno aprovado");
        }

        leitor.close();
    }
}
