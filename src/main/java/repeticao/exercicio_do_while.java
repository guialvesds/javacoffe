package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_do_while {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        // O bloco de código dentro do do será executado pelo menos uma vez, e depois a condição é verificada. Se a condição for verdadeira, o bloco de código será executado novamente. Se a condição for falsa, o loop será encerrado.
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while ( resp != 'n');

        sc.close();
    }
}
