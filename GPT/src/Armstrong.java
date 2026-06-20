import java.util.*;
//4. Armstrong Number ⭐⭐⭐⭐⭐
public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int ori=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+= (int) Math.pow(digit,3);
            n/=10;
        }
        if(ori==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
        System.out.println(sum);
    }
}
