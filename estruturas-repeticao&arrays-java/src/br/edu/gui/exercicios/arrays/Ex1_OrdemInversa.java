package br.edu.gui.exercicios.arrays;

/*
 Faça um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main (String []args) {
        
        int [] vetor = {1, 5, -4, -7, 2, 7}; // 6 elementos e 5 posições, conta com o 0

        System.out.println("Vetor: ");
        int count =  0;
        while (count < vetor.length) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        //Ordem inversa
        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }

}
