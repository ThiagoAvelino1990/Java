public class Livro {

    /**
     * declaração das variáveis de uma classe
     */
    private String nome;
    private String descricao;
    private double valor;
    private int isbn;

    /**
     * Construtor da classe Livro que recebe parâmetros
     * @param nomeLivro
     * @param descricaoLivro
     * @param valorLivro
     * @param isbnLivro
     */
    public Livro(String nomeLivro, String descricaoLivro, double valorLivro, int isbnLivro){
        this.nome = nomeLivro;
        this.descricao = descricaoLivro;
        this.valor = valorLivro;
        this.isbn = isbnLivro;
    }

    /**
     * Declaração dos métodos getters and setters
     */
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public int getIsbn(){
        return this.isbn;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
}
