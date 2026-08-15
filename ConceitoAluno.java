import java.util.Locale;
import java.util.Scanner;

public class ConceitoAluno {
    public static void main(String[] args) {
        // Garante que o Scanner aceite ponto como separador decimal (ex: 8.5)
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();

        // Validação e classificação
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        } else if (nota >= 9.0) {
            System.out.println("Conceito: A");
        } else if (nota >= 7.0) {
            System.out.println("Conceito: B");
        } else if (nota >= 5.0) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }

        scanner.close();
    }
}
