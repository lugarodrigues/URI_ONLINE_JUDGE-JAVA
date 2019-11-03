import java.util.Scanner;

public class URI2162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int cond = 1;
		int[] hs = new int[n];
		int i;
		
		for (i=0; i<n; i++) 
			hs[i] = sc.nextInt();
		
		if (hs[1] > hs[0]) {
			
			for (i=1; i<n-1; i++) {
				if (i%2!=0) {
					if (hs[i+1] >= hs[i])
						cond = 0;
				}
				else {
					if (hs[i+1] <= hs[i])
						cond = 0;
				}
			}
		}
		else if (hs[1] < hs[0]){
			for (i=1; i<n-1; i++) {
				if (i%2!=0) {
					if (hs[i+1] <= hs[i])
						cond = 0;
				}
				else {
					if (hs[i+1] >= hs[i])
						cond = 0;
				}
			}
			
		}
		else
			cond = 0;
		
		System.out.println(cond);
		sc.close();
	}
}
