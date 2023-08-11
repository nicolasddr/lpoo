import java.util.Scanner;

public class bee1072{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d=0, f=0;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num >= 10 && num <= 20){
                d++;
            } else {
                f++;
            }
        }
        sc.close();

        System.out.printf("%d in\n", d);
        System.out.printf("%d out\n", f);
    }
}
