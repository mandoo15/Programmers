import java.util.*;

/* My solution
 * 1. 처음엔 N번까지 오름차순 정렬 후 K번째 숫자 제거
 * 2. 'K+1번째 ~ N번째' + '1 ~ K번째' 순으로 배열 재배치 후 K번째 숫자 제거 ( 반복 )
 * 3. 제거된 숫자는 새로운 배열에 저장
 * 4. 3을 RETURN */

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {  // 1~N까지 숫자 리스트에 추가
            arr.add(i);
        }

        List<Integer> answer = new ArrayList<>();
        int index = 0;

        while (!arr.isEmpty()) {
            index = (index + k - 1) % arr.size(); // K번째 요소의 인덱스 찾기
            answer.add(arr.remove(index)); // K번째 요소 제거하고 결과 리스트에 저장
        }

        // 정답 출력
        System.out.println("<" + String.join(", ", answer.stream().map(String::valueOf).toArray(String[]::new)) + ">");
    }
}