public class operators {
    public static void main(String arg[]){
        int a=2;
        int b=5;
        int sol1=(a*b/a);
        int sol2=(a*(b/a));
        System.out.println(sol1);
        System.out.println(sol2);

        //q
        int x,y,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.print(x+" "+y+"  "+z);
    }
    
}
