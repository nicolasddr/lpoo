import java.util.Scanner;
import java.util.Arrays;

public class bee1042{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int v[] = new int[3];
        v[0] = sc.nextInt();
        v[1] = sc.nextInt();
        v[2] = sc.nextInt();

        int va[] = v.clone();

        Arrays.sort(v);

        System.out.printf("%d\n%d\n%d\n\n", v[0], v[1], v[2]);
        System.out.printf("%d\n%d\n%d\n", va[0], va[1], va[2]);

        sc.close();

    }
}