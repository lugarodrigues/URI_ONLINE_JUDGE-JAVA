import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1564 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		
		while ((linha = br.readLine()) != null) {
			
			int n = Integer.parseInt(linha);
			
			if (n == 0) 
				System.out.println("vai ter copa!");
			else
				System.out.println("vai ter duas");
			
		}
	}
}
