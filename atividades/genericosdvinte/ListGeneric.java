package genericosdvinte;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListGeneric {
    
    public static double somaList(ArrayList<? extends Number> list){
        double soma = 0.0f;

        for(Number num : list){
            soma += num.doubleValue();
        }

        return soma; 
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> inteiros = new ArrayList<Integer>();
        ArrayList<Double> doubles = new ArrayList<Double>();

        for(int i=0; i<n; i++){
            inteiros.add(sc.nextInt());
        }

        for(int i=0; i<n; i++){
            doubles.add(sc.nextDouble());
        }

        System.out.println("Lista Inteiros: " + inteiros);
        System.out.println("Soma Inteiros: " + somaList(inteiros));

        System.out.println("Lista Doubles: " + doubles);
        System.out.println("Soma Doubles: " + somaList(doubles));

    }
}
