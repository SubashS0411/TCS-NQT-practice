public class ReverseANumber {
    public static void main(String[] args) {
        int num=71;
        int digit=0;
        while(num>0){
            int n=num%10;
           digit=digit*10+n;
           num/=10;
        }
        System.out.println(digit);
    }
}
