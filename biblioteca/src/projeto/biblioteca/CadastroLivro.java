package projeto.biblioteca;

import java.util.Scanner;

public class CadastroLivro {

    Scanner scan = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();

    public void menuLivro() {
        
        int opcao;

        do {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Buscar livro");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Sair");
            System.out.println("6 - Voltar ao Menu Principal");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarLivro();
                    break;
                
                case 2:
                    removerLivro();
                    break;

                case 3:
                    buscarLivro();
                    break;

                case 4:
                    listarLivros();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                
                case 6:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    break;
            }

        } while (opcao != 5 && opcao != 6);
    }

    public void cadastrarLivro(){
        System.out.print("Título: ");
        String titulo = scan.next();
        scan.nextLine();
        System.out.print("Autor: ");
        String autor = scan.next();
        scan.nextLine();
        System.out.print("ISBN: ");
        int ISBN = scan.nextInt();
        scan.nextLine();
        System.out.print("Ano de publicação: ");
        int ano_publicacao = scan.nextInt();
        scan.nextLine();
        Livro livro = new Livro(titulo, autor, ISBN, ano_publicacao);
        biblioteca.adicionarLivro(livro);
    }

    public void removerLivro(){
        System.out.print("ISBN: ");
        int ISBN = scan.nextInt();
        scan.nextLine();
        biblioteca.removerLivro(ISBN);
    }

    public void buscarLivro(){
        System.out.print("ISBN: ");
        int ISBN = scan.nextInt();
        scan.nextLine();
        biblioteca.buscarLivro(ISBN);
    }

    public void listarLivros(){
        biblioteca.listarLivros();
    }

}