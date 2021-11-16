package Classes;

public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private int numerodePaginas;

    public Livro(String codigo, String titulo, String autor, int numerodePaginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodePaginas = numerodePaginas;
    }

    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getNumerodePaginas() {
        return numerodePaginas;
    }


    public void setNumerodePaginas(int numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    public void add(Livro livro) {
    }

    @Override
    public String toString() {
        return "\nLivro [Autor=" + autor + ", Código=" + codigo + ", Número de Paginas=" + numerodePaginas + ", Título="
                + titulo + "]\n";
    }  
}