package atividade_pratica6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista1Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Queue<String> fila = new LinkedList<String>();

        // variavel
        String cliente;
        int cod;

        // Introducao   
        System.out.println("************ Bem-vindo ao Banco Generation ************");

        do {
            // Entrada de dados
            System.out.println("\n ####################### MENU ######################");
            System.out.println("\n Entre com a opcao desejada: (1) Para ser atendido; (2) Verificar a lista de clientes; (3) Deseja sair da lista; (0) Sair. ");
            cod = leia.nextInt();
            leia.nextLine();
            //------------------------------------
            // Começo do menu e entrada de dados
            switch (cod) {
                case 1:
                    System.out.println("Para ser atendido, informe o seu nome completo: ");
                    cliente = leia.nextLine();
                    fila.add(cliente); 
                    System.out.println("Cliente: " + cliente + ", adicionada(o)!");
                    break;

                case 2:
                    System.out.println("Lista de Clientes na Fila:");
                    System.out.println(fila);
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Cliente retirado da lista por falta de interacao: " + fila.remove());
                    } else {
                        System.out.println("A Fila esta vazia!");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!!");
                    break;

                default:
                    System.out.println("Digito invalido!");
                    break;
            }
        } while (cod != 0);

        leia.close();
    }
}
