public class Livro{
    //Atributos:
    private String title;
    private String author;
    private int year;
    private double price;
    private int pages;
    
    //Método construtor:
    public Livro (String title,String author, int year, double price, int pages){
        this.title = title;
        this.author = author;
        this. year = year;
        this.price = price;
        this.pages = pages;
    }
    
    //Getters e Setters:
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getPages(){
        return pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    
    //Preço por página:
    public double calcularPrecoPorPagina(){
        return price / pages;
    }
    
    //Método para exibir as informaões do livro
    public void exibirInformacoes() {
        System.out.println("=======INFORMAÇÕES DO LIVRO=======");
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Ano: " + year);
        System.out.println("Preço: R$" + price);
        System.out.println("Páginas: " + pages);
        System.out.println("Preço por página: R$" + String.format("%.2f",calcularPrecoPorPagina()));
        System.out.println("==============================");
    }
}