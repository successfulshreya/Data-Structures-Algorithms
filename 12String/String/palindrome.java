package String;
public class palindrome{

    public static boolean pal(String s){

        String clean=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String Reversed = new StringBuilder(clean).reverse().toString();
       return clean.equals(Reversed);

    }
   public static void main(String[] args) {
    String s = "rar";
    System.out.println(pal(s));
    }

}
    