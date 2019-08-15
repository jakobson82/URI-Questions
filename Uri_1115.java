import java.util.Scanner;

public class Uri_1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
				 x = sc.nextInt();
				 y = sc.nextInt();
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
				 x = sc.nextInt();
				 y = sc.nextInt();
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
				x = sc.nextInt();
				y = sc.nextInt();
			} else if (x > 0 && y < 0) {
				System.out.println("segundo");
				x = sc.nextInt();
				y = sc.nextInt();
			}

		}

		sc.close();

	}

}
