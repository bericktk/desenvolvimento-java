package projeto.biblioteca;

public class Livro {
    
    private String titulo;
    private String autor;
    private int ISBN;
    private int ano_publicacao;
    private boolean emprestado;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Livro(String titulo, String autor, int ISBN, int ano_publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN++;
        this.ano_publicacao = ano_publicacao;
        this.emprestado = false;
    }

    public void emprestado() {
        if (!this.emprestado == false) {
            this.emprestado = true;
        } else {
            System.out.println("Livro já emprestado.");
        }
    }

    public void devolvido() {
        if (this.emprestado == true) {
            this.emprestado = false;
            System.out.println("Livro devolvido a biblioteca.");
        } else {
            System.out.println("Livro já está na biblioteca.");
        }
    }


}
