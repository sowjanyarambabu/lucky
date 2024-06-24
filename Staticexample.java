public class Staticexample {
    static int a =20;
    static int b =s1();
    static{
        System.out.println("static block");
        System.out.println(a);
    }
    static int s1(){
        System.out.println("from s1");
        return 30;
    }
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(a);
        System.out.println(b);
    }
}
