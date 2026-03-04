package repeticao;

import java.util.Scanner;

public class exercicio_while {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // O loop while é uma estrutura de controle de fluxo que permite repetir um bloco de código enquanto uma condição específica for verdadeira. A sintaxe básica do loop while é a seguinte:
        while(x != y) {
            if(x > y){
                System.out.println("Decrecente");
            } else if ( x < y) {
                System.out.println("Crescente");
            }

            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();
    }
}
