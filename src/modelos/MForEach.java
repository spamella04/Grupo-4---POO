/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author josea
 */
public class MForEach {
    
    public int longi(String cadena){
     int tamanio;
     tamanio = cadena.length();
     return tamanio;   
    }
   
    public int calcularMenor(int [] arreglo){
        int menor = arreglo[0];
        for(int element: arreglo){
            if(menor > element){
                menor = element;
            }
        }
        return menor;
    }
}
