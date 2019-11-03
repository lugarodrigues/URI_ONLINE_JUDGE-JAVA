import java.util.Scanner;

public class URI2163 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] sabre = {{7,7,7},{7,42,7},{7,7,7}}; //matriz a ser procurada
		
		int mat[][] = new int[m][n];
		int igualElem = 1;
		int lEnc = 0;
		int cEnc = 0;
		
		for(int i=0; i<m; i++) {            //iniciar matriz
			for (int j=0; j<n; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=0; i<m-2; i++) {            //procurar (elem inicial)
			for (int j=0; j<n-2; j++) {
			
				int ls = 0;
				int cs = 0;
				igualElem = 1;
				
				for(int lp=i; lp<i+3; lp++) {      //comparar com sabre									
					for (int cp=j; cp<j+3; cp++) {
						
						if (mat[lp][cp] != sabre[ls][cs])
							igualElem = 0;
						cs++;
					}
					ls++;
					cs = 0;
				}
				
				if(igualElem == 1) {
					lEnc = i+1;
					cEnc = j+1;
				}
			}
		}
		if (lEnc == 0 && cEnc == 0)
			System.out.println("0 0");
		else	
			System.out.println((lEnc+1) + " " + (cEnc+1));
		
		sc.close();
	}
}
