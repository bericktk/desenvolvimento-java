package projeto.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroUsuario {


    Scanner scan = new Scanner(System.in);

    public void adicionarUsuario(Biblioteca biblioteca) {
        ArrayList<Usuario> usuarios = biblioteca.usuarios;
        try {
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Remover usuário");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Listar usuários");
            System.out.println("5 - Emprestar livro");
            System.out.println("6 - Devolver livro");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            while (true) {
                if (opcao == 1) {
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
                    usuarios.add(usuario);
                }else if (opcao == 2) {
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    scan.nextLine();
                    for (Usuario usuario : usuarios) {
                        if (usuario.getCpf().equals(cpf)) {
                            usuarios.remove(usuario);
                            System.out.println("Usuário removido com sucesso.");
                            return;
                        }
                    }
                    System.out.println("Usuário não encontrado.");
                } else if (opcao == 3) {
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    scan.nextLine();
                    for (Usuario usuario : usuarios) {
                        if (usuario.getCpf().equals(cpf)) {
                            System.out.println("Usuário encontrado: " + usuario.getNome());
                            return;
                        }
                    }
                    System.out.println("Usuário não encontrado.");
                } else if (opcao == 4) {
                    for (Usuario usuario : usuarios) {
                        System.out.println("Nome: " + usuario.getNome());
                        System.out.println("CPF: " + usuario.getCpf());
                        System.out.println("Endereço: " + usuario.getEndereco());
                        System.out.println("Telefone: " + usuario.getTelefone());
                        System.out.println("Email: " + usuario.getEmail());
                        System.out.println();
                    }
                } else if (opcao == 5) {
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    scan.nextLine();
                    for (Usuario usuario : usuarios) {
                        if (usuario.getCpf().equals(cpf)) {
                            if (usuario.isEmprestado() == false) {
                                usuario.setEmprestado(true);
                                System.out.println("Livro emprestado.");
                                return;
                            } else {
                                System.out.println("Livro já emprestado.");
                                return;
                            }
                        }
                    }
                    System.out.println("Usuário não encontrado.");
                } else if (opcao == 6) {
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    scan.nextLine();
                    for (Usuario usuario : usuarios) {
                        if (usuario.getCpf().equals(cpf)) {
                            if (usuario.isEmprestado() == true) {
                                usuario.setEmprestado(false);
                                System.out.println("Livro devolvido.");
                                return;
                            } else {
                                System.out.println("Livro não emprestado.");
                                return;
                            }
                        }
                    }
                    System.out.println("Usuário não encontrado.");
                } else if (opcao == 7) {
                    break;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao adicionar usuário.");
        }
    }

}
