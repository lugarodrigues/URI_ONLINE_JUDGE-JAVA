import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.StringTokenizer;

public class URI2222 {

	public static void main(String[] args) {
		
		InputStream inputStream = System.in;
        InputReader sc = new InputReader(inputStream);
        Collection<Integer> colecao = new HashSet<Integer>();
	
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			
			int n = sc.nextInt();
			
			long[] conj = new long[n];
			
			for(int j=0; j<n; j++) {
				
				int nElem = sc.nextInt();
				colecao.clear();
				
				for (int k=0; k<nElem; k++) {
					
					int num = sc.nextInt();
					if (colecao.contains(num)==false)
						conj[j] += (long) Math.pow(2, num);
					colecao.add(num);
			
				}
			}	
			int qtdOp = sc.nextInt();
			
			for (int j=0; j<qtdOp; j++) {
				
				int op = sc.nextInt();
				int cj1 = sc.nextInt();
				int cj2 = sc.nextInt();
				int ele = 0;
				String res;
				if (op == 1)  //intersec
					res = Long.toBinaryString(conj[cj1-1]&conj[cj2-1]);
				else           //uniao
					res = Long.toBinaryString(conj[cj1-1]|conj[cj2-1]);
				
				for (int k=0; k<res.length();k++) {
					if (res.charAt(k) == '1')
						ele++;
				}
					System.out.println(ele);		
			}	
		}
	
	}
	
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}
