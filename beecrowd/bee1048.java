import java.util.Scanner;

public class bee1048{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float salario = sc.nextFloat();

        float ajuste = 0.0f;
        float ganho = 0.0f;
        float novoSalario = 0.0f;

        if((salario>=0.00) && (salario<=400.00)){
            ajuste = 0.15f;
            
        } else if((salario>=400.01) && (salario<=800.00)){
            ajuste = 0.12f;
            
        } else if((salario>=800.01) && (salario<=1200.00)){
            ajuste = 0.1f;
            
        } else if((salario>=1200.01) && (salario<=2000.00)){
            ajuste = 0.07f;
            
        } else if(salario>2000.00){
            ajuste = 0.04f;
            
        }
        ganho = ajuste*salario;
        novoSalario = salario+ganho;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", ganho);
        System.out.printf("Em percentual: %.0f %%\n", ajuste*100.00);

        sc.close();
    }
}
