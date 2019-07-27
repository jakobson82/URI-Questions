import java.util.Scanner;

public class Uri_1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double A,B, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5)) /11;
		
		System.out.printf("MEDIA = %.5f%n",MEDIA);

	}

}
