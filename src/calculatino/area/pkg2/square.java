/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatino.area.pkg2;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import static java.time.Clock.system;
import java.util.Scanner;

public class square extends Two_Dimensional_Shape {

    
    
    protected int length;

    public square(){
    
    }
    public void set_square(int l){
    this.length=l;
    }
    public void get_square() {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your length : \t");
     this.length = input.nextInt();
       
    }

    @Override
    public void get_primeter() {
        super.get_primeter();
        primeter = length*4;
        System.out.println("the primeter of square is : "+primeter+"\n");
    }

    @Override
    public void get_area() {
        super.get_area();
        area =(float) power(length,2);
        System.out.println("the area of square is:  "+area+"\n");
    }
    
}
//    OVERLOAD
//    public void fuc(int l)
//    {
//    
//    }
//    
//    public void fuc(int l ,int x)
//    {
//    
//    }
    
