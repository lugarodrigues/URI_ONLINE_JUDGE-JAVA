import java.math.BigInteger;
import java.util.Scanner;

public class URI2334 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		String n = sc.nextLine();
		
		BigInteger mUm = new BigInteger("-1");
		
		while(!n.equals("-1")) {
			
			BigInteger bi = new BigInteger(n);
			if (n.equals("0"))
				System.out.println("0");
			else
				System.out.println(bi.add(mUm));
			
			n = sc.nextLine();
		}
		
		sc.close();
	}
}
