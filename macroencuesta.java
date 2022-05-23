/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class macroencuesta {
    public static void main(String[] args) {
        
        double numenc = 4,total,porcentaje,voto; 
        Scanner scanner = new Scanner(System.in);
        total = 22797;
        
        while(numenc > 0){
            numenc--;
            System.out.println("ingrese los votos: ");
            voto = scanner.nextDouble();
            porcentaje = voto*100/total;
            s
            System.out.println("porcentaje; "+porcentaje);
        }
    }   
    
}
