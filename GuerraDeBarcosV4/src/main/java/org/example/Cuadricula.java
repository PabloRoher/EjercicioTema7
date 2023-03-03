package org.example;

import java.util.Random;
import java.util.Scanner;

public class Cuadricula {
    char[][] tablero = new char[4][4];
    Random random = new Random();

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

    public void disparar(int fila, int columna){
        tablero[fila][columna] = "-".charAt(0);
    }

    public void depositarBarco(int fila, int columna){
        tablero[fila][columna] = "B".charAt(0);
    }

    public static void main(String[] args){
        Random random = new Random();
        Cuadricula jugador = new Cuadricula();
        Cuadricula maquina = new Cuadricula();
        int filaBarco = random.nextInt(3);
        int columnaBarco = random.nextInt(3);
        System.out.println("Tablero de la maquina");
        maquina.visualizacion();
        System.out.println("--------------------");
        System.out.println("Tablero del jugador");
        jugador.visualizacion();
        System.out.println("Donde quiere posicionar el barco?");
        System.out.println("Introduce la fila:");
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt() - 1;
        System.out.println("Introduce la columna:");
        int columna = sc.nextInt() - 1;
        jugador.depositarBarco(fila, columna);
        System.out.println("--------------------");

        System.out.println("Tablero de la maquina");
        maquina.visualizacion();
        System.out.println("--------------------");
        System.out.println("Tablero del jugador");
        jugador.visualizacion();


        while (true){
            int filaMaquina = random.nextInt(3);
            int columnaMaquina = random.nextInt(3);
            System.out.println("Donde quiere disparar?");
            System.out.println("Introduce la fila:");
            Scanner sc2 = new Scanner(System.in);
            int fila2 = sc2.nextInt() - 1;
            System.out.println("Introduce la columna:");
            int columna2 = sc2.nextInt() - 1;

            maquina.disparar(fila2, columna2);

            System.out.println("Tablero de la maquina");
            maquina.visualizacion();
            System.out.println("--------------------");
            System.out.println("Tablero del jugador");
            jugador.visualizacion();

            System.out.println("turno de la maquina");

            jugador.disparar(filaMaquina, columnaMaquina);

            if (fila == filaMaquina && columna == columnaMaquina){
                System.out.println("Tablero de la maquina");
                maquina.visualizacion();
                System.out.println("--------------------");
                System.out.println("Tablero del jugador");
                jugador.visualizacion();

                System.out.println("turno de la maquina");
                System.out.println("Has perdido");
                break;

            }else if (fila2 == filaBarco && columna2 == columnaBarco){
                System.out.println("Tablero de la maquina");
                maquina.visualizacion();
                System.out.println("--------------------");
                System.out.println("Tablero del jugador");
                jugador.visualizacion();

                System.out.println("Has Ganado");
                break;
            }

            System.out.println("Tablero de la maquina");
            maquina.visualizacion();
            System.out.println("--------------------");
            System.out.println("Tablero del jugador");
            jugador.visualizacion();


        }
    }
}
