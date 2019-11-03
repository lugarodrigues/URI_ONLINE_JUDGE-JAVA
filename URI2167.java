import java.util.Scanner;

public class URI2167 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int[] vel = new int[n];
		int pos = 0;
		
		vel[0] = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			vel[i] = sc.nextInt();
			
			if (vel[i] < vel[i-1]) {
				pos = i+1;
				break;
			}
		}
		
		System.out.println(pos);
		
		sc.close();
	}
}
