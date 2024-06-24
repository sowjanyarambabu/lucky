public class Passbyreference {
    int id;
    String name;
    int salary;

    public static void main(String[] args) {
        Passbyreference obj = new Passbyreference();
        System.out.println(obj);
        System.out.println(obj.name+" "+obj.id+" "+obj.salary);
        obj.name ="rani";
        obj.id = 1;
        obj.salary = 20000;
        System.out.println(obj.name+" " +obj.id+" "+ obj.salary);

    }
}
