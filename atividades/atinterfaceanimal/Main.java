package atinterfaceanimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro(sc.next(), sc.nextInt());
        Gato gato = new Gato(sc.next(), sc.nextInt());
        Papagaio papagaio = new Papagaio(sc.next(), sc.nextInt());

        System.out.print(cachorro);
        System.out.print(gato);
        System.out.print(papagaio);
    }
}
