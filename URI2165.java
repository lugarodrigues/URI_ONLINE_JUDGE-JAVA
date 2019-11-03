import java.util.Scanner;

public class URI2165 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String frase = sc.nextLine();
		
		if (frase.length() <= 140)
			System.out.println("TWEET");
		else
			System.out.println("MUTE");
		
		sc.close();
	}
}
