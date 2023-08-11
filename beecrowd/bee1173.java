import java.util.Scanner;

public class bee1173{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];

        for(int i=0; i<10; i++){

            if(i==0){
                vetor[i] = sc.nextInt();
            } else{
                vetor[i] = vetor[i-1]*2;
            }
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
        sc.close();
    }   
}
