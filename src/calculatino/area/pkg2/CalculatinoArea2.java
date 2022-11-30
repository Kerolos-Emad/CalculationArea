
package calculatino.area.pkg2;


import java.util.Scanner;

public class CalculatinoArea2 {
public static void main(String[] args){
    
    Scanner input=new Scanner(System.in);
    int x=1 ,y,z;
    
    while(x!=0){
    System.out.print("-------CALCULATION AREA OF SHAPES-------\n");    
    System.out.println("what do you want (two Dimensional) or (three Dimensional) shape  ?");
    System.out.println("Enter  1 : for 2D_shape");
    System.out.println("Eneter 2 : for 3D_Shape");
    System.out.println("Eneter 0 : for exit \n");
    System.out.print(" Enter your chooice :");
    x = input.nextInt();
    
    switch(x){
        
        case 1:
            System.out.print("---- THIS SHAPES IS AVILABLE NOW ----\n Triangel , Circle , Square , Trapezoid \n");
            
            System.out.println("Enetr 1 : for Triangel ");
        
            System.out.println("Enter 2 : for Circle ");
            System.out.println("Enter 3 : for Square ");
            System.out.println("Enter 4 : for Tapezoid \n");
            System.out.print("Enter the chooice : \n");
            y=input.nextInt();
            switch (y){
            case 1 : 
                triangel t1 = new triangel();
                t1.get_triangel();
                t1.get_primeter();
                t1.get_area();
                break;
            case 2 :
                circle c1 = new circle();
                c1.get_circle();
                c1.get_primeter();
                c1.get_area();
                break ;
            case 3 :
                    square s1 = new square();
                    s1.get_square();
                    s1.get_primeter();
                    s1.get_area();
                    break;
            case 4: 
                    trapezoid T = new trapezoid();
                    T.get_trapezoid();
                    T.get_primeter();
                    T.get_area();
                    break;
            default :
                    System.out.println("\t Your Chooice Is Not Avilable \t Error !! \t Try Again\n");
                    break;
                   
            }
        break;    
        case 2:
            System.out.print("---- THIS SHAPES IS AVILABLE NOW ----\n SPHERE && CUBE \n");
            System.out.println("Enter 1 : for Sphere \nEnter 2 : for Cube ");
            System.out.print("Enter the chooice : \n");
            z=input.nextInt();
            switch(z){
                case 1:
                    sphere s = new sphere();
                    s.get_sphere();
                    s.get_volume();
                    s.get_area();
                    break;
                case 2:
                    cube c = new cube();
                    c.get_cube();
                    c.get_volume();
                    c.get_area();
                    break;
                   
                default :
                    System.out.println(" \t Your Chooice Is Not Avilable \t Error !! \t Try Again\n");
                    break;
            }
        break;
        case 0:
            System.out.println("\t---Thank You---");
            break;
        default :
            System.out.println("\t Your Chooice Is Not Avilable \t Error !! \t Try Again\n");
            break;
           }
       
        }
    }
}


