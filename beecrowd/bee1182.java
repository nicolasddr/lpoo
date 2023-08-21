import java.util.Scanner;

public class bee1182{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        char t = sc.next().charAt(0);
        float matriz[][] = new float[12][12];
        float total=0;

        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                matriz[i][j] = sc.nextFloat();
            }
        }

       
        for(int j=0; j<12; j++){
            total += matriz[j][c];
        }
        
        if(t == 'S'){
            System.out.printf("%.1f\n",total);
        } else if(t == 'M'){
            total = total/12;
            System.out.printf("%.1f\n",total);
        }
        sc.close();

    }
}