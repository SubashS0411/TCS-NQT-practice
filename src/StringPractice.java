import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args){
        String a="dgjkhdsjk";
        char c='h';
        System.out.println(a.length());
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isDigit(c));

        System.out.println((c-'A'));
        char [] arr=a.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
