
class Laptop { //class
//CLASS AND ITS PROPERTIES
    String name;
    int show() {  //function
        System.out.println("Brand name is " + name);
        return 1;
    }
}

public class demo {
    public static void main(String args[]) { //main method
        //object creation
        Laptop l1 = new Laptop();
        l1.name = "LEVENO";
        l1.show();
        System.out.print(l1.show());
    }
}
