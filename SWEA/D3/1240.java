import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        String[] code = {"0001101", "0011001", "0010011", "0111101",
                         "0100011", "0110001", "0101111", "0111011",
                         "0110111", "0001011"};

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] decode = new int[8];
            int decode_count = 0;
            String row = "";

            for (int r = 0; r < N; r++) {
                String bit = br.readLine();
                int index = -1;
                for (int c = 0; c < M; c++) {
                    if (bit.charAt(c) == '1') {
                        index = c;  
                    }
                }
                if (index != -1) {
                    row = bit.substring(index - 55, index + 1);  
                }
            }

            for (int k = 0; k < 56; k += 7) {
                for (int p = 0; p < 10; p++) {
                    if (code[p].equals(row.substring(k, k + 7))) {
                        decode[decode_count] = p;
                        decode_count++;
                        break;
                    }
                }
            }

            int sum = 0;
            for (int k = 0; k < 8; k += 2) sum += decode[k];
            sum *= 3;
            for (int k = 1; k < 8; k += 2) sum += decode[k];

            sb.append("#").append(i).append(" ");
            if (sum % 10 == 0) {
                sum = 0;
                for (int k = 0; k < 8; k++) sum += decode[k];
                sb.append(sum).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}