package projeto.biblioteca;

import java.util.Scanner;

/**
 * @author Bruno Erick
 * @version 1.1
 */

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        CadastroLivro cadastroLivro = new CadastroLivro();
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Livros");
            System.out.println("2 - Usuários");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            if(opcao == 1){
                System.out.println("Livros");
                cadastroLivro.menuLivro();
            } else if(opcao == 2){
                System.out.println("Usuários");
                cadastroUsuario.menuUsuario(biblioteca);
            } else if (opcao == 3){
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);
        scan.close();
    }
}
