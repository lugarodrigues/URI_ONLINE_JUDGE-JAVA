import java.util.Scanner;

public class URI2176 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		String s = sc.nextLine();
		int num = 0;
		
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1')
				num++;
		}
		
		if (num % 2 == 0)
			System.out.println(s + '0');
		else
			System.out.println(s + '1');
		
		sc.close();
	}
}
