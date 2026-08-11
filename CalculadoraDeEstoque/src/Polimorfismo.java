public class Polimorfismo {


    Autor autorPoli;

    Livro ebook;
    Livro livroFisico;
    CarrinhoDeCompras carrinhoDeCompras;
    CarrinhoDeCompras carrinhoDeComprasTwo;



    public void imprimirDadosPolimorfismo(){
        System.out.println("==================");
        System.out.println("-- Polimorfismo --");
        System.out.println("==================");

        autorPoli = new Autor();
        autorPoli.setNome("Autor do polimorfimo");

        carrinhoDeCompras = new CarrinhoDeCompras();

        ebook = new Ebook(autorPoli); //abstração
        ebook.setValor(89.90);
        carrinhoDeCompras.adicionaLivro(ebook); //abstração

        livroFisico = new LivroFisico(autorPoli);
        livroFisico.setValor(90.99);
        carrinhoDeCompras.adicionaLivro(livroFisico);

        System.out.println("Valor total da compra:"+carrinhoDeCompras.getTotal());



        //carrinhoDeComprasTwo = new CarrinhoDeCompras(livroFisico);


    }
}
