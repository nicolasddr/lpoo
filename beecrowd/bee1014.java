import java.util.Scanner;

public class bee1014{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int dist = s.nextInt();
		double combust = s.nextDouble();
		s.close();

		double consumo = dist/combust;

		System.out.println(String.format("%.3f km/l", consumo));
	}
}