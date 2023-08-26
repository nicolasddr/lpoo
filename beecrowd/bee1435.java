
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Scanner;

public class bee1435{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x; 

        while(n > 0 && n <= 100){
            StringBuilder sb = new StringBuilder();
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
    
                    sb.append(String.format("%3d", x));
                    if(c<n){
                        sb.append(" ");
                    } else {
                        sb.append("\n");
                    }
                      
                }   
                  
            }

            sb.append("\n");
            System.out.print(sb.toString());
            n = sc.nextInt();

        }

    }
}


