import java.util.*;

public class Main {
    public static void main(String args[]) {
        Calendar date = Calendar.getInstance();
        
        System.out.println(date.get(date.YEAR));
        System.out.println(date.get(date.MONTH)+1);
        System.out.println(date.get(date.DATE));
    }
}