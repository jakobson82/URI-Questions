import java.util.Scanner;

public class Uri_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);
	        
	        float X,Y;
	        
	        X = sc.nextFloat();
	        Y = sc.nextFloat();
	        

	    		if (X == Y && Y == 0) {
	    			
	    			System.out.print("Origem");
	    			
	    		}else if (Y == 0 ) {
	    			
	    			System.out.print("Eixo X");
	    			
	    		}else if ( X == 0) {
	    			System.out.print("Eixo Y");
	    			
	    		}else if (X > 0 && Y > 0 ) {
	    			
	    			System.out.print("Q1");
	    			
	    		}else if (X < 0  && Y > 0 ) {
	    			
	    			System.out.print("Q2");
	    			
	    		}else if (X < 0 && Y < 0 ) {
	    			
	    			System.out.print("Q3");
	    			
	    		}else if (X > 0 && Y < 0 ) {
	    			
	    			System.out.print("Q4");
	    		}
	    				
	}

}