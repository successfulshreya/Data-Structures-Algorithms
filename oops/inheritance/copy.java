
class Ajj{
    String color;
    int num;    //class always must have 

    Ajj(String color,int num){ //CONSTRUCTOR NAME SHOULDBE SAME AS CLASS NAME
    this.color=color;
    this.num=num;
    }  
    Ajj(Ajj b){
       this.color=b.color;
    }
}
public class copy{
    public static void main (String args[]){

     Ajj f1 = new Ajj("yeloow",1);
     //copy constructor-------  ---------------------------------------------------

     Ajj b1 =new Ajj(f1);
    }
}