/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._exa_evaluacion_3;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class App {

    public static void main(String[] args) {
      
       int cantidad;
       int califas[];
       String nombres[];
        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de calificaciones a capturar");
        cantidad = captu.nextInt();
        captu.nextLine();
        califas = new int[cantidad];
        nombres = new String[cantidad];
        for (int i = 0; i < califas.length; i++) {
            System.out.println("nombre del estudiante #" + i);
            nombres[i] = captu.nextLine();
            System.out.println("Calificacion del estudiante #" + i);
            califas[i] = captu.nextInt();
            captu.nextLine();
             
        }
        
        for(int i = 1; i <= califas[i]; i++){
            System.out.print(nombres[i] + ":" + califas[i] + "-");
            cantidad = cantidad + califas[i];
            double promedio = cantidad / 10.0;
       System.out.println("promedio = " + califas[i]);
        }
    }
  
    public static String calificacionPromedio(int califa){
        
     int sumaCali;
     
        Scanner captu = new Scanner(System.in);
        sumaCali = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # " + i);    
        System.out.println("Cual es tu calificacion?");
        califa = captu.nextInt();
        captu.nextLine();
        sumaCali = sumaCali + califa;
        }
        double promedio = sumaCali / 10.0;
       System.out.println("promedio = " + promedio);
        return null;
        
       
       
        }
    }

