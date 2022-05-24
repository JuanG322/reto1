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
public class otroerror {
    public static void main(String[] args) {
        
        int numeroPacinetesInt=0;//defino int y strigs que uso en el programa
        int cancer=0,card = 0, respi = 0, cereb = 0,hiper = 0, diab = 0 ;
        String[] lista = {"cancer", "cardiovasculares", "respiratorias", "cerebrovasculares", "hipertension", "diabetes"};
        String enfermedades = "a";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de pacientes: ");//pido el numero de pacientes en strings y lo convierto en int
        String numeroPacientes = scanner.nextLine();
        numeroPacinetesInt = Integer.parseInt(numeroPacientes);
        System.out.println("so: "+numeroPacientes);
        
        while(numeroPacinetesInt >0){
           numeroPacinetesInt--;
           
           //Leo los datos ingresados los separo por - y lo convierto en un vector y tomo el dato de la enfermedad en otra variable
           System.out.println("Ingrese los datos del paciente: ");
           String datos = scanner.nextLine();
           
           String palabras[] = datos.split("-"); 
           //String datos[] = {"Eva","104312456","32","Bogota","sura","hipertension"};
           enfermedades = palabras[5]; 
            System.out.println(enfermedades);
          
           
    }
    
}
}

