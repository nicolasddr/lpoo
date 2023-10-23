package genericosdvinte;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;


public class Vetor {
    public static <T> void procuraValores(T[] vetor){
        Map<T, Integer> contador = new LinkedHashMap<>();

        for(T elemento : vetor){
            if(contador.containsKey(elemento)){
                contador.put(elemento, contador.get(elemento) + 1);
            } else {
                contador.put(elemento, 1);
            }
        }

        for(Map.Entry<T, Integer> entry : contador.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " tem " + entry.getValue() + " ocorrências.");
            }
        }


    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] inteiros = new Integer[n];
        String[] strings = new String[n];

        for(int i=0; i<n; i++){
            inteiros[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            strings[i] = sc.next(); 
        }

        procuraValores(inteiros);
        procuraValores(strings);


    }
}
