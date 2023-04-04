package br.edu.gui.exercicios.loops;

import java.util.Scanner;

/*
 Faça um programa que leia 5 números
 e informe o maior número
 e a mérdia desses números.
 */

public class Ex3_MaiorEMedia {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        float media = 0;


        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero; 

            if (numero > maior) maior = numero;
            count ++;
        } while(count < 5);
        media = soma / count;
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
    
}
