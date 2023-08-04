import java.util.Scanner;

public class bee1020{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int total = s.nextInt();

		int anos = total/365;
		int resto = total%365;

		int meses = resto/30;
		resto = resto%30;

		int dias = resto;

		System.out.println(String.format("%d ano(s)", anos));
		System.out.println(String.format("%d mes(es)", meses));
		System.out.println(String.format("%d dia(s)", dias));
	}
}