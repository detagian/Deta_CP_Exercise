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
public class Shape_Kite implements Shape_Interface {
    private double Diagonal_1;
    private double Diagonal_2;

    public Shape_Kite(double Diagonal_1, double Diagonal_2) {
        this.Diagonal_1 = Diagonal_1;
        this.Diagonal_2 = Diagonal_2;
    }

    public double Get_Diagonal_1() {
        return Diagonal_1;
    }

    public double Get_Diagonal_2() {
        return Diagonal_2;
    }
        public void Set_Diagonal_1(double Diagonal_1) {
        this.Diagonal_1 = Diagonal_1;
    }

    public void Set_Diagonal_2(double Diagonal_2) {
        this.Diagonal_2 = Diagonal_2;
    }
    
    
    
    @Override
    public double Calculate_Area() {
        return Get_Diagonal_1()*Get_Diagonal_2()/2;
    }

    @Override
    public String toString() {
        return "Kite Area= "+Calculate_Area();
    }


    
}
