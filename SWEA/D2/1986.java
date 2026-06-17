import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int sum = 0;
			for(int j = 1; j <= N; j++) {
				if(j % 2 == 0)sum -= j;
				if(j % 2 != 0)sum += j;
			}
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(i + 1).append(" ").append(sum).append("\n");
			
			System.out.print(sb);
		}
	}
}
	