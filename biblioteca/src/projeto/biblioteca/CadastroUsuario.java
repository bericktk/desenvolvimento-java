package projeto.biblioteca;

import java.util.Scanner;

public class CadastroUsuario {

    private Scanner scan = new Scanner(System.in);

    public void menuUsuario(Biblioteca biblioteca) {

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Remover usuário");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Listar usuários");
            System.out.println("5 - Emprestar livro");
            System.out.println("6 - Devolver livro");
            System.out.println("7 - Sair");
            System.out.println("8 - Voltar ao Menu Principal");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    adicionarUsuario(biblioteca);
                    break;
                case 2:
                    removerUsuario(biblioteca);
                    break;
                case 3:
                    buscarUsuario(biblioteca);
                    break;
                case 4:
                    listarUsuarios(biblioteca);
                    break;
                case 5:
                    emprestarLivro(biblioteca);
                    break;
                case 6:
                    devolverLivro(biblioteca);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                case 8:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7 && opcao != 8);
    }
            
        public void adicionarUsuario(Biblioteca biblioteca) {
            System.out.print("Nome: ");
            String nome = scan.next();
            scan.nextLine();
            System.out.print("CPF: ");
            String cpf = scan.next();
            scan.nextLine();
            System.out.print("Endereço: ");
            String endereco = scan.next();
            scan.nextLine();
            System.out.print("Telefone: ");
            String telefone = scan.next();
            scan.nextLine();
            System.out.print("Email: ");
            String email = scan.next();
            scan.nextLine();
            Usuario usuario = new Usuario(nome, cpf, endereco, telefone, email, false);
            biblioteca.addUser(usuario);
            System.out.println("Usuário adicionado com sucesso.");
        }
        
        public void removerUsuario(Biblioteca biblioteca){
            System.out.print("CPF: ");
            String cpf = scan.next();
            scan.nextLine();
            biblioteca.removeUser(cpf);
            System.out.println("Usuário removido com sucesso.");
        }

        public void buscarUsuario(Biblioteca biblioteca) {
            System.out.print("CPF: ");
            String cpf = scan.next();
            scan.nextLine();
            biblioteca.searchUser(cpf);
        } 
        
        public void listarUsuarios(Biblioteca biblioteca) {
            biblioteca.listUsers();
        }
        
        public void emprestarLivro(Biblioteca biblioteca) {
            biblioteca.loanBook();
        } 

        public void devolverLivro(Biblioteca biblioteca) {
            int ISBN;
            System.out.print("ISBN: ");
            ISBN = scan.nextInt();
            biblioteca.returnBook(ISBN);
        }
    }