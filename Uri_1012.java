import java.util.Scanner;

public class Uri_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,triangulo, circulo, trapezio, quadrado, retangulo;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		triangulo = (a * c)/2.0;
		circulo = (3.14159 * (c*c));
		trapezio = (a + b) * c / 2.0;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
	}

}
