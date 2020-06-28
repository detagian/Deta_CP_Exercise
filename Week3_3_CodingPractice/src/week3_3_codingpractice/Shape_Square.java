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
public class Shape_Square implements Shape_Interface{
    private double Side;
    
    public Shape_Square(double Side){
        
        this.Side = Side;
    }
    public Shape_Square() {
    }

    public double Get_Side() {
        return Side;
    }

    public void Set_Side(double Side) {
        this.Side = Side;
    }

    @Override
    public double Calculate_Area() {
        return Get_Side()*Get_Side();
    }
    
    @Override
    public String toString() {
        return "Square Area = "+Calculate_Area();
    }

}