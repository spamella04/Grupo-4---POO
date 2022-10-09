/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author labc205
 * 
 */
public class MAritmetico {
    
    public boolean Multiplos(double num1, double num2){
            return num1 % num2 == 0;
    }
    
    public double CalcularResultadoExpresion1(double numS1, double numS2, double numM1, double numM2, double numD){
        return numS1 + numS2 - ((numM1 * numM2) / numD);
    }
    
    public double CalcularResultadoExpresion2(double numS1, double numS2, double numM, double numD1, double numD2){
        
        return (numS1 + numS2) * numM - (numD1 / numD2);
        
    }
    
    public double CalcularResultadoExpresion3(double numero, double exponente){
        return Math.pow(numero, exponente);
    }
    
    public double CalcularResultadoExpresion4(double num1, double num2, double num3){
        
         return (Math.pow(num1, num2 )) * (num2 /num3);
    }
}
