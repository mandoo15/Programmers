import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 명령의 수 n
        sc.nextLine();
//        Queue<String> queue = new LinkedList<>();
        LinkedList<String> queue = new LinkedList<>(); // deque 또는 linkedlist를 이용해 맨 뒤의 큐 데이터를 확인할 수 있다. ( 그냥 큐에서는 바로 확인할 수 있는 함수 x )
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            switch(str[0]){
                case "push":
                    queue.offer(str[1]);
                    break;
                case "pop":
                    if(!queue.isEmpty()) {
                        String txt = queue.poll();
                        sb.append(txt).append("\n");
                    }
                    else sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(!queue.isEmpty()) {
                        sb.append(0).append("\n");
                    }
                    else sb.append(1).append("\n");
                    break;
                case "front":
                    if(!queue.isEmpty()) {
                        sb.append(queue.peek()).append("\n");
                    }
                    else sb.append(-1).append("\n");
                    break;
                case "back":
                    if(!queue.isEmpty()) {
                        sb.append(queue.getLast()).append("\n");
                    }
                    else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.print(sb); // 출력
    }
}