package athap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cor = sc.next();
        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();

        Retangulo ret = new Retangulo(cor, v1, v2);
        System.out.println(ret);

        Triangulo tri = new Triangulo(cor = sc.next(), v1 = sc.nextDouble(), v2 = sc.nextDouble());
        System.out.println(tri);

        sc.close();
    }
    
}
