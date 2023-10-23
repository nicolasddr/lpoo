package genericosdvinte;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Celular implements Comparable<Celular>{
    int codigo;
    String marca;
    String modelo;
    
    public Celular(int codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "COD:" + codigo + ",marca:" + marca + ",modelo:" + modelo;
    }

    @Override
    public int compareTo(Celular cel) {
        return this.marca.compareTo(cel.getMarca());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Celular> celulares = new ArrayList<>();

        for(int i=0; i<5; i++){
            Celular celular = new Celular(sc.nextInt(), sc.next(), sc.next());
            celulares.add(celular);
        }

        System.out.println(celulares);

        Collections.sort(celulares);
        System.out.println("O menor elemento é: " + celulares.get(0));
        System.out.println(celulares);

    }
          
    
}


    

