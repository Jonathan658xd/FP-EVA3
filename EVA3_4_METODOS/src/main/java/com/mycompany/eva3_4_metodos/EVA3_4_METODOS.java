/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println("Mayor de 8 y 7 = " + buscarMayor(8, 7));
        System.out.println(determinarDiaSemana(1));
    }
    public static int buscarMayor(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
        /* int resu
        if(num1 > num2){
        resu = num1;
        }else{
        resu = mum2;
        }
        return resu;
        */
    }
     public static String determinarDiaSemana(int dia) {
         Scanner captu = new Scanner(System.in);
         System.out.println("intruduce un dia de 1 al 7");
         dia = captu.nextInt();
      switch(dia){
        case 1:
            return "Lunes";
        case 2:
            return "Martes";
        case 3:
            return "Miercoles";
        case 4:
            return "Jueves";
        case 5:
            return "Viernes";
        case 6:
            return "Sabado";
        case 7:
            return "Domingo";
        default:
            return "Dia imvalido";
       
        }
     }
}
