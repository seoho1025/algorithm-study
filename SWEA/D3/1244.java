import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
    static int answer;
    static Set<String> visited;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String S = st.nextToken();
            int M = Integer.parseInt(st.nextToken());

            int[] map = new int[S.length()];
            for (int k = 0; k < S.length(); k++) {
                map[k] = S.charAt(k) - '0';
            }

            answer = Integer.MIN_VALUE;
            visited = new HashSet<>();

            dfs(map, M, 0);

            sb.append("#").append(i + 1).append(" ").append(answer).append("\n");
        }

        System.out.print(sb);
    }

    static void dfs(int[] map, int M, int count) {
     
        String state = arrayToString(map) + count;
        if (visited.contains(state)) return;
        visited.add(state);

       
        if (count == M) {
            int value = Integer.parseInt(arrayToString(map));
            answer = Math.max(answer, value);
            return;
        }


        for (int i = 0; i < map.length - 1; i++) {
            for (int j = i + 1; j < map.length; j++) {
                swap(map, i, j);
                dfs(map, M, count + 1);
                swap(map, i, j); 
            }
        }
    }

    static String arrayToString(int[] map) {
        StringBuilder sb = new StringBuilder();
        for (int n : map) sb.append(n);
        return sb.toString();
    }

    static void swap(int[] map, int i, int j) {
        int temp = map[i];
        map[i] = map[j];
        map[j] = temp;
    }
}