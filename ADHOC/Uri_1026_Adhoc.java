import java.util.Scanner;

public class Uri_1026_Adhoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long a, b, s;
		
		while (sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			
			s = (a ^ b);	
			
			System.out.println(s);	
		}
		

	}

}
