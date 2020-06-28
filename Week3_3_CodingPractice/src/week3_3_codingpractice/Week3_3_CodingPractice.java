/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_3_codingpractice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Week3_3_CodingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    try {
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        System.out.println("5.kite");
        System.out.print("Select :");

        Scanner Input =  new Scanner (System.in);
        switch ( Input.nextInt() ) {
                case 1:
                    System.out.print("Width:");
                    double Width = Input.nextDouble();
                    System.out.print("Length:");
                    double Length = Input.nextDouble();
                    Shape_Rectangle rc = new Shape_Rectangle(Length,Width);
                    System.out.println(rc.toString());
                    break;
                    
                case 2:
                    System.out.print("Side:");
                    double Side = Input.nextInt();
                    Shape_Square sq = new Shape_Square(Side);
                    System.out.println(sq.toString());
                    break;

                case 3:
                    System.out.print("nilai R:");
                    double R = Input.nextInt();
                    Shape_Circle cr = new Shape_Circle(R);
                    System.out.println(cr.toString());
                    break;

                case 4:
                    System.out.print("Height:");
                    double Height = Input.nextInt();
                    System.out.print("Base:");
                    double Base = Input.nextInt();
                    Shape_Triangle tr = new Shape_Triangle(Height,Base);
                    System.out.println(tr.toString());
                    break;

                case 5:
                    System.out.print("D1:");
                    double d1 = Input.nextInt();
                    System.out.print("D2");
                    double d2 = Input.nextInt();
                    Shape_Kite kt = new Shape_Kite(d1,d2);
                    System.out.println(kt.toString());
                    break;


                default:
                    System.out.println("select 1-5");
            }
    }
    
    catch(InputMismatchException e){
            System.out.println("Error : "+e);
    }
    }
    
}
