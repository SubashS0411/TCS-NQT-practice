import java.util.Arrays;

public class MountainBikers {
    public static void main(String[] args) {
        int [] arr={-5,1,5,0,-7};
        int [] att=new int[arr.length];
        att[0]=arr[0];
        int low=0;
        for (int i = 1; i <att.length ; i++) {
            att[i]=att[i-1]+arr[i];
            if(low<att[i]){
                low=att[i];
            }
        }
        System.out.println(Arrays.toString(att));
        System.out.println(low);

    }
}
