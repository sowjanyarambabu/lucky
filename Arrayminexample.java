public class Arrayminexample {
    static void minimum(int arr[]) {// static method
        int minvalue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (minvalue > arr[i]) {//30>20
                minvalue = arr[i];
            }
        }
        System.out.println(minvalue);
    }

    public static void main(String[] args) {
        int array[] = { 30, 20,1, 10, 5 };// declaring and initializing an array
        minimum(array);// passing method
    }
}
