/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Synthia Pamella
 */
public class MCadenas {
    
    public int CalcularLongitudCadena(String cadena){
        return cadena.length();
    }
    /*
    public String[] CadenaCaracteres(String cadena){
        
        int longitudC = cadena.length(); 
        String arregloC[] = new String[longitudC];
        
        for(int i = 0; i < longitudC; i++){
            arregloC[i] = cadena.charAt(i); 
        }
        return arregloC;
    }
*/
    public int ModaCadena(String cadena, char letra){
        
        int moda = 0;
        
        for (int i = 0; i < cadena.length(); i++){
            if(letra == cadena.charAt(i)){
                moda++;
            }
        }
        return moda;
    }
    
    public boolean Subcadena(String cadena, String subcadena){
        
        return (cadena.contains(subcadena));
        
    }
    
    public String ConcatenarCadenas(String cadenaOriginal, String cadenaNueva){
        
        return cadenaOriginal + " " + cadenaNueva;
    }
    
    public boolean CadenaMayor(String cadena1, String cadena2){
        return cadena1.length() > cadena2.length();
    }
    
    public boolean cadenasIguales(String cadena1, String cadena2){
         return cadena1.equals(cadena2);
     }
    
}
