/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex52;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the A,B,C values=");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        //String aa=a;
        
        int d=a+b;
        System.out.println((c==d)?true:false);
    }
    
}