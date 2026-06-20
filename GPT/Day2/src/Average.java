public class Average {
    public static void main(String[] args) {
        int arr[]={10,20,15,30,40,35,25};
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        System.out.println(total);
        System.out.println("Average is "+total/arr.length);
//        System.out.println();
    }
}
