/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan = new Scanner( System.in );
     
     System.out.println( " Please enter values for a, b, and c.\n");
     System.out.print("a = " );
     double a = scan.nextDouble();
     System.out.print( "b = " );
     double b = scan.nextDouble();
     System.out.print("c = " );
     double c = scan.nextDouble();
     
     double x1 = ( -b + Math.sqrt( (Math.pow(b,2) - 4 * a * c))) / (2 * a);
     double x2 = ( -b - Math.sqrt( (Math.pow(b,2) - 4 * a * c))) / (2 * a);
     
     System.out.println("Given a = " + a + ", b = " + b + ", and c = " + c + ", "
                       + "the solutions to the quadratic equation are x = " + x1
                       + " and " + x2 + ".");
    }
    
}
