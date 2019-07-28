import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long seg = sc.nextInt();
		
		System.out.println(seg/3600 + ":" + (seg%3600)/60 + ":" + seg%3600%60);
		
		sc.close();
	}

}
