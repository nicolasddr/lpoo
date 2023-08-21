import java.util.Scanner;

public class bee1178{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[100];
        double x;

        x = sc.nextDouble();
        vetor[0] = x;
        System.out.printf("N[0] = %.4f\n", x);

        for(int i=1; i<100; i++){
            x = x/2;
            vetor[i] = x;
            System.out.printf("N[%d] = %.4f\n", i, x);
        }
    }
}
