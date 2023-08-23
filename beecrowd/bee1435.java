
import java.util.Scanner;

public class bee1435{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x; 

        while(n > 0 && n <= 100){

            for(int l=1; l<=n; l++){
                for(int c=1; c<=n; c++){
                    x = l;

                    if(c < x){
                        x = c;
                    }

                    if(n-l+1 < x){
                        x = n-l+1;
                    }

                    if(n-c+1 < x){
                        x = n-c+1;
                    }
    
                    System.out.printf("%3d", x);
                    if(c<n){
                        System.out.printf(" ");
                    } else {
                        System.out.printf("\n");
                    }
                      
                }   
                  
            }

            System.out.print("\n");
            n = sc.nextInt();

        }

    }
}


