import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine().trim()); 
            int[] B = new int[N];                      
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(st.nextToken());   
            }

            int result = 0;
            for (int j = 2; j < N - 2; j++) {
                int max = Math.max(B[j-2], B[j-1]);
                max = Math.max(max, Math.max(B[j+1], B[j+2]));

                if (B[j] > max) {
                    result += B[j] - max;
                }
            }

            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }

        System.out.print(sb);
    }