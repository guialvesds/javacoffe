package orientacaoObjeto;

import orientacaoObjeto.entities.produto;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstoque {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produto product = new produto();

        product.ExibeItem();

        System.out.print("Informe a quantidade para entrar no estoque: ");
        int n = sc.nextInt();
        product.AddProducts(n);
        product.ExibeItem();
        System.out.print("Informe a quantidade para sair do estoque: ");
        n = sc.nextInt();
        product.RemoveProducts(n);
        product.ExibeItem();

        sc.close();

    }
}
