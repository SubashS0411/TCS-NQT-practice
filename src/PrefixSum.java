import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={100, 200, 50, 300, 150, 500, 100};
        int [] psum=new int[arr.length];
        psum[0]=arr[0];
        for (int i = 1; i < psum.length ; i++) {
            psum[i]=psum[i-1]+arr[i];
        }

        System.out.println(Arrays.toString(psum));
        System.out.println(ranges(psum,2,4));
    }
    public static int ranges(int[] psum,int start,int end){
        if(start==0){
            return psum[end];
        }
        return psum[end]-psum[start-1];
    }
}
