package br.com.exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoates = 0;

        int cont = 0;

        do {

            System.out.println("Letras: ");
            String letra = scan.next();

            if (! (letra.equals("a") |
                    letra.equals("e") |
                    letra.equals("i") |
                    letra.equals("o") |
                    letra.equals("u")) ){
                consoantes [cont] = letra;
                quantidadeConsoates++;
            }

            cont++;

        } while (cont < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes){
            if (consoante != null)
                System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de Consoantes: " + quantidadeConsoates);
        System.out.println(consoantes.length);

    }
}

