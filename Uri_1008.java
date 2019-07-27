import java.util.Scanner;

public class Uri_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		double c;
		
	Scanner sc = new Scanner(System.in);
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextFloat();
		//Calculo de salario
		double SALARY = (b*c);
		
		System.out.println("NUMBER = "+a);
		System.out.println("SALARY = U$ %0.2f "+SALARY);

	}

}
