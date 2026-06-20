public class SecondSmallest {
    public static void main(String[] args)
    {
        int[] arr = {10,20,5,40,30,35};
        int max=Integer.MAX_VALUE;
        int secondmax=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]<secondmax &&arr[i]!=max){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
