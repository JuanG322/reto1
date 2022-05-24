/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;
import java.util.Arrays;
/**
 *
 * @author juanj
 */
public class prueba5 {

    public static void main(String[] args) {
        
        int a = 0,b = 10,c = 145,d = 0,e = 1,f = 0; 
        
        int[] numeros = new int [] {a, b, c, d, e, f};
       // String arrayS= Integer.toString(array1);
        int indiceMayor = 0, indiceMenor = 0;
        
        for(int i = 1; i < numeros.length;i++){
            if(numeros[i] > numeros[indiceMayor]){
                indiceMayor = i;
            }
        }
        for(int i = 1; i < numeros.length;i++){
             if(numeros[i] < numeros[indiceMenor]){
                indiceMenor = i;
            }
        }
        
        //int mayor = numeros[indiceMayor];

        System.out.println("mayor is located at "+indiceMayor);
        System.out.println("Menor = "+indiceMenor);
    }
}


