import java.util.Scanner;

public class bee1010{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double total = 0.0;

		for(int i=0; i<2; i++){
			int cod = s.nextInt();
			int num = s.nextInt();
			double valor = s.nextDouble();
			total += num*valor;
		}
		s.close();

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
	}
}