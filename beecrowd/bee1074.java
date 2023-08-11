import java.util.Scanner;

public class bee1074{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int num = sc.nextInt();

            if(num == 0){
                System.out.println("NULL");
            } else {
                if(num%2 == 0){
                    System.out.printf("EVEN ");
                } else {
                    System.out.printf("ODD ");
                }
    
                if(num>0){
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
        sc.close();
    }
}
