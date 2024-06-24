public class Staticbasic {
    static int a =10;

    static{
        System.out.println(a);
        a=20;
        System.out.println("static block");
        System.out.println(a);

    }
    static void Display() {
       a=30;
       System.out.println("static method");
       System.out.println(a);
    
 }
 public static void main(String[] args) {
    System.out.println("main method");
    System.out.println(a);
    Display();
 }
}       