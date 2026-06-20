public class LetterFrequency {
    public static void main(String[] args) {
        String a="programming";
        int[] freq=new int[256];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)]++;
        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(freq[ch]>0){
                System.out.print(ch+""+freq[ch]+" ");
                freq[ch]=0;
            }
        }
    }
}
