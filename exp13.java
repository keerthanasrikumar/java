/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;
import java.util.*;

/**
 *
 * @author Karthikeyan
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area,peri,width,height;
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter the width and height=");
        width=s.nextDouble();
        height=s.nextDouble();
        area=width*height;
        peri=2*(width+height);
        System.out.println("AREA="+area);
        System.out.println("PERIMETER="+peri);
    }
    
}