package atcolec;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<String>();

        for(int i=0; i<6; i++){
            String nome = sc.next();
            list.add(nome);
        }

        String x = sc.next();
        int y = 0;

        for(String nome : list){
            System.out.printf("%s ", nome);
            if (x.equals(nome)) {
                y = 1;
            } 
        }

        Collections.sort(list);

        System.out.println();
        for(String nome : list){
            System.out.printf("%s ", nome);
        }

        System.out.println();
        if( y == 1){
            System.out.println("encontrado");
        } else {
            System.out.println("não encontrado");
        }

    } 
}
