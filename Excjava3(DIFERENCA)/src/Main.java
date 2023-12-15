import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int A, B, C, D; 
		
		System.out.println("Calculo de diferença de produto (digite 4 valores): ");
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println("A diferença foi de :" + (A * B - C * D));
		
		sc.close();
	}

}
