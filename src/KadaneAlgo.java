public class KadaneAlgo {
    public static void main(String[] args) {
        int [] arr={12,-45,545,69,996,-84, 71};
        int currentSum = 0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            if(currentSum>maxsum){
                maxsum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println(maxsum);

    }
}
