import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String r1 = sc.nextLine();
		String r2 = sc.nextLine();
		String r3 = sc.nextLine();
		
		switch (r1) {
		
			case "vertebrado":
				if (r2.contentEquals("ave")) {
					if (r3.equals("carnivoro"))
						System.out.println("aguia");
					else
						System.out.println("pomba");
				} 
				else {  
					if (r3.equals("onivoro"))
						System.out.println("homem");
					else
						System.out.println("vaca");
				}
				break;
			case "invertebrado":
				if (r2.contentEquals("inseto")) {
					if (r3.equals("hematofago"))
						System.out.println("pulga");
					else
						System.out.println("lagarta");
				} 
				else {  
					if (r3.equals("hematofago"))
						System.out.println("sanguessuga");
					else
						System.out.println("minhoca");
				}
				break;
		}
		sc.close();
	}
}
