import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			int Total_A = P * W;
			int Total_B = 0;
			int Exceed = W - R;
			 
			if(W < R) {
				Total_B = Q;
			}else {
				Total_B = Q + (Exceed * S);
			}
			
			if(Total_A > Total_B) {
				System.out.println("#" + (i + 1) + " " + Total_B);
			}else {
				System.out.println("#" + (i + 1) + " " + Total_A);
			}
		}
	}
}
