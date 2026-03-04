package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_while_double {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);

        int age = sc.nextInt();
        int soma = 0;
        int count = 0;

        while(age >= 0){
            soma += age;
            count += 1; //Conta a quantidade não negativa
            age = sc.nextInt(); //Devemos chamar de novo para não ficar rodando infinitamente, pois o valor de age não é atualizado dentro do while
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.printf("%.2f%n",media);
        } else {
            System.out.println("Impossível calcular");
        }

        sc.close();
    }
}
