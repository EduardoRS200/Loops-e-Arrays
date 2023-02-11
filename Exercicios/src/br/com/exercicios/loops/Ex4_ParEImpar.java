package br.com.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {

            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;


            count++; // contando para sair do loop infinito

        } while (count < quantNumeros);

        System.out.println("Fim: ");
        System.out.println("Quantidade de numeros Pares: " + quantPares);
        System.out.println("Quantidade de numeros Impares: " + quantImpares);
    }
}


