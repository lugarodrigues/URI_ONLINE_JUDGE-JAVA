import java.util.Scanner;

public class URI2160 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String nome = sc.nextLine();
		
		if (nome.length() <= 80)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		sc.close();
	}
}
