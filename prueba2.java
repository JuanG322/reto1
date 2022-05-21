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
public class prueba2 {
    public static void main(String[] args) {
        
        int longitud, numeroPacientes;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de pacientes: ");
        numeroPacientes = scanner.nextInt();
        numeroPacientes++;
        
        while(numeroPacientes >0){
            
            numeroPacientes--;
            System.out.println("Ingrese algo: ");
            String datos = scanner.nextLine();
            
            String[] palabras = datos.toLowerCase().split("-");
            
            //bajo todo a minusculas y separa por -
            longitud = palabras.length;
            System.out.println(longitud); //la longitud
        
            System.out.println("datos = "+datos);
            //Que mida bien los datos
        
            //for para mostrar los datos dentro de la "lista"
            for(int i = 0;i< longitud; i++ ){

                System.out.println("v["+i+"] = " + palabras[i]);
        }
        }
        }
        
        
        
        
        
        
 
    }
    

