import java.util.Scanner;
public class Uri_1046 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int hi, hf, dr;
        
        hi = sc.nextInt();
        hf = sc.nextInt();
        
        if(hi<hf) {
            dr = hf-hi;
            System.out.println("O JOGO DUROU "+dr+" HORA(S)");
        } else if(hi>hf) {
            dr = (24-hi)+hf; 
            System.out.println("O JOGO DUROU "+dr+" HORA(S)");
        } else if(hi==hf) {
            dr = 24;
            System.out.println("O JOGO DUROU "+dr+" HORA(S)");
        }
 
    }
 
}