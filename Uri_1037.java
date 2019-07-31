import java.util.Scanner;

public class Uri_1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);
	        
	        float num;
	        
	        num = sc.nextFloat();
	        

	    		if (num < 0.0 || num > 100.0) {
	    			System.out.println("Fora de intervalo");
	    		}
	    		else if (num <= 25.0) {
	    			System.out.println("Intervalo [0,25]");
	    		}
	    		else if (num <= 50.0) {
	    			System.out.println("Intervalo (25,50]");
	    		}
	    		else if (num <= 75.0) {
	    			System.out.println("Intervalo (50,75]");
	    		}		
	    		else {
	    			System.out.println("Intervalo (75,100]");
	    		}
		
	}

}
