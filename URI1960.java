import java.util.Scanner;

public class URI1960 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] padRom = {"a","aa","aaa","ab","b","ba","baa","baaa","ac"};
		int[] num = new int[3];
		int i = 0;
		int j = 100;
		
		char[][] algarismos = {{'I','X','C'},   //cada coluna e o padrao
							   {'V','L','D'},   //que substituira o a,b,c para
							   {'X','C','M'}};  //formar a unidade, dezena e centena
		
		//separar os algarismos decimais
		while (i<3) {	
			num[i] = n/j;
			n %= j;
			j/=10;
			i++;
		}
		
		//fazer a conversao de cada pedaço e impressao
		j = 0;
		for (i=2; i>=0;i--) {
			
			if (num[j] > 0) {
				String x = padRom[num[j]-1];
				char[] y = x.toCharArray();
				
				for (int k=0; k<x.length();k++) {
					if (y[k] == 'a') {
						y[k] = algarismos[0][i];
						System.out.print(y[k]);
					} else if (y[k] == 'b') {
						y[k] = algarismos[1][i];
						System.out.print(y[k]);
					} else if (y[k] == 'c') {
						y[k] = algarismos[2][i];
						System.out.print(y[k]);
					}
				}
			}
			j++;
		}
		
		System.out.println();	
		sc.close();
	}
}
