
public class q {

    public static float getshortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); //ye kya likhe hai ? yaha humne path string ke har character ko access karne ke liye charAt() method ka use kiya hai. ye method hume string ke specified index par character return karta hai.
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2); //this line of code calculates the Euclidean distance from the origin (0,0) to the point (x,y) using the Pythagorean theorem. It squares the x and y coordinates, adds them together, and then takes the square root of the sum to get the distance. The result is cast to a float before being returned.

    }

    public static void main(String[] args) {
        //given  A ROUTR CONATAINING 4 DIRECTION (E,W,N,S) FIND
        //THE SHORTEST ROUTE TO REACH THE DESTINATION
        //wneenesennn
        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
}
//yeeeeee solved:)
