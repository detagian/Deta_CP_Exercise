/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_3_codingpractice;

/**
 *
 * @author User
 */
public class Shape_Circle implements Shape_Interface{
    private double R;
    final private double phi = 3.14;

    public Shape_Circle(double R) {
        this.R = R;
    }

    public double Get_R() {
        return R;
    }

    public double Get_Phi() {
        return phi;
    }

    public void Set_R(double R) {
        this.R = R;
    }
    
    
    @Override
    public double Calculate_Area() {
        return 2*Get_Phi()*Get_R();
    }

    @Override
    public String toString() {
        return "Circle Area = "+Calculate_Area();
    }
    
}
