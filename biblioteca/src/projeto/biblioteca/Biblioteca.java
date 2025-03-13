package projeto.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!.");
    }

    public void removerLivro(int ISBN) {
        Iterator<Livro> iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getISBN() == ISBN) {
                iterator.remove();
                System.out.println("Livro removido com sucesso!.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void buscarLivro(int ISBN) {
        for (Livro livro : livros) {
            if (livro.getISBN() == ISBN) {
                System.out.println("Livro encontrado: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("ISBN: " + livro.getISBN());
                System.out.println("Ano de publicação: " + livro.getAno_publicacao());
                System.out.println("Emprestado: " + livro.isEmprestado());
                System.out.println();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("ISBN: " + livro.getISBN());
            System.out.println("Ano de publicação: " + livro.getAno_publicacao());
            System.out.println("Emprestado: " + livro.isEmprestado());
            System.out.println();
        }
    }

    public void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removeUser(String cpf) {
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getCpf().equals(cpf)) {
                iterator.remove();
                System.out.println("Usuário removido com sucesso!.");
                return;
            }
        System.out.println("Usuário não encontrado.");
        }
    }

    public void searchUser(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                System.out.println("Usuário encontrado: " + usuario.getNome());
                System.out.println("CPF: " + usuario.getCpf());
                System.out.println("Endereço: " + usuario.getEndereco());
                System.out.println("Telefone: " + usuario.getTelefone());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Emprestado: " + usuario.isEmprestado());
                System.out.println();
                return;
            }else{
                System.out.println("Usuário não encontrado.");
            }
        }
    }

    public void listUsers() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Endereço: " + usuario.getEndereco());
            System.out.println("Telefone: " + usuario.getTelefone());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Emprestado: " + usuario.isEmprestado());
            System.out.println();
        }
    }

    public void loanBook() {
        System.out.print("CPF: ");
        String cpf = scan.next();
        scan.nextLine();
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                System.out.print("ISBN: ");
                int ISBN = scan.nextInt();
                scan.nextLine();
                for(Livro livro : livros){
                    if(livro.getISBN() == ISBN){
                        livro.emprestado();
                            if(!usuario.isEmprestado() == false){
                                usuario.setEmprestado(true);
                                return;
                            }
                        System.out.println("Livro emprestado.");
                        return;
                        } else {
                        System.out.println("Livro já emprestado.");
                            return;
                        }
                    }
                }
            else{
                System.out.println("Usuário não encontrado.");
            }
        }
    }

    public void returnBook(int ISBN) {
        for (Livro livro : livros) {
            if (livro.getISBN() == ISBN) {
                System.out.print("CPF: ");
                String cpf = scan.next();
                scan.nextLine();
                for (Usuario usuario : usuarios) {
                    if (usuario.getCpf().equals(cpf)) {
                        if (livro.isEmprestado() && usuario.isEmprestado()) {
                            livro.setEmprestado(false);
                            usuario.setEmprestado(false);
                            System.out.println("Livro devolvido.");
                            return;
                        } else {
                            System.out.println("Livro não emprestado.");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }
}