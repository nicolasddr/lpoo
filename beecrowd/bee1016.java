import java.util.Scanner;

public class bee1016{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int dist = s.nextInt();

		int minutos = (60*dist)/30;

		System.out.println(String.format("%d minutos", minutos));
	}
}