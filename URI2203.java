import java.util.Scanner;

public class URI2203 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		while(sc.hasNext()) {
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int v1 = sc.nextInt();
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			
			double dist = Math.sqrt((double)Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)) + 1.5*v1;
			
			double range = (double)r1 + r2;
			
			if (range < dist)
				System.out.println("N");
			else
				System.out.println("Y");
		}	
		sc.close();
	}
}
