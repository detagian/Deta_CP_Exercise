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
public class Shape_Triangle implements Shape_Interface{
    private double height;
    private double base;

    public Shape_Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double Get_Height() {
        return height;
    }

    public double Get_Base() {
        return base;
    }

    public void Set_Height(double height) {
        this.height = height;
    }

    public void Set_Base(double base) {
        this.base = base;
    }
    
    
    @Override
    public double Calculate_Area() {
        return Get_Height()*Get_Base()/2;
    }

    @Override
    public String toString() {
        return "Triangle Area= "+Calculate_Area();
    }
    
    
    
}
