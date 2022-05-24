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
public class reto1 {
     public static void main(String[] args) {
       
        
        int numeroPacinetesInt=0;//defino int y strigs que uso en el programa
        int cancer=0,card = 0, respi = 0, cereb = 0,hiper = 0, diab = 0 ;
        String[] lista = {"cancer", "cardiovasculares", "respiratorias", "cerebrovasculares", "hipertension", "diabetes"};
        String enfermedades;
        
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Ingrese el numero de pacientes: ");//pido el numero de pacientes en strings y lo convierto en int
        String numeroPacientes = scanner.nextLine();
        numeroPacinetesInt = Integer.parseInt(numeroPacientes);
        
        //Inicio el loop para el numero de pacientes
        while(numeroPacinetesInt >0){
           numeroPacinetesInt--;
           
           //Leo los datos ingresados los separo por - y lo convierto en un vector y tomo el dato de la enfermedad en otra variable
           //System.out.println("Ingrese los datos del paciente: ");
           String datos = scanner.nextLine(); 
           String palabras[] = datos.split("-"); 
           enfermedades = palabras[5];
           
           //utilizo los if para sumar las difeerentes enfermedades
           if(enfermedades.equalsIgnoreCase("cancer")){
                cancer++;
            } 
           else if(enfermedades.equalsIgnoreCase("cardiovasculares")){
                card++;
            }
           else if(enfermedades.equalsIgnoreCase("respiratorias")){
                respi++;
            }
           else if(enfermedades.equalsIgnoreCase("cerebrovasculares")){
                cereb++;
            }
           else if(enfermedades.equalsIgnoreCase("hipertension")){
                hiper++;
            }
           else if(enfermedades.equalsIgnoreCase("diabetes")){
                diab++;
            }
        }//cancer++; card++; respi++; cereb++; hiper++; diab++;
         //System.out.println("cancer: "+cancer+" cardio: "+card+" respi: "+respi+" cerebrov: "+cereb+" hiper: "+hiper+" diab: "+diab);
         
         //tomo los datos de la suma de las enfermedades y los subo a un vector
         int[] numeroEnfermedades = {cancer, card, respi, cereb, hiper, diab};
         int numeroMayor = 0, numeroMenor = 0;
         
         //ciclo para encontrar el indice del nnumero mayor
         for(int i = 1; i < numeroEnfermedades.length;i++){
             if(numeroEnfermedades[i] > numeroEnfermedades[numeroMayor]){
                 numeroMayor = i;
             }        
         }
         //ciclo para encontrar el indice del numero menor
         for(int i = 1; i < numeroEnfermedades.length;i++ ){
             if(numeroEnfermedades[i] < numeroEnfermedades[numeroMenor]){
                 numeroMenor = i;             
             }
             
         }

         System.out.println(lista[numeroMayor]);
         System.out.println(lista[numeroMenor]);

}}
