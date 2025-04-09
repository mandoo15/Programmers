import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N의 수
        Map<Integer, Integer> nSet = new HashMap<>();
        for(int i=0; i<n; i++) { // N만큼 수 입력 받아 해시맵에 저장
            int num = sc.nextInt();
            if(nSet.containsKey(num)) { // nSet에 num이 있는가
                nSet.put(num, nSet.get(num)+1); // 이미 있으면 count 증가
            } else {
                nSet.put(num, 1); // 없으면 처음으로 추가
            }
        }
        int m = sc.nextInt(); // M의 수
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<m; i++){
            int target = sc.nextInt();
            int count = nSet.getOrDefault(target, 0);
            // 여기서 getOfDefault는 map에서 key가 존재하면 해당 값을 가져오고
            // 없으면 지정한 기본값을 리턴해 주는 메서드
            // 현재 여기선 기본값 0 이므로 값이 없으면 0으로 자동리턴
            buffer.append(count + " ");
        }
        System.out.println(buffer);
    }
}