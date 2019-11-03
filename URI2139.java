import java.util.Scanner;

public class URI2139 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] meses = {31,29,31,30,31,30,31,31,30,31,30,25};
		
		while(sc.hasNext()) {
			
			int mes = sc.nextInt();
			int dia = sc.nextInt();
			int total = 0;
			
			if (mes == 12 && dia >= 24) {
				if (dia == 25)
					System.out.println("E natal!");
				else if (dia > 25)
					System.out.println("Ja passou!");
				else if (dia == 24)
					System.out.println("E vespera de natal!");
				
			} else {
				
				total = meses[mes-1] - dia;
				
				for (int i=mes; i<12; i++) {
					
					total += meses[i];
					
				}
				System.out.println("Faltam " + total + " dias para o natal!");
			}
			
		}
		sc.close();
	}
}
