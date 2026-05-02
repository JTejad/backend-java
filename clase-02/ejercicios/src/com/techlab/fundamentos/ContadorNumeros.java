package com.techlab.fundamentos;

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int limite = sc.nextInt();

        System.out.println("Conteo con for:");
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }

        System.out.println("Conteo con while:");
        int contador = 1;
        while (contador <= limite) {
            System.out.println(contador);
            contador++;
        }

        sc.close();
    }
}
