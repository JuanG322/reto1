/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class prueba {
        public static void main(String[] args) {
            
            int var1=0,longitud = 0;
            
            String datos = "Julian Andrade-723456-45-Barranquilla-Sura-cardiovasculares";
            String[] palabras = datos.toLowerCase().split("-");

            longitud = palabras.length;
            System.out.println(longitud);

            
            for(int i = 0;i< longitud; i++ ){
                //System.out.println("v["+i+"] = " + palabras[i]); le todo el vectot
                System.out.println(palabras[5]);//le solo un elemento del vector
                
            }
            
        }}
