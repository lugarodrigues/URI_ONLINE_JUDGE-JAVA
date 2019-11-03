import java.util.Scanner;

public class URI1179 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] par = new int[5];
		int iPar = 0;
		int[] impar = new int[5];
		int iImpar = 0;
		
		for(int i=1; i<=15; i++) {
			
			int x = sc.nextInt();
			
			if (x % 2 == 0) {
				par[iPar] = x;
				iPar++;
			}
			else {
				impar[iImpar] = x;
				iImpar++;
			}
			
			if (iPar == 5) {
				for (int j=0; j<5; j++)
					System.out.println("par[" + j + "] = " + par[j]);
				iPar = 0;
			}
			if (iImpar == 5) {
				for (int j=0; j<5; j++)
					System.out.println("impar[" + j + "] = " + impar[j]);
				iImpar = 0;
			}
		}
		for (int j=0; j<iImpar; j++)
			System.out.println("impar[" + j + "] = " + impar[j]);
		for (int j=0; j<iPar; j++)
			System.out.println("par[" + j + "] = " + par[j]);
		
		sc.close();
	}
}
