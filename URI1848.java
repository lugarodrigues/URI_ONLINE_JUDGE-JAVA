import java.util.Scanner;

public class URI1848 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String linha;
		int i = 0;
		int soma = 0;
		
		while (i < 3) {
			
			linha = sc.nextLine();
			
			if (linha.equals("caw caw")) {
				i++;
				System.out.println(soma);
				soma = 0;
			}
			
			else {
				
				if (linha.charAt(0) == '*')
					soma+=4;

				if (linha.charAt(1) == '*')
					soma+=2;

				if (linha.charAt(2) == '*')
					soma+=1;
			}	
		}	
		sc.close();
	}
}
