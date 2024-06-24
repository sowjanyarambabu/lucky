
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setexample2 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        a.add(40);
        a.add(20);
        a.add(30);
        System.out.println("number" + a);

        Set<Integer> b = new HashSet<Integer>();
        b.add(40);
        b.add(50);
        b.add(60);
        System.out.println("number" + b);

        a.retainAll(b);
        System.out.println("retainall" + a);

        a.addAll(b);
        System.out.println("number" + a);

        b.clear();
        System.out.println("number" + b);

        a.contains(10);
        System.out.println("contain" + a);

        a.containsAll(b);
        System.out.println("containall" + b);

        a.removeAll(b);
        System.out.println("removeall" + b);

        a.isEmpty();
        System.out.println("empty"+ a);

        Iterator<Integer> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
