package String;
public class threefourfour {
    public static void REVERSE(char s[]) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    } // REVERSE method yahan khatam hua

    public static void main(String args[]) {
        // Double quotes ("") ki jagah single quotes ('') use karein
        char s[] = {'R', 'a', 'd', 'h', 'e'}; 
        
        REVERSE(s);

        System.out.println(new String(s));
    }
}