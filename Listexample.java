import java.util.*;
public class Listexample {
    public static void main(String[] args) {
        //adding elements to object of list interface
        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(0,10);
        a1.add(1,20);
        System.out.println(a1);
        List<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a1.addAll(1,a2);
        System.out.println(a1);
        a1.remove(1);
        System.out.println(a1);
    }
}
