import java.util.Scanner;

public class URI1837 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int q = a / b;
		
		int r = a - (b * q);
		
		if (a < 0) {
	        if (r < 0) {
	            if (b > 0){
	            	q--;
	                r = r + b;
	            }
	            else {
	                q++;
	                r = Math.abs(b) + r;
	            }
	        }
	    }
		
		System.out.println(q + " " + r);
		
		sc.close();
	}
}
