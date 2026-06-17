import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			LinkedList<Integer> list = new LinkedList<>();
			for(int i = 0; i < N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			int M = Integer.parseInt(br.readLine());
			
            StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				String input = st2.nextToken(); // I(삽입)
				int x = Integer.parseInt(st2.nextToken()); // x의 위치 
				int y = Integer.parseInt(st2.nextToken()); // y개의 개수 
				
				for(int k = 0; k < y; k++) {
					int num = Integer.parseInt(st2.nextToken());
					list.add(x + k, num);
				}
			}
			sb.append("#").append(t).append(" ");
			for(int i = 0; i < 10; i++) {
				sb.append(list.get(i)).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}