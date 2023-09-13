package aula13.atmatriz;
import java.util.Scanner;

public class Exmatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int soma=0;

        int matriz[][] = new int[6][6];

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<6; i++){
            soma += matriz[i][i];
        }

        System.out.println(soma);
    }
}
