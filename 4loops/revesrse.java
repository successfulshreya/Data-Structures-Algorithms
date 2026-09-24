public class revesrse {
    public static void main (String arg[]){
        int n=10899;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            System.err.print(lastdigit);
            n=n/10;
        }
        System.err.println(rev);
    }
}
