package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         static void eingabe(int[] werte){
             Scanner sc = new Scanner(System.in);
             System.out.println("Gib " + werte.length + " Zahlen ein!");
             for (int i = 0; i < werte.length; i++) {
                 System.out.print((i+1) + ". Zahl: ");
                 werte[i] = sc.nextInt();
             } }
             static void ausgabe(int[] array){
             for (int i = 0; i < array.length; i++) {
                 System.out.println((i+1) + ". Zahl: " + array[i]);
             } }
             static void killNegative(int[] zahlen){
             for (int i = 0; i < zahlen.length; i++) {
                 if (zahlen[i] < 0){ zahlen[i] = 0;
                 } } }

                 static void deleteAboveLimit (int[] array, int limit){

             int limit = 0;
             int i = 0;
             int zahl = 0;
                 if (zahlen[i] < 0) { zahlen[i] = 0;
                     System.out.println("Du bist über dem limit!");
                 }
                 eingabe(arr); // Eingabe der Zahlen

            array[0] = 3;
            array[1] = 1;
            array[2] = 0;
            array[3] = 2;
            array[4] = 0;
            array[5] = 2;
            array[6] = 0;
            array[7] = 0;
            array[8] = 1;
            array[9] = 0;
            array[10] = 1;


            static void clearArray(int[] array){
                if (zahl > 0){
                    System.out.println("Die Zahlen werden nach vorne kopiert.");
                }

            }

        }
    }
}
