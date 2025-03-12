package projeto.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void menu() {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("1 - Adicionar livro");
                System.out.println("2 - Remover livro");
                System.out.println("3 - Buscar livro");
                System.out.println("4 - Listar livros");
                System.out.println("5 - Emprestar livro");
                System.out.println("6 - Devolver livro");
                System.out.println("7 - Sair");
                System.out.print("Opção: ");
                int opcao = scan.nextInt();
                scan.nextLine();

                switch (opcao) {
                    case 1:
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
                        break;
                    case 2:
                        System.out.print("ISBN: ");
                        ISBN = scan.nextInt();
                        scan.nextLine();
                        biblioteca.removerLivro(ISBN);
                        break;
                    case 3:
                        System.out.print("ISBN: ");
                        ISBN = scan.nextInt();
                        scan.nextLine();
                        biblioteca.buscarLivro(ISBN);
                        break;
                    case 4:
                        biblioteca.listarLivros();
                        break;
                    case 5:
                        System.out.print("ISBN: ");
                        ISBN = scan.nextInt();
                        scan.nextLine();
                        biblioteca.emprestarLivro(ISBN);
                        break;
                    case 6:
                        System.out.print("ISBN: ");
                        ISBN = scan.nextInt();
                        scan.nextLine();
                        biblioteca.devolverLivro(ISBN);
                        break;
                    case 7:
                        System.exit(0);
                        scan.close();
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}