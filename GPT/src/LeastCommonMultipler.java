//8. LCM ⭐⭐⭐⭐
public class LeastCommonMultipler
{
    public static void main(String[] args) {
        int a=12,b=18;
        int x=a,y=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
//        int gcd=a;
        int lcm=(x*y)/gcd(a,b);
//        System.out.println(gcd);
        System.out.println(lcm);
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
