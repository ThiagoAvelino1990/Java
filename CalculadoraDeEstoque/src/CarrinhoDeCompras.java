public class CarrinhoDeCompras {

    private double total;

    public CarrinhoDeCompras(){

    }

    public void adicionaLivro(Livro livro){
        System.out.println("Livro adicionado: "+livro);
        livro.aplicarDesconto(5);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
