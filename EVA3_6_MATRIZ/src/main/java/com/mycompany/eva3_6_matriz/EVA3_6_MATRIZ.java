/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_matriz;

/**
 *
 * @author ae478
 */
public class EVA3_6_MATRIZ {

    public static void main(String[] args) {
       int[] valores = new int[5];//arreglo unidimensional
       //arreglo de dos dimensiones --> matriz: hoja de exel
       int[][] matriz = new int[3][3];
       matriz[0][0] = 100;//primer posicion
       matriz[0][1] = 200;
       matriz[0][2] = 300;
       matriz[1][0] = 400;
       matriz[1][1] = 500;
       matriz[1][2] = 600;
       matriz[2][0] = 700;
       matriz[2][1] = 800;
       matriz[2][2] = 900;//ultima posicion
       //imprimir matriz
        for (int i = 0; i < 3; i++) {//primera dimencion: filas
            for (int j = 0; j < 3; j++) {//2da dim: columnas
                System.out.print("[" + matriz[i][j] +"]");
                
            }
            System.out.println("");
        }
       
    }
}
