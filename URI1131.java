import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resp = 1;
		int gr = 0;
		int in = 0;
		int emp = 0;
		int i = 0;
		
		while (resp == 1) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			i++;
			
			if (x>y)
				in++;
				
			else if(x<y)
				gr++;
				
			else
				emp++;
				
			System.out.println("Novo grenal (1-sim 2-nao)");
			resp = sc.nextInt();
		}
		
		System.out.println(i + " grenais");
		System.out.println("Inter:" + in);
		System.out.println("Gremio:" + gr);
		System.out.println("Empates:" + emp);
		if (in>gr)
			System.out.println("Inter venceu mais");
			
		else if(in<gr)
			System.out.println("Gremio venceu mais");
			
		else
			System.out.println("Nao houve vencedor");
			
		sc.close();
	}
}
