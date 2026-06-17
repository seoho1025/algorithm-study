import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H1 = Integer.parseInt(st.nextToken());
			int M1 = Integer.parseInt(st.nextToken());
			int H2 = Integer.parseInt(st.nextToken());
			int M2 = Integer.parseInt(st.nextToken());
				
			int Hsum = H1 + H2;
			int	Msum = M1 + M2;
			
			if( Msum >= 60) {
				Hsum++; 
				Msum -= 60;
			} 
			if(Hsum > 12) {
					Hsum -= 12;
				}				
			System.out.println("#" +(i + 1) + " " + Hsum + " " + Msum);
		}
	}
}
 