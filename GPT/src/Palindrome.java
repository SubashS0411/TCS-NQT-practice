public class Palindrome {
    public static void main(String[] args) {
        int n=123;
        int ori=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==ori){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder(s).reverse();
        if(s.equals(sb.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j++)){
                System.out.println(i+","+j+",");
                return false;
            }
        }
        return true;
    }

}
