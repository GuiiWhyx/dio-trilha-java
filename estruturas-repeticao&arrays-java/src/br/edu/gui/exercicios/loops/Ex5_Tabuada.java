package br.edu.gui.exercicios.loops;

import java.util.Scanner;

/*
 Desenvolva uma tabuada capaz de gerar qualquer número inteiro entre 1 a 10.
 O usuário deve informar de qual número ele deseja ver a tabuada.
 A saída de ser conforme o exemplo abaixo:

 Tabuada de 5:
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 10 = 50
 */


public class Ex5_Tabuada {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("====Tabuada====");
        System.out.println("Tabuada de qual número? ");        
        tabuada = scan.nextInt();

        for ( int i = 1; i <= 10 ; i++ ) {
            System.out.println(tabuada + " X " + i +  " = " + (tabuada * i));
        }

    }
    
}
