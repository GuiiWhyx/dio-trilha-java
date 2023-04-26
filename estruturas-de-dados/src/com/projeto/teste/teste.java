package com.projeto.teste;

import java.util.Scanner;
/*
 Faça um programa que leia determinada quantidade de números
 e mostre as quantidades de números negativos, zeros, positivos
 pares e ímpares dentre eles.
 */


/*
No python não precisa utilizar o scan, no Java é utilizado para
coletar informações digitadas no prompt
 */

public class teste {

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        int numPosi = 0, numImpar = 0, numPar = 0, numNeg = 0;;
        int quantNumeros, numNulo = 0;
        int numero;

        int countt = 0;

        System.out.println("Quantos números serão analisados? ");
        quantNumeros = scan.nextInt();

        //Aqui pode ser utilizado "while" também :)
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) numPar ++;
            else numImpar ++;

            if (numero > 0) numPosi ++;
            else if (numero == 0) numNulo ++;
            else numNeg ++;

            countt++;

        } while (countt < quantNumeros);

        System.out.println("=============================");
        System.out.println("A quantidade total de números inseridos foi: " + quantNumeros);
        System.out.println("=============================");
        System.out.println("Números positivos: " + numPosi);
        System.out.println("Números Negativos: " + numNeg);
        System.out.println("Números Pares: " + numPar);
        System.out.println("Números Ímpares: " + numImpar);
        System.out.println("Números Nulos (zero): " + numNulo);
        System.out.println("=============================");

        int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }

        
        }

    }

