public class Methodoverloading {
    static int addition(int a,int b){
        return a+b;
    }
    static int addition(int a,int b,int c){
        return a+b+c;
    }
    static double addition(double a,double b){
        return a+b;
    }
   
    public static void main(String[] args) {
        System.out.println(addition(10,20));
        System.out.println(addition(2,3,4));
        System.out.println(addition(1.5, 2.5));
    }
} 
