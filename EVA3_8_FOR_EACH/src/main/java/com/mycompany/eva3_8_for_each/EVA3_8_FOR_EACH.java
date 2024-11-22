/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_for_each;

/**
 *
 * @author ae478
 */
public class EVA3_8_FOR_EACH {

    public static void main(String[] args) {
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        /*for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            */
              for(String cade: dias){
              System.out.println(dias); 
    }
    int[] billetes = {20,50,100,200,500,100};
            for(int billete:billetes)
         System.out.println(billete);
      }
}
