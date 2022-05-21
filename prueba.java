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
            
            
            int numeroPacientes;
            List<String> listDatos = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);
            Map<String, Integer> map = new HashMap<String, Integer>();
            
            map.put("cancer", 0);
            map.put("cardiovasculares", 0);
            map.put("respiratorias", 0);
            map.put("cerebrovasculares",0);
            map.put("hipertensión",0);
            map.put("diabetes",0);        
            
            System.out.println("Ingrese el numero de pacientes: ");
            numeroPacientes = scanner.nextInt();
            
            while(numeroPacientes > 0){
                
                numeroPacientes--;
                System.out.println("Ingrese los datos del paciente: ");
                String datosUsuario  = scanner.next();
                System.out.println(datosUsuario);
                listDatos.add(datosUsuario);
                System.out.println(listDatos);

                
            }
        }
}
