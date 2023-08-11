import java.util.Scanner;

public class bee1071{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int menor, maior, soma=0;

        if(x>y){
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        int i = menor+1;
        while(i < maior){
            if(i%2 != 0){
                soma += i;
            }
            i++;
        }

        System.out.println(soma);
    }
}
