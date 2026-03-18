package orientacaoObjeto;

import orientacaoObjeto.entities.triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangle x, y;

        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a =   sc.nextDouble();
        x.b =   sc.nextDouble();
        x.c =   sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a =   sc.nextDouble();
        y.b =   sc.nextDouble();
        y.c =   sc.nextDouble();

       double areaX = x.area();
       double areaY = y.area();

        System.out.printf("Area of triangle X: %.4f%n ", areaX);
        System.out.printf("Area of triangle Y: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.printf("Large area: X");
        } else {
            System.out.printf("Large area: Y");
        }

        sc.close();
    }
}
