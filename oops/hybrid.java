public class hybrid {
    public static void main (String args[]){
    
    Animal A=new Animal();
    A.eat();
    
    Fish f1=new Fish();
    f1.eat();
    f1.swim();
     
    Tuna t1=new Tuna();
    t1.eat();
    t1.swim();
    t1.sleep();
    }
} 

class Animal{
    void eat(){
        System.out.println("eats");
    }
}


class Fish extends Animal{
void swim(){
    System.out.println("swims");
}
}
class Tuna extends Fish{
    void sleep(){
        System.out.println("sleeping");
    }
}


class Bird extends Animal{
void fly(){
    System.out.println("flies");
}
}
class Peacock extends Bird{
    void dancing(){
    System.out.println("dance");
    }
}



class Mammel extends Animal{
 void walk(){
    System.out.print("walks");
 }
}
class Dog extends Mammel{
    void puppies(){
        System.out.print("give cute puppy");
    }
}
class Cat extends Mammel{
    void kitten(){
         System.out.print("cute kitty");
    }
   
}
