import java.util.Arrays;

public class DuplicatesCount {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,3};
        int slow=1;
        for (int fast=1;fast<arr.length;fast++) {
            if(arr[fast]!=arr[fast-1]){
                arr[slow]=arr[fast];
                slow++;
            }
            System.out.println(slow);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,slow)));
        System.out.println(slow);
    }
}
