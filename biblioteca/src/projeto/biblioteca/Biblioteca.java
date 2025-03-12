package projeto.biblioteca;

/**
 * @author Bruno Erick
 * @version 1.0
 */

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!.");
    }

    public void removerLivro(int iSBN) {
        livros.remove(iSBN);
        System.out.println("Livro removido com sucesso!.");
    }

    public void buscarLivro(int ISBN) {
        for (Livro livro : livros) {
            if (livro.getISBN() == ISBN) {
                System.out.println("Livro encontrado: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("ISBN: " + livro.getISBN());
            System.out.println("Ano de publicação: " + livro.getAno_publicacao());
            System.out.println("Emprestado: " + livro.isEmprestado());
            System.out.println();
        }
    }

    public void emprestarLivro(int ISBN) {
        for (Livro livro : livros) {
            if (livro.getISBN() == ISBN) {
                if (livro.isEmprestado() == false) {
                    livro.setEmprestado(true);
                    System.out.println("Livro emprestado.");
                    return;
                } else {
                    System.out.println("Livro já emprestado.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(int ISBN) {
        for (Livro livro : livros) {
            if (livro.getISBN() == ISBN) {
                if (livro.isEmprestado() == true) {
                    livro.setEmprestado(false);
                    System.out.println("Livro devolvido.");
                    return;
                } else {
                    System.out.println("Livro não emprestado.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void addUser(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!.");
    }
}
