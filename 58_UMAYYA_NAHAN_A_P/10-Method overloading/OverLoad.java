import java.util.Scanner;
class OverLoadDemo{
    void area(float a){
        System.out.println("The area of square is "+Math.pow(a,2)+" sq units");
    }
    void area(float l,float b){
        System.out.println("The area of rectangle is "+l*b+" sq units");
    }
    void area(double r){
        System.out.println("The area of circle is "+3.14*r*r+" sq units");
    }
}
class OverLoad{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float a,l,b;
        double r;
        OverLoadDemo ob=new OverLoadDemo();
        System.out.print("Square \n");
        System.out.print("Enter the length : ");
        a=s.nextFloat();
        ob.area(a);   
        System.out.print("\nRectangle \n");
        System.out.print("Enter the length : ");
        l=s.nextFloat();
        System.out.print("Enter the breadth : ");
        b=s.nextFloat();
        ob.area(l,b);
        System.out.print("\nCircle \n");
        System.out.print("Enter the radius : ");
        r=s.nextDouble();
        ob.area(r);
    }
}