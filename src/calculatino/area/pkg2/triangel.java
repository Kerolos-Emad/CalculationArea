
package calculatino.area.pkg2;

import static java.time.Clock.system;
import java.util.Scanner;


public class triangel extends Two_Dimensional_Shape{

    public triangel() {
    }
    
    protected float length;
    protected float base;
    protected float higth;
    protected float width;

    
    public void set_triangel(float l,float b,float h,float w) {
        length=l;
        base=b;
        higth=h;
        width=w;
       
    }
    
    public void get_triangel(){
        
    Scanner input =new Scanner(System.in);
    System.out.print("Eneter length1 of triangel:");
    this.length=input.nextFloat();
    System.out.print("\nEneter length2 of triangel : ");
    this.width=input.nextFloat();
    System.out.print("\nEneter higth of triangel: ");
    this.higth=input.nextFloat();
    System.out.print("\nEneter Base of triangel : ");
    this.base=input.nextFloat();
    
    }
     @Override
public void get_primeter() {
        super.get_primeter();
         primeter = this.length+this.base+this.width;
        System.out.println("the primeter of triangel is : "+primeter+"\n");
    }
   @Override
    public void get_area() {
        super.get_area();
        area = (float) (0.5*this.base*this.higth);
        System.out.println("the area of triangel is"+area+"\n");
    }}
   

