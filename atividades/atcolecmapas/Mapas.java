package atcolecmapas;

import java.util.TreeMap;
import java.util.Map;
import java.io.ObjectInputStream.GetField;
import java.util.Collections;
import java.util.Scanner;

public class Mapas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, String> mapa = new TreeMap<>();

        int qtd = 0;

        for(int i=0; i<5; i++){
            String nome = sc.next();
            String valor = sc.next();
            mapa.put(nome, valor);
           
            qtd++;
        }

        String chave = sc.next();

        System.out.printf("Valor da chave(%s)=%s\n", chave, mapa.get(chave));
        System.out.printf("Quantidade de elementos: %d\n", qtd);

    }
}
