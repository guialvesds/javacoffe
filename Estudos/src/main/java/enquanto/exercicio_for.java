package enquanto;

import java.util.Scanner;

public class exercicio_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        for(int i = 0; i < N; i++){ //Estrutura de repetição for, onde i é a variável de controle, que inicia em 0, e vai até N-1, incrementando 1 a cada iteração
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}
