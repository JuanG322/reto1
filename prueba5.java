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
        Integer[] array1 = {2, 4, 6, 8, 10};
        
        int var2 = 6;

        int getIndex = Arrays.asList(array1).indexOf(var2);

        System.out.println("8 is located at "+getIndex+" index");
    }
}


