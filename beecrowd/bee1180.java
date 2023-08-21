import java.util.Scanner;

public class bee1180{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int vetor[] = new int[n];
        int menor=0, pos=0;

        for(int i=0; i<n; i++){
            vetor[i] = sc.nextInt();
            if(i == 0){
                menor = vetor[i];
                pos = i;
            } else{
                if(vetor[i] < menor){
                    menor = vetor[i];
                    pos = i;
                }
            }
        }

        sc.close();

        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", pos);
    }

}
