import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		
		if (n1 > n2)  {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		for (int i = n1 + 1; i < n2; i++) {
			if (i % 2 != 0) 
				sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
