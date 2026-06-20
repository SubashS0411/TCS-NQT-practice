import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int range = 22;
        int[] arr = new int[range+1];
        arr[0] = a;
        arr[1] = b;
        for (int i = 2; i <=range; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(recursion(range));
    }

    public static int recursion(int range) {


        if (range == 0 ) return 0;
        if( range == 1) return  1;
        return recursion(range-1 ) + recursion(range - 2);
    }
}