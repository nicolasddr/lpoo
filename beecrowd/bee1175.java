import java.util.Scanner;

public class bee1175{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[20];

        for(int i=19; i>=0; i--){
            vetor[i] = sc.nextInt();
        }

        for(int i=0; i<20; i++){
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}