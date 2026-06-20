import java.util.*;
public class PerfectNumber {
    public static void main(String[] args){
        int n=28;
        int[] arr=new int[(n/2)+1];
        int sum=0;
        for(int i=1;i<arr.length+1;i++){
            if(n%i==0){
                arr[i]=i;
                sum+=i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        if(sum==n){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not a perfect Number");
        }
    }
}
