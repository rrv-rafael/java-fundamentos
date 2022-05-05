package br.com.rrvrafael.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2, resultado = 0, opcao = 0;
        char operador;
        boolean verificarOperacao;
        ArrayList<String> historico = new ArrayList<>();
        String entradaHistorico;

        System.out.println("******Aplicação de operações matemáticas******");

        while (opcao != 3) {
            try {
                System.out.println("\n1 -> Realizar operação matemática\n2 -> Mostrar Histórico de operações\n3 -> Sair\nEscolha uma das opções acima:");
                opcao = scan.nextInt();

                if (opcao == 1) {
                    verificarOperacao = true;

                    System.out.println("Informe o 1o número:");
                    numero1 = scan.nextInt();

                    System.out.println("Informe o operador matemático:");
                    operador = scan.next().charAt(0);

                    System.out.println("Informe o 2o número:");
                    numero2 = scan.nextInt();

                    switch (operador) {
                        case '+' -> resultado = numero1 + numero2;
                        case '-' -> resultado = numero1 - numero2;
                        case '*' -> resultado = numero1 * numero2;
                        case '/' -> {
                            if (numero2 > 0) {
                                resultado = numero1 / numero2;
                            } else {
                                System.out.println("\nNão é possível divisão por 0!");
                                verificarOperacao = false;
                            }
                        }

                        default -> {
                            System.out.println("\nOperador inválido!");
                            verificarOperacao = false;
                        }
                    }

                    if (verificarOperacao) {
                        entradaHistorico = String.format("%d %c %d = %d", numero1, operador, numero2, resultado);

                        historico.add(entradaHistorico);
                        System.out.println("\nOperação realizada:\n" + entradaHistorico);
                    }
                } else if (opcao == 2) {
                    if (historico.size() > 0) {
                        System.out.printf("\nVocê já fez %d operação(s).\n", historico.size());

                        System.out.println("\nHistórico das operações:");
                        historico.forEach(System.out::println);

                        /*historico.forEach(itemHistorico -> System.out.println(itemHistorico));
                        for (String s : historico) {
                            System.out.println(s);
                        }*/
                    } else {
                        System.out.println("\nNenhum histórico de operações!");
                    }
                } else if (opcao == 3) {
                    System.out.println("\nSaindo...");
                } else {
                    System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro. Digite apenas números!");
                scan.nextLine();
            }

        }

        scan.close();
    }
}
