import java.util.*;

class qq1 {

    public static String capitalize(String str) {

        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(" ");
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString(); // ye stringBuilder jo ki string ko modify karne k liye use hota hai usko string
                              // me convert karne k liye ye method use hota hai string builder se string
                              // isliye kiye taki hum string ke methods use kar sakein jaise ki length,
                              // charAt, substring
    }

}

public class qq {

    public static void main(String args[]) {
        String str = "hi radha rani ";
        System.out.println(qq1.capitalize(str));
    }
}
