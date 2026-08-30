
class Laptop {
//CLASS AND ITS PROPERTIES

    String name;

    int show() {
        System.out.println("Brand name is " + name);
        return 1;
    }
}

public class A {

    public static void main(String args[]) {
        //object creation
        Laptop l1 = new Laptop();
        l1.name = "LEVENO";
        l1.show();
        System.out.print(l1.show());
    }
}
