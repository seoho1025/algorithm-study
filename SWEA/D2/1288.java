import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // T입력 
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine()); //각 테스트의 N 
			int arr[] = new int[10];
			int Count = 0;
			int j = 1;
			
			while(Count < 10) {
				int Total = N * j;
				
				//1. 자리수 뽑아서 arr에 저장 
				while(Total > 0) {
					arr[Total % 10]++; // 배수한 값에서 나온 수를 배열에 넣음 
					Total = Total / 10; // 다음 수로 넘어감 
				}
				
				// 2. Count 업데이
				Count = 0;
				for(int k = 0; k < 10; k++) {
					if(arr[k] > 0) Count++;
				}
				j++;
			}
				System.out.println("#" + (i + 1) + " " + (j - 1) * N );			
		}
		
	}
}
