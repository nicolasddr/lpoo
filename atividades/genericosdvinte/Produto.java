package genericosdvinte;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class Produto implements Comparable <Produto> {
    int codigo;
	String nomeProd;

    @Override
	public String toString() {
		return codigo + ": " + nomeProd;
	}

    public Produto(int codigo, String nomeProd) {
		this.codigo = codigo;
		this.nomeProd = nomeProd;
	}
	
	@Override
	public int compareTo(Produto lista) {
		return nomeProd.compareTo(lista.nomeProd);
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo;
        String nomeProd;

        TreeSet<Produto> lista = new TreeSet<>();

        for (int i=0; i<5; i++) {
			codigo = sc.nextInt();
			nomeProd = sc.next();
			
			Produto produto = new Produto(codigo, nomeProd);
			lista.add(produto);
		}

        System.out.println(lista);

        int buscaCod = sc.nextInt();
		String buscaNome = sc.next();
		Produto prodBusca = new Produto(buscaCod, buscaNome);
		
		if (lista.contains(prodBusca)) {
			lista.remove(prodBusca);
			System.out.println(lista);
		}else{
			System.out.println("Item não encontrado");
		}
		
		Produto maior = Collections.max(lista);
		System.out.println("Maior " + maior);

    }

}
