import java.util.*;

class Element {
    int age;
    String name;
    int order;

    public Element(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Element> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            elements.add(new Element(age, name, i));
        }

        elements.sort((a, b) -> {
            if (a.age != b.age) {
                return Integer.compare(a.age, b.age);
            }
            return Integer.compare(a.order, b.order);
        });

        for (Element e : elements) {
            System.out.println(e.age + " " + e.name);
        }
    }
}