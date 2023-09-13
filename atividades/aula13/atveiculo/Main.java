package aula13.atveiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cor = sc.next();
        int numPassageiros = sc.nextInt();
        String marca = sc.next();
        String modelo = sc.next();

        Carro car1 = new Carro(cor, numPassageiros, marca, modelo);

        System.out.println(car1);

        car1.setModelo(sc.next());
        System.out.println(car1);
        car1.acelerar();
        car1.frear();

        sc.close();

    }
}
