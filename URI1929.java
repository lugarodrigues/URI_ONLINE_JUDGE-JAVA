import java.util.Scanner;

public class URI1929 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int existeTriangulo = 0;
		int[] ladosOrdenados = {101,101,101,101,101};
		int nroElem = 0;
		
		//insercao e ordenacao dos elementos (insercaoOrdenada)
		while (nroElem < 4) {
			
			int lado = sc.nextInt();
	
			for(int i=nroElem; i>=0; i--) {
				if (lado < ladosOrdenados[i]) {
					ladosOrdenados[i+1] = ladosOrdenados[i];
					ladosOrdenados[i] = lado;
				}
			}
			nroElem++;
		}
		
		//verificacao da existencia
		if (ladosOrdenados[3] < ladosOrdenados[0] + ladosOrdenados[1])
			existeTriangulo = 1;
		if (ladosOrdenados[3] < ladosOrdenados[1] + ladosOrdenados[2])
			existeTriangulo = 1;
		if (ladosOrdenados[3] < ladosOrdenados[0] + ladosOrdenados[2])
			existeTriangulo = 1;
		if (ladosOrdenados[2] < ladosOrdenados[0] + ladosOrdenados[1])
			existeTriangulo = 1;
		
		//saida
		if (existeTriangulo == 1)
			System.out.println("S");
		else
			System.out.println("N");
		
		sc.close();
	}
}
