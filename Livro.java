public class Livro {
    // Atributos do livro
    private String titulo;
    private String autor;
    private int ano;
    private double preco;
    private int numPaginas;

    // Construtor da classe, inicializando todos os atributos
    public Livro(String titulo, String autor, int ano, double preco, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.numPaginas = numPaginas;
    }

    // Métodos de acesso (getters e setters) para cada atributo
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    // Método que calcula o preço por página do livro
    public double calcularPrecoPorPagina() {
        return preco / numPaginas;
    }

    // Método para exibir as informações do livro formatadas
    public void imprimirInformacoes() {
        System.out.println("==== Informações do Livro ====");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Preço por página: R$" + calcularPrecoPorPagina());
        System.out.println("==============================");
    }
}
