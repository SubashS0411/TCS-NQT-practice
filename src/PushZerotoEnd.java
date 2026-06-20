import java.util.Arrays;
public class PushZerotoEnd {
    public static void main(String [] args){
        int[] arr = {4, 0, 5, 0, 1, 9, 0, 0, 2};
        int slow=0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
