import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());

            LinkedList<Integer> list = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                String cmd = st2.nextToken();

                if (cmd.equals("I")) {
                    int x = Integer.parseInt(st2.nextToken());
                    int y = Integer.parseInt(st2.nextToken());

                    for (int k = 0; k < y; k++) {
                        int s = Integer.parseInt(st2.nextToken());
                        list.add(x + k, s);
                    }
                } else {
                    int x = Integer.parseInt(st2.nextToken());
                    int y = Integer.parseInt(st2.nextToken());

                    for (int k = 0; k < y; k++) {
                        list.remove(x);
                    }
                }
            }

            System.out.print("#" + t + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}