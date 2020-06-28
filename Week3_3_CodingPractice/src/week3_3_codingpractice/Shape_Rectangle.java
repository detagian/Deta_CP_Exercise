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
public class Shape_Rectangle implements Shape_Interface{
    private double Length;
    private double Width;
    
    public Shape_Rectangle(double Length , double Width){
        
        this.Length = Length;
        this.Width=Width;
    }
    public Shape_Rectangle() {
    }

    public double Get_Length() {
        return Length;
    }

    public double Get_Width() {
        return Width;
    }

    public void Set_Length(double Length) {
        this.Length = Length;
    }

    public void Set_Width(double Width) {
        this.Width = Width;
    }
    
    
    @Override
    public double Calculate_Area() {
        return Get_Length()*Get_Width();
    }
    
    @Override
    public String toString() {
        return "Rectangle Area = "+Calculate_Area();
    }

}
