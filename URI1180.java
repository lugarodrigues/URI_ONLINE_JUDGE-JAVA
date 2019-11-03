import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		
		x[0] = sc.nextInt();
		int men = x[0];
		int pos = 0;
		
		for (int i=1; i<n; i++) {
			x[i] = sc.nextInt();
			if (x[i] < men) {
				men = x[i];
				pos = i;
			}			
		}
		
		System.out.println("Menor valor: " + men);
		System.out.println("Posicao: " + pos);
		
		sc.close();
	}
}
