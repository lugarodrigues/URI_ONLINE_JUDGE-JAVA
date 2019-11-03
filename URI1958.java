import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1958 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0000E00");
		double n = sc.nextDouble();
		
		String cientS = df.format(n);
		char[] cientC = new char[12];
		
		if (cientS.charAt(0) != '-') {
			
			cientC[0] = '+'; 
			
			for (int i=0; i<cientS.length(); i++)
				cientC[i+1] = cientS.charAt(i);
		} else {
			for (int i=0; i<cientS.length(); i++)
				cientC[i] = cientS.charAt(i);
		}
			
		
		if (cientC[8] != '-') {	
			if (cientC[10] == '0')
				cientC[11] = cientC[10];
			cientC[10] = cientC[9];
			cientC[9] = cientC[8];
			cientC[8] = '+';
		}
		
		if (cientC[11] == '0') { 
			for (int i=0; i<12; i++)
				System.out.print(cientC[i]);
			System.out.println();
		} else {
			for (int i=0; i<11; i++)
				System.out.print(cientC[i]);
			System.out.println();
		}
		
		sc.close();
	}
}
