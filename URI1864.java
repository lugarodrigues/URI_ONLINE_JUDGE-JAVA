import java.util.Scanner;

public class URI1864 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.print(frase.charAt(i));
		}
		
		
		sc.close();
	}
}
