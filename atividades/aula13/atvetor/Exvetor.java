package aula13.atvetor;
import java.util.Scanner;

public class Exvetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];

        for(int i=0; i<10; i++){
            vetor[i] = sc.nextInt();

            if(vetor[i] % 3 == 0 && vetor[i] >= 0){
                vetor[i] = -3;
            }
        }   
        sc.close();
       
        for(int i=0; i<10; i++){
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
    }
    
}
