//5. Prime Number ⭐⭐⭐⭐⭐
public class PrimeORNot {
    public static void main(String[] args) {
        int n=12;
        boolean a=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        System.out.println(a?"prime":"not prime");
    }
}
