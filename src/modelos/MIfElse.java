/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author usuario
 */
public class MIfElse {
    
    public boolean igua(int m){
        
         if(m==1){
             return true;
         }else{
             return false;
         }
     }
    
    public boolean iguaOtro(int m){
        
         if(m==1){
             return true;
         }else{
             return false;
         }
     }
    public boolean mayorEdad(int edad){
        return (edad >=21);
    }
    
    public boolean validarNotar(float nota){
        return (nota >= 0 && nota <= 100);
    }
    
    
}
