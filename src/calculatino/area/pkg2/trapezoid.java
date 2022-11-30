/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatino.area.pkg2;

import java.util.Scanner;

public class trapezoid extends Two_Dimensional_Shape {
    protected float length1,length2,Base1,Base2,higth;

    public trapezoid() {
    }
    public void set_trapezoid(float l1 ,float l2, float b1 , float b2 , float h){
        this.length1=l1;
        this.length2=l2;
        this.Base1=b1;
        this.Base2=b2;
        this.higth=h;
    }
    public void get_trapezoid(){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the first length of trapezoid :  ");
    this.length1=input.nextFloat();
    System.out.print("Enter the second length of trapezoid :  ");
    this.length2=input.nextFloat();
    System.out.print("Enter the first Base of trapezoid : ");
    this.Base1=input.nextFloat();
    System.out.print("Enter the second Base of trapezoid :  ");
    this.Base2=input.nextFloat();
    System.out.print("Enter the Higth of trapezoid : ");
    this.higth=input.nextFloat();
    }
   @Override
    public void get_primeter(){
        super.get_primeter();
        primeter=this.Base1+this.Base2+this.length1+this.length2;
    System.out.println("The primeter of the trapezoid is : ==> " +primeter);
    
    }

    @Override
    public void get_area() {
        super.get_area();
        area=(float)(0.5*(this.Base1+this.Base2)*this.higth);
        System.out.println("\n The area of trapezoid is : ==>" +area);
    }
}
