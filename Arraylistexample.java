import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<Object>();
        a1.add(10);
        a1.add(10.5);
        a1.add("HEllo");
        a1.add('a');
        a1.add(9951705141L);
        System.out.println(a1);

        ArrayList<Object> a2 = new ArrayList<Object>();
        a2.add(5);
        a2.add(10.5);
        a2.add("hi");
        a1.addAll(a2);
        System.out.println(a1);

    }
}
