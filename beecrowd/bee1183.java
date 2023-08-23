import java.util.Scanner;

public class bee1183{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float soma=0;
        float media=0;
        float qtd=0;
        char o = sc.next().charAt(0);
        float matriz[][] = new float[12][12];

        /*ler a matriz*/
        for(int l=0; l<12; l++){
            for(int c=0; c<12; c++){
                matriz[l][c] = sc.nextFloat();
            }
        }
        sc.close();
        
        /*somar os elementos da diagonal principal*/
        for(int l=0; l<12; l++){
            for(int c=l+1; c<12; c++){
                soma += matriz[l][c];
                qtd++;
            }
        }

        /*verifica a operação selecionada*/
        if(o == 'S'){
            System.out.printf("%.1f\n", soma);
        } else if(o == 'M'){
            media = soma/qtd;
            System.out.printf("%.1f\n", media);
        }

    }
}
