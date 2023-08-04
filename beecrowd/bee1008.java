import java.util.Scanner;

public class bee1008{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int horas = s.nextInt();
		double valor = s.nextDouble();
		double salario = horas*valor;
		System.out.println("NUMBER = " + num);
		System.out.println(String.format("SALARY = U$ %.2f", salario));
	}
}