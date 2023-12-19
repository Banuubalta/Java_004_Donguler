package com.banubalta;

public class AppMain {
    public static void main(String[] args) {

    /*
        int ben = 0;
       // ben = i + 1;
        ++i;
        System.out.println(i);
        ++i;
        System.out.println(i);
        */
        System.out.println("---------------------------------------");

        // BASLANGIC      //SART     //ARTTIRIM ya da AZALTIM
        for (int i = 0;   i < 10;    i++) { // Scope / Kapsam
            System.out.println(i);
        }
        System.out.println("-----------------------------");


        for (int i = 1;   i < 13;    i++) { // Scope / Kapsam

            System.out.println("i: " + i);

            for (int j = 1; j < 32; j++) {
                System.out.println("\tj: " + j);
            }

            System.out.println("-----------------------------");
        }

        for (int i = 1;   i < 13;    i=i+3) { // Scope / Kapsam

            System.out.println("i: " + i);

            for (int j = 1; j < 32; j=j+5) {
                System.out.println("\tj: " + j);
            }
        }








                        }
}