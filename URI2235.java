import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI2235 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		List <Integer> anos = new ArrayList<Integer>();
		
		for (int i=0; i<3; i++) {
			int n = sc.nextInt();
			anos.add(n);
		}
		
		anos.sort(null);
		
		if (anos.get(0).equals(anos.get(1)) || anos.get(0).equals(anos.get(2)) || anos.get(2).equals(anos.get(1)))
			System.out.println("S");
		else if (anos.get(2).equals(anos.get(1)+anos.get(0)))
			System.out.println("S");
		else
			System.out.println("N");
		
		sc.close();
	}

}
