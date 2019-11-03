import java.util.Scanner;

public class URI2003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String hora = sc.nextLine();
			int minTotal = 60;
			
			int h = Integer.parseInt(hora.substring(0,1));
			minTotal += h*60;
			int minD = Integer.parseInt(hora.substring(2,3));
			minTotal += minD*10;
			int minU = Integer.parseInt(hora.substring(3));
			minTotal += minU;
			
			if (minTotal > 480)
				System.out.println("Atraso maximo: " + (minTotal-480));
			else
				System.out.println("Atraso maximo: 0");
		}
		
			
		sc.close();
		
	}

}
