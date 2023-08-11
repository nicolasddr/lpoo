import java.util.Scanner;

public class bee1066{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int par=0, impar=0, positivo=0, negativo=0;
    

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            if(num%2==0){
                par++;
            } else {
                impar++;
            }

            if(num>0){
                positivo++;
            } else if(num<0) {
                negativo++;
            }
        }
        sc.close();

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}
