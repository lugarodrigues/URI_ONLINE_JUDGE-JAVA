import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] x = new int[10];
		
		x[0] = n;
		
		for (int i=1; i<10; i++)
			x[i] = x[i-1] * 2;
				
		for (int i=0; i<10; i++)
			System.out.println("N[" + i + "] = " + x[i]);
		
		sc.close();
	}
}
