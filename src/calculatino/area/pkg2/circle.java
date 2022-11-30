/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatino.area.pkg2;


import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import static java.lang.Math.PI;
import java.util.Scanner;


public class circle extends Two_Dimensional_Shape {
protected float Diameter;
    public circle() {
    }
    public void set_circle(float D){
    this.Diameter=D;
    }
    public void get_circle() {
        Scanner input =new Scanner(System.in);
        System.out.print("enter half diameter : ");
       Diameter = input.nextFloat();
      
}
    @Override
    public void get_primeter() {
        super.get_primeter();
         primeter = (float) (2*PI*Diameter);
        System.out.print("\nthe primeter of circle is :  "+primeter+"\n");
    }

    @Override
    public void get_area() {
        super.get_area();
         area =  (float) (PI*(power(Diameter,2)));
        System.out.println("the area of circle is:  "+area+"\n");
    }
    
    
}