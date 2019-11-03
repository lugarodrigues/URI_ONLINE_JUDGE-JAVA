import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI2313 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List<Integer> lados = new ArrayList();
		
		for (int i=0; i<3; i++)
			lados.add(sc.nextInt());
		lados.sort(null);
		
		if (lados.get(0)+lados.get(1)>lados.get(2)) {
			if (lados.get(0)==lados.get(1)&&lados.get(1)==lados.get(2))
				System.out.println("Valido-Equilatero");
			else if (lados.get(0)==lados.get(1)||lados.get(1)==lados.get(2)||lados.get(0)==lados.get(2))
				System.out.println("Valido-Isoceles");
			else
				System.out.println("Valido-Escaleno");
			if (Math.pow(lados.get(2), 2) == Math.pow(lados.get(0), 2) + Math.pow(lados.get(1), 2))
				System.out.println("Retangulo: S");
			else
				System.out.println("Retangulo: N");
		} else
			System.out.println("Invalido");
			
		sc.close();
	}

}
