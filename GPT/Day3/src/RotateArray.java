//Problem 4: Rotate Array Left by K ⭐⭐⭐⭐
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=5;
        k %= arr.length;
        int[] ans=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            ans[i]=arr[(i+k)%arr.length];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
