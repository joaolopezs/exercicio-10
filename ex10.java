import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		
		double tc;
		double tf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em celsius:");
		
		tc = sc.nextDouble();
		
		sc.close();
		
		tf = (tc * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é : " + tf);
		
		

		
		
		

	}

}
