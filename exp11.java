/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double rad,area,perimeter,peri;
                double pi=3.14;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        rad=s.nextDouble();
        //System.out.println("enter the perimeter of the circle");
        //peri=s.nextInt();
        area=pi*rad*rad;
        peri=2*pi*rad;
        System.out.println("area="+area);
        System.out.println("perimeter="+peri);
        
        
    }
    
}