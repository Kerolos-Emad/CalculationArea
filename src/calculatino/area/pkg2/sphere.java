/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatino.area.pkg2;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import static java.lang.Math.PI;
import java.util.Scanner;

public class sphere extends Three_D_Shape
{
protected float R;
    public sphere() {
    }
    public void set_sphere(float new_radius){
    this.R=new_radius;
    }
    public void get_sphere(){
    
    Scanner input =new Scanner(System.in);
    System.out.print("Eneter Radius : ");
    this.R=input.nextFloat();    
    }
    @Override
    public void get_volume() {
        super.get_volume();
        this.volume=(float) ((4/3)*PI*power(R,3));
        System.out.println("the volume of sphere is : "+volume);
    }


@Override
    public void get_area() {
        super.get_area();
        this.area=(float) (4*PI*power(R,2));
        System.out.println("the area of sphere is : "+area);
    }

    
}
