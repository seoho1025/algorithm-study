import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //첫번재 줄에서 컴퓨터 수 N이 주어짐
        int T = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        //정수를 담을 빈 리스트을 선언(ArrayList의 길이를 아는 것은 ArrayList.size()로 int[]list 일 경우에는, list.length; 로 알 수 있음)
        ArrayList<ArrayList<Integer>>list = new ArrayList<>(); // 배열을 여러가지 만들어야 할 때 자바에서는 해당 코드처럼 선언을 함


        for(int i = 1; i <= N + 1; i++ ){
            list.add(new ArrayList<>()); // 여러개의 빈 배열을 만들기 위해서 선언
        }


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍 A
            int B = Integer.parseInt(st.nextToken()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍 B

            //양방향임을 의미하는 코드
            list.get(A).add(B); // A에 B를 넣음
            list.get(B).add(A); // B에 A를 넣음
        }

        boolean[]visited = new boolean[N + 1]; // 방문 여부를 체크하는 배열(감염 여부가 true인지 false인지를 확인하기 위해서)
        Queue<Integer> q = new LinkedList<>(); // 대기줄

        visited[1] = true; // 1번 감염
        q.offer(1); // 줄에 1번 넣기(출발선)
        int count = 0; // 감염된 컴퓨터 개수

        while(!q.isEmpty()){ //queue에 있는 수가 전부 확인 될 때 까지
            int now = q.poll(); // 줄 맨 앞 꺼내기

            for(int next : list.get(now)){
                if(visited[next] == false){
                    visited[next] = true;
                    count++;
                    q.offer(next);
                }
            }
        }
        System.out.println(count);
    }
}