
public class String_builder {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("HW");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
            //sb+=ch; //agar ye le lete tho loop 26 baar chalega or har baar naya string banega or time complexity O(n^2) ho jaayegi
        } //time complexity is O(26) which simplifies to O(1) kyuki 26 baar ye loop chalega or O(1) isliye kyuki 26 constant hai 
       
        System.out.println(sb);
    }
}
