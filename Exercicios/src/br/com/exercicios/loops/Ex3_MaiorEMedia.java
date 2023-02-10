package br.com.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número e menor numero. 
e a média desses números.
*/

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 100000;
        int soma = 0;

        int count = 0;

        do {

            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior)
                maior = numero;

            else {
                menor = numero;
            }

            soma = soma + numero;

            count = count + 1;

        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("Media: " + (soma / 5));

    }

}
