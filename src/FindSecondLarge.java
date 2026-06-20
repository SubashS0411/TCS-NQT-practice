public class FindSecondLarge {
    public static void main(String[] args) {
        int [] arr={121,45,55,45,89,65};
        int max=arr[0];
        int max2=arr[0];
        for(int num:arr){
            if(num>max){
                max2=max;
                max=num;
            }
            else if(num>max2 && num!=max) {
                max2 = num;
            }
        }
        System.out.println(max2);
    }
}
