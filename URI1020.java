import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dias = sc.nextInt();
		
		System.out.println(dias/365 + " ano(s)"); dias %= 365;
		System.out.println(dias/30 + " mes(es)"); dias %= 30;
		System.out.println(dias + " dia(s)"); 
		
		sc.close();
	}

}
