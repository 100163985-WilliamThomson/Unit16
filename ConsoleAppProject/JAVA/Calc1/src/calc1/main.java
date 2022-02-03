/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc1;

import java.util.Scanner;

/**
 *
 * @author 100163985
 */
public class main 
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("Input a :");
        int a = sr.nextInt();
        System.out.println("enter b :");
        int b = sr.nextInt();
        System.out.println("enter operator (+,-,/,*,%) : ");
        String c = sr.next();
        
        
        calculator CLR = new calculator();
        switch(c){
                case "+" -> System.out.println(CLR.add(a,b));     
                case "-" -> System.out.println(CLR.subtract(a,b));
                case "/" -> System.out.println(CLR.divide(a,b));
                case "*" -> System.out.println(CLR.multi(a,b));    
                case "%" -> System.out.println(CLR.modulo(a,b));
                case default -> System.out.println("Invalid entry.");
                    
                }
    }
   
}

