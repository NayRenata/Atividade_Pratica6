package atividade_pratica6;

import java.util.Stack;
import java.util.Scanner;

public class Lista1Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        
        // Variável
        int cod;
        String livro;
        
        // Entrada de dados
        System.out.println("############## Livraria Generation ##############");
        
        do {
            System.out.println("\n #################### MENU ####################");
            System.out.println("\n Entre com a opcao desejada: (1) Deseja adicionar o livro a pilha; (2) Informe todos os livros listados na pilha; (3) Retirar um livro da pilha; (0) Finalizar o programa.");
            cod = leia.nextInt();
            leia.nextLine();
            
            switch (cod) {
                case 1:
                    System.out.println("Digite o nome: ");
                    livro = leia.nextLine();
                    stack.push(livro);
                    System.out.println("Pilha: " + livro);
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Lista de Livros na Pilha: " + stack);
                    } else {
                        System.out.println("A Pilha esta vazia!");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Um Livro foi retirado da pilha: " + stack.pop());
                    } else {
                        System.out.println("A Pilha esta vazia!");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Digito invalido");
                    break;
            }
        } while (cod != 0);
        
        leia.close();
    }
}
