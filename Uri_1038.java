import java.util.Scanner;

public class Uri_1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		float total = 0;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod == 1 ) {
			total = (float) (qtd * 4.00);
					
		}else if (cod == 2) {
			total = (float) (qtd * 4.50);
		}else if (cod == 3) {
			total = (float) (qtd * 5.00);
		}else if (cod == 4) {
			total = (float) (qtd * 2.00);
		}else if (cod == 5) {
			total = (float) (qtd * 1.50);
		}
		
		System.out.printf("Total: R$ %.2f%n",total);

	}

}
