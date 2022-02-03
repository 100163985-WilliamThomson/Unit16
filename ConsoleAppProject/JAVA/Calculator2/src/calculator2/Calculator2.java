/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculator2;

/**
 *
 * @author 100163985
 */
public class calculator2 
        
{
    String name;
    
    public int add(int x,int y) 
    {
        int z = x+y;
        return z;
    }
    
    public int subtract(int x,int y) 
    {
        int z = x-y;
        return z;
    }
    public int multiply(int x,int y) 
    {
        int z = x*y;
        return z;
    }
    
    public int divide(int x,int y) 
    {
        int z = x/y;
        return z;
    }
    
    public int modulo(int x,int y) 
    {
        int z;
        z = x % y;
        return z;
    }
}
