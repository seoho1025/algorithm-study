import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int T = Integer.parseInt(br.readLine());
		
		String table = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		
		for(int i = 0; i < T; i++) {
			String tc = br.readLine();
			System.out.print("#" + (i + 1) + " ");
			
			for(int j = 0; j < tc.length(); j += 4) { // 항상 4로 처리 
				int n0 = table.indexOf(tc.charAt(j));
				int n1 = table.indexOf(tc.charAt(j + 1));
				int n2 = table.indexOf(tc.charAt(j + 2));
				int n3 = table.indexOf(tc.charAt(j + 3));
				
				int buffer = (n0 << 18) | (n1 << 12) | (n2 <<6) | n3;
				
				char c1 = (char)(buffer >> 16);
				char c2 = (char)((buffer >> 8) & 0xFF);
				char c3 = (char)(buffer & 0xFF);
				
				System.out.print(c1);
				System.out.print(c2);
				System.out.print(c3);
			}
            System.out.println();
		}
		
	}
}