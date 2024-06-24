public class Additionofarray {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3,4 };
        int[] array2 = { 4, 5, 6,7 };
        int size = array1.length;
        System.err.println(size);
        int[] sumarray = new int[size];
        for (int i = 0; i < size; i++) {
            sumarray[i] = array1[i] + array2[i];
        }
        System.out.println("sum array;");
        for (int num : sumarray) {
            System.out.print(num + " ");
        }
    }

}
