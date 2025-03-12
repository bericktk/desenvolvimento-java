package projeto.biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 123456, 1954);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 654321, 1997);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.listarLivros();
        biblioteca.buscarLivro(123456);
        biblioteca.buscarLivro(654321);
        biblioteca.emprestarLivro(123456);
        biblioteca.emprestarLivro(123456);
        biblioteca.devolverLivro(123456);
        biblioteca.devolverLivro(123456);
        biblioteca.listarLivros();
    }
}
