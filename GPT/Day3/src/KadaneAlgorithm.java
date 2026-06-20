//Problem 7: Maximum Subarray Sum (Kadane's Algorithm)
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int current=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            current+=arr[i];
            max=Math.max(max,current);
            if(current<0){
                current=0;
            }
        }
        System.out.println(max);
    }
}
