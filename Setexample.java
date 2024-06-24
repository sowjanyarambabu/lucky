import java.util.*;

public class Setexample {
    public static void main(String[] args) {
        // create an object of set
        Set<String> s1 = new HashSet<String>();
        s1.add("lucky");
        s1.add("cherry");
        s1.add("sowji");
        System.out.println(s1);
        s1.remove("sowji");
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Object s = itr.next();
            System.out.println(s);
        }

    }
}
