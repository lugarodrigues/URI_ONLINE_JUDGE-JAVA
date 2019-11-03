import java.util.Scanner;

public class URI1177 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] n = new int[1000];
		int i = 0;
		int j = 0;
		
		while (i <1000) {
			
			n[i] = j;
			
			if (j<t-1)
				j++;
			else
				j=0;
			
			i++;
		}
		
		for (i=0; i<1000; i++)
			System.out.println("N["+ i + "] = " + n[i]);
		
		sc.close();
	}
}
