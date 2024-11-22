/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_examen;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA3_5_EXAMEN {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    
    public static void main(String[] args) {
       int resu;
       int resuJug;
       int jugada;
     do{   
        resu = pedirJugada("introduce tu jugada (1-papel, 2-piedra, 3-tijera, 0-salir");
        jugada = generarJugadaComp();
         System.out.println(jugada);
         resuJug = evaluarPartida(resu, jugada);
         System.out.println(resuJug);
        }while(resu != 0);
    }
    public static int pedirJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = captu.nextInt();
        return seleccion;
    }
    //generar la jugada de la computadora
    public static int generarJugadaComp(){
      int jugada;
      double valor = Math.random();
      //Como generamos la jugada?
         if((valor >= 0)&&(valor < 0.3))
                 jugada = 1;//piedra
         else if((valor >= 0.3)&&(valor < 0.6))
                 jugada = 2;//papel
              else
                 jugada = 3;//tijera
      return jugada;

    }
    public static int evaluarPartida(int jugadaUsu, int jugadaComp){
    int resu;
    if((jugadaUsu == PIEDRA)&&(jugadaComp == PIEDRA))
     resu = EMPATE;   
    else if((jugadaUsu == PIEDRA)&&(jugadaComp == PAPEL))
     resu = PIERDE;   
    else if((jugadaUsu == PIEDRA)&&(jugadaComp == TIJERA))
     resu = GANA;   
    else if((jugadaUsu == PAPEL)&&(jugadaComp == PIEDRA))
     resu = GANA;   
    if((jugadaUsu == PAPEL)&&(jugadaComp == PAPEL))
     resu = EMPATE;   
    if((jugadaUsu == TIJERA)&&(jugadaComp == TIJERA))
     resu = PIERDE;   
    if((jugadaUsu == TIJERA)&&(jugadaComp == PIEDRA))
     resu = GANA;   
    if((jugadaUsu == PIEDRA)&&(jugadaComp == PAPEL))
     resu = PIERDE;   
    if((jugadaUsu == PIEDRA)&&(jugadaComp == TIJERA))
     resu = GANA;   
    if((jugadaUsu == PIEDRA)&&(jugadaComp == PAPEL))
     resu = PIERDE;
    else
     resu = EMPATE;
    return resu;
}
}
