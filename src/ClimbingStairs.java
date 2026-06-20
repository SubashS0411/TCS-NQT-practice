public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(Stairs(6));

    }
    public static int Stairs(int n) {
        if(n<2) return n;
        return  Stairs(n-1)+Stairs(n-2);
    }
}
