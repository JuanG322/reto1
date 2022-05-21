/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroPacientes;
         
        System.out.println("Ingrese el numero de pacientes: ");
        numeroPacientes = scanner.nextInt();
        
        while (numeroPacientes>0){
            
            numeroPacientes --;
            System.out.println("Ingrese los datos del paciente: ");
            String datosPaciente = scanner.nextLine();
            System.out.println("Datos: "+datosPaciente);
            //String[]datos = datosPaciente.toLowerCase().split("-");
            
            //System.out.println("Longitud"+datos.length);
            
        }
    }
    
}
