/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juanj
 */

public class prueba4 {
    public static void main(String[] args) {
        int numeroPacinetesInt=0;
        int cancer=0,card = 0, respi = 0, cereb = 0,hiper = 0, diab = 0 ;
        Scanner scanner = new Scanner(System.in);

        String[] lista = {"cancer", "cardiovasculares", "respiratorias", "cerebrovasculares", "hipertensión", "diabetes"};
        
        System.out.println("Ingrese el numero de pacientes: ");
        String numeroPacientes = scanner.nextLine();
        numeroPacinetesInt = Integer.parseInt(numeroPacientes);
                 
        //numeroPacinetesInt++;//para que funcione el ciclo
        
        while(numeroPacinetesInt >0){
                      
            numeroPacinetesInt--;
            System.out.println("Ingrese los datos del paciente: ");
            String datos = scanner.nextLine();
            
            String[] palabras = datos.split("-");
            
            String enfermedades = palabras[5];
 
            //System.out.println(enfermedades);
            
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

            System.out.println("cancer: "+cancer+" cardio: "+card+" respi: "+respi+" cerebrov: "+cereb+" hiper: "+hiper+" diab: "+diab);
        }    
        int[] numeroEnfermedades = {cancer, card, respi, cereb, hiper, diab};
        int numeromayor = numeroEnfermedades[0];
            
        for(int i=0; i<numeroEnfermedades.length && i<lista.length; i++){
           
            if(numeroEnfermedades[i]>numeromayor){
                numeromayor = numeroEnfermedades[i];
               
            }}
        
        System.out.println(numeromayor);
         for(int i = 0;i< 6; i++ ){
             System.out.println("v["+i+"] = " + numeroEnfermedades[i]);
         }

 

        System.out.println(numeromayor);
        int indiceMayor = Arrays.asList(numeroEnfermedades).indexOf(numeromayor);//n se porqeu el indice me aparece -1 
        System.out.println("indiceMayor is located at "+indiceMayor+" index");
            
       

    
    }
}   

 /*tomo los datos de la lista y los sumo me faltaria hacer la matriz
meter los nombres de las enfermedaes en ella, despues de sumar la
cantidad de cada enfermedad convertilos en string y vincularlarlos
con los nombres de las enfermedades para despues mostrar en pantalla
la mas comun y la menos comun de ella
*/         