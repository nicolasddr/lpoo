import java.util.Scanner;

public class bee1012{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();

		double pi = 3.14159;

		double area_tri_ret = (a*c)/2;
		double area_circ = pi*c*c;
		double area_trap = ((a+b)*c)/2;
		double area_quad = b*b;
		double area_ret = a*b;

		System.out.println(String.format("TRIANGULO: %.3f", area_tri_ret));
		System.out.println(String.format("CIRCULO: %.3f", area_circ));
		System.out.println(String.format("TRAPEZIO: %.3f", area_trap));
		System.out.println(String.format("QUADRADO: %.3f", area_quad));
		System.out.println(String.format("RETANGULO: %.3f", area_ret));
	}
}