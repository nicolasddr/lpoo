import java.util.Scanner;

public class bee1064{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int positivo = 0;
        float soma = 0;

        for(int i=0; i<6; i++){
            float num = sc.nextFloat();
            if(num>=0){
                positivo++;
                soma += num;
            }
        }
        float media = soma/positivo;
        sc.close();

        System.out.printf("%d valores positivos\n", positivo);
        System.out.printf("%.1f\n", media);
    } 
}
