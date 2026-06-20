public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1;
        int number=5;
        for(int i=0;i<number;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
