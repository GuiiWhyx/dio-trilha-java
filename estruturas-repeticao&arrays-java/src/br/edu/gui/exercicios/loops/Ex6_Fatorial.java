package br.edu.gui.exercicios.loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um núero inteiro forencido pelo usuário.
 Ex: 5! = 120 (5x4x3x2x1)
 */

public class Ex6_Fatorial {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Informe o valor para fatorar: ");
        fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! =");

        for (int i = fatorial; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;
            System.out.println("fatorial = " + fatorial);
            System.out.println("Indice = " + i);
            System.out.println("Mult = " + multiplicacao);
        }
        System.out.println("Valor final de " + fatorial + "! = " + multiplicacao);
     }
}
