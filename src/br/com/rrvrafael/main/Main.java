package br.com.rrvrafael.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2;
        char operador;

        System.out.println("Informe o 1o número:");
        numero1 = scan.nextInt();

        System.out.println("Informe o 2o número:");
        numero2 = scan.nextInt();

        System.out.println("Informe o operador matemático:");
        operador = scan.next().charAt(0);

        /*System.out.println("Você quer fazer a operação: " + numero1 + operador + numero2);*/
        System.out.printf("\nVocê quer fazer a operação: %d %c %d\n\n", numero1, operador, numero2);
        switch (operador) {
            case '+' -> System.out.println("Resultado da operação: " + (numero1 + numero2));
            case '-' -> System.out.println("Resultado da operação: " + (numero1 - numero2));
            case '*' -> System.out.println("Resultado da operação: " + (numero1 * numero2));
            case '/' -> System.out.println("Resultado da operação: " + (numero1 / numero2));
            default -> System.out.println("Operador inválido!");
        }

        scan.close();
    }
}
