/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosfor4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ArreglosFor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner scanner = new Scanner(System.in);
        
        
        int opcion;
        
        do{
            System.out.println("inicio");
            System.out.println("multiplicacion");
            System.out.println("sumar");
            System.out.println("opcion no valida");
            
            opcion = scanner.nextInt();
            
            switch(opcion) {
                
                case 1:
                    double suma = 0;
                    for (double elemento : arreglos){
                        suma += elemento;
                    }
                    System.out.println("la suma es" + suma);
                    
                  break;
                  
                case 2:
                    double multiplicacion = 1;
                    for(double elemento : arreglos){
                        multiplicacion *= elemento;             
                    }
                    System.out.println("la multiplicacion es" + multiplicacion);
                    
                    break;
                    
                case 3:
                    System.out.println("salir");
                    
                case 4:
                    System.out.println("opcion no valida, elegir opciones anteriores");
            }
        }while (opcion !=3);
        scanner.close();
        }   
    }

