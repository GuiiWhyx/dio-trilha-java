package br.edu.gui.exercicios.arrays;

import java.util.Scanner;

/*
 Faça um programa que leia um vetor de 6 catacteres,
 e diga quantas consoantes foram lidas.
 Imprima as consoantes.
 */

public class Ex2_Consoantes {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantConsoantes = 0;


        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a")  |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;

                }

                count ++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes) {
            if (consoante != null)
                System.out.println(consoantes);
        }
    }
}