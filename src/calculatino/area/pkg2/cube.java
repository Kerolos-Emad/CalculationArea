/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatino.area.pkg2;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import static java.lang.Math.PI;
import java.util.Scanner;
public class cube extends Three_D_Shape{
private float len;
    public cube() {
    }
    public void set_cube(float new_len){
    this.len=new_len;
    }
    public void get_cube(){
     Scanner input =new Scanner(System.in);
     System.out.println("enter length of the cube :\n");
     this.len=input.nextFloat();
     
     
    }
    @Override
    public void get_volume() {
        super.get_volume();
        this.volume=(float) power(len,3);
        System.out.println("thevolume of cube is : "+volume+"\n");
    }

    @Override
    public void get_area() {
        super.get_area();
        this.area=(float)(6*power(len,2));
        System.out.println("the area of cube is"+area+"\n");
    }
}
