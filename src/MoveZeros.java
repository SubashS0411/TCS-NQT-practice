import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] arr={0,1,0,2,12};
        int slow=0;
        for (int fast = 0; fast < arr.length; fast++) {
            if(arr[fast]!=0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;

            }
//            System.out.println(arr[fast]+" "+arr[slow]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
