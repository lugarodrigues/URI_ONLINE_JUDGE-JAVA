import java.util.Scanner;

public class URI1847 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		if(t3-t2 > 0) {
			
			if ((t3-t2)>=(t2-t1))
				System.out.println(":)");
			else
				System.out.println(":(");
				
		} else {
			
			if ((t3-t2)>(t2-t1))
				System.out.println(":)");
			else
				System.out.println(":(");
				
		}	
		
		sc.close();
	}
}
