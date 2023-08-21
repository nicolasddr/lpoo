import java.util.Scanner;

public class bee1174{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float vetor[] = new float[100];

        for(int i=0; i<100; i++){
            vetor[i] = sc.nextFloat();
        }
        
        for(int i=0; i<100; i++){
            if(vetor[i] <= 10.0){
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }
        sc.close();
    }
}