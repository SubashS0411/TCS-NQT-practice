//(Formula and Unit Conversion)
//
//These are extremely common in TCS.
//
//        1. m/s → km/hr ⭐⭐⭐⭐⭐
//
//Formula
//
//km/hr = m/s × 18/5
//Example
//
//10 m/s
//
//        Output
//
//36 km/hr
public class TDSPractice {
    public static void main(String[] args) {
//        int kmhrs=20;
//        System.out.println("km/hrtom/s="+(double)(kmhrs*5/18));
//        double kmhr=73;
//        double ms=kmhr*5/18;
//        System.out.println(ms);
        double distance=100;
        double speed=50;
        double time=distance/(speed);
        System.out.printf("%.1f",time);
    }
}
