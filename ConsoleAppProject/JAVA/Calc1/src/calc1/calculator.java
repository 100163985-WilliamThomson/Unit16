/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc1;
/**
 *
 * @author 100163985
 */
public class calculator 
{
    private String name;
    
    public int add(int x, int y){ 
        return x+y; }
    public int subtract(int x, int y){ 
        return x-y; }
    public int multi(int x, int y){ 
        return x*y; }
    public float divide(int x, int y){ 
        return x/y; }
    public int modulo(int x, int y){
        return x%y; }
    
    
    public void setName(String desName)
    {
        this.name = desName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
}
    


