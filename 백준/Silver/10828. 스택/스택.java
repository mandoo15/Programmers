import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 명령의 수 n
        sc.nextLine();
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            switch(str[0]){
                case "push":
                    stack.push(str[1]);
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "pop":
                    if(!stack.isEmpty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.print(sb); // 출력
    }
}