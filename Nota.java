import java.util.Scanner;
import java.util.Locale;

public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.print("Digite a nota do aluno: ");
        float nota = entrada.nextFloat();

        if ((nota >= 7)) {
            System.out.println("Aluno aprovado");
        }

        entrada.close();
    }
}
