import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t = 1; t <= 10; t++) {
			Stack<Integer>stack = new Stack<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for(int i = 0; i < N; i++) {
				int s = str.charAt(i) - '0';
				
				if(!stack.isEmpty() && stack.peek() == s) {
					stack.pop();
				}else {
					stack.push(s);
				}
			}
			System.out.print("#" + t + " ");
			for(int num : stack) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
			