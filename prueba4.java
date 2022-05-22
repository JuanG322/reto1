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
public class prueba4 {
    public static void main(String[] args) {
        int numeroPacinetesInt=0;
        int cancer=0,card = 0, respi = 0, cereb = 0,hiper = 0, diab = 0 ;
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Ingrese el numero de pacientes: ");
        String numeroPacientes = scanner.nextLine();
        numeroPacinetesInt = Integer.parseInt(numeroPacientes);
                 
        //numeroPacinetesInt++;//para que funcione el ciclo
        
        while(numeroPacinetesInt >0){
                      
            numeroPacinetesInt--;
            System.out.println("Ingrese los datos del : ");
            String datos = scanner.nextLine();
            
            String[] palabras = datos.toLowerCase().split("-");
            System.out.println("si "+palabras[5]);
            
            String enfermedades = palabras[5];
            
          /*  if(enfermedades == "cancer"){
                cancer++;
            }    
            else if(enfermedades == "cardiovasculares"){
                card++;
            }
            else if(enfermedades == "respiratorias"){
                respi++;
            }
            else if(enfermedades == "cerebrovasculares"){
                cereb++;
            }
            else if(enfermedades == "hipertension"){
                hiper++;
            }
            else if(enfermedades == "diabetes"){
                diab++;
            }
          
            System.out.println("cancer: "+cancer+"cardio: "+card+"respi"+respi+"cerebrov: "+cereb+"hiper"+hiper+"diab"+diab);
*/
    }
    }
}   
            
            