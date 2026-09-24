//by swap ex.

public class call_byValue {

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("value of a ie " + a);
        System.out.println("value of b is " + b);
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 12;
        swap(a, b);
    }
}
