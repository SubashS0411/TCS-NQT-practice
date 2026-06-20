//12. Count Palindromes in Range ⭐⭐⭐⭐⭐ (PYQ)
public class CountPalindrome {
    public static void main(String[] args) {
        int start=11,end=30;
        int count=0;
        for(int i=start;i<=end;i++){
            int n=i;
            int rev=0;
            while(n>0){
                rev=rev*10+n%10;
                n/=10;
            }
            if(rev==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
