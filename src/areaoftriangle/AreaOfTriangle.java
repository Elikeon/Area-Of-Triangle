
/*
 * Jared Craig
 * 07/09/2018
 * Area of triangle
 */ 

package areaoftriangle;

import javax.swing.*;

/**
 *
 * @author jacra1226
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String sidea = JOptionPane.showInputDialog("Input side a");
       String sideb = JOptionPane.showInputDialog("Input side b");
       String angleC = JOptionPane.showInputDialog("Input angle C");
       double sideaDb =  Double.parseDouble(sidea); 
       double sidebDb =  Double.parseDouble(sideb); 
       double angleCDb =  Double.parseDouble(angleC); 
                 double angleC2 = Math.sin(angleCDb);
     double anwser = ((sideaDb + sidebDb  +  angleC2) /2);
     System.out.println("The area of the scalene triange is  " + anwser);
    }
    
}
