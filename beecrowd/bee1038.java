import java.util.Scanner;

public class bee1038{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        float valor, total = 0f;

        switch (cod) {
            case 1:
                valor = 4.00f;
                break;
            case 2:
                valor = 4.50f;
                break;
            case 3:
                valor = 5.00f;
                break;
            case 4:
                valor = 2.00f;
                break;
            case 5:
                valor = 1.50f;
                break;
            default:
                valor = 0.0f;
                break;
        }

        sc.close();

        total = qtd*valor;
        System.out.printf("Total: R$ %.2f\n", total);

    }
}
