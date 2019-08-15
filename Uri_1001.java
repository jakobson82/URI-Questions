import java.util.Scanner; 

public class Uri_1001 {
 
    public static void main(String[] args){
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int senha = sc.nextInt();
		
		
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
 	
 	  /*  int A, B, X;
 	    
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		X = A + B;
		
		System.out.println("X = " + X);
 		*/
    }
 
}