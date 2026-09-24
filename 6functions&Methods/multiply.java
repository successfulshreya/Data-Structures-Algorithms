
public class multiply {

    public static int calmuli(int a, int b) {
        int produ = a * b;
        return produ;

    }

    public static void main(String arg[]) {
        int x = 10;
        int y = 2;
        int prod = calmuli(x, y);
        System.out.println("a*b:" + prod);
        calmuli(x, y);

    }
}
