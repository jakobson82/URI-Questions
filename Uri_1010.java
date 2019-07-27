import java.util.Scanner;

public class Uri_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, c1, c2;
		float v1,v2,s1,s2,total;
		
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextFloat();

		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextFloat();
		
		s1 = n1 * v1;
		s2 = n2 * v2;
		total = s1 + s2;
		System.out.printf("VALOR A PAGAR: R$ %.3f%n", total);
		
		
		

	}

}
