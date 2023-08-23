import java.util.Scanner;

public class bee1187{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char o = sc.next().charAt(0);
        double soma=0, media=0, qtd=0;
        double matriz[][] = new double[12][12];
        int j=11;
        int k=1;

        /*ler os elementos da matriz*/
        for(int l=0; l<12; l++){
            for(int c=0; c<12; c++){
                matriz[l][c] = sc.nextDouble();
            }
        }
        sc.close();

        /*somar os elementos da área superior*/
        for(int l=0; l<5; l++, j--, k++){
            for(int c=k; c<j; c++){
                soma += matriz[l][c];
                qtd++;
            }
        }

        /*verifica a operação e imprime o resultado*/
        if(o == 'S'){
            System.out.printf("%.1f\n", soma);
        } else if(o == 'M'){
            media = soma/qtd;
            System.out.printf("%.1f\n", media);
        }
    } 
}