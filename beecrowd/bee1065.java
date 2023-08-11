import java.util.Scanner;

public class bee1065{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int par = 0;

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            if(num%2 == 0){
                par++;
            }
        }
        sc.close();

        System.out.printf("%d valores pares\n", par);
    }
}
