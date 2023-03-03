package org.example;

import java.util.Random;
import java.util.Scanner;

public class Cuadricula {
    char[][] tablero = new char[10][10];
    Random random = new Random();
    int filaBarco = random.nextInt(3);
    int columnaBarco = random.nextInt(3);

    public Cuadricula(){
        inicializarTablero();
    }

    public void inicializarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "?".charAt(0);
            }
        }
    }

    public void visualizacion(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean disparar(int fila, int columna){
        if (fila == filaBarco && columna == columnaBarco){
            System.out.println("Tocado y hundido");
            tablero[fila][columna] = "X".charAt(0);
            return true;
        }else{
            tablero[fila][columna] = "-".charAt(0);
            System.out.println("Agua");
            return false;
        }
    }

    public void depositarBarco(int fila, int columna){
        tablero[fila][columna] = "B".charAt(0);
    }

    public static void main(String[] args){
        Cuadricula cuadricula = new Cuadricula();
        cuadricula.visualizacion();
        cuadricula.depositarBarco(1,1);

        while (true){
            System.out.println("Introduce la fila:");
            Scanner sc = new Scanner(System.in);
            int fila = sc.nextInt() - 1;
            System.out.println("Introduce la columna:");
            int columna = sc.nextInt() - 1;
            if (cuadricula.disparar(fila, columna)){
                break;
            }
        }
    }
}
