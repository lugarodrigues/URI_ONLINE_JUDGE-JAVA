import java.util.Scanner;

public class URI1175 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[20];
		int j= 19;

		for (int i=0; i<20; i++)
			x[i] = sc.nextInt();
		
		for (int i=0; i<10; i++) {
			int temp = x[i];
			x[i] = x[j];
			x[j] = temp;
			
			j--;
		}
				
		for (int i=0; i<20; i++)
			System.out.println("N[" + i + "] = " + x[i]);
		
		sc.close();
	}
}
