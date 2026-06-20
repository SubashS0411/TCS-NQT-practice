public class GCD {
    public static void main(String[] args) {
        int a=12,b=18;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
