import java.util.Scanner;

public class bee1185{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char o = sc.next().charAt(0);
        float soma=0, media=0, qtd=0;
        float matriz[][] = new float[12][12];
        int j=11;

        /*ler os elementos da matriz*/
        for(int l=0; l<12; l++){
            for(int c=0; c<12; c++){
                matriz[l][c] = sc.nextFloat();
            }
        }
        sc.close();
        
        /*somar os elementos da diagonal secundária*/
        for(int l=0; l<12; l++){
            j--;
            for(int c=j; c>=0; c--){
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
