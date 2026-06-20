public class StrongNumber {
    public static void main(String[] args) {
        int n=145;
        int sum=0;
        int after=n;
        int k;
        while(n>0){
            k=n%10;
            sum=sum+fact(k);
            n=n/10;
        }
        System.out.println(sum);
        if(after==sum){
            System.out.println(sum+"Yes"+n);
        }
        else{
            System.out.println(sum+"No"+n);
        }
    }
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}
