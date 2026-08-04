public class Heranca {

    public Heranca(){

    }

    public void ImprimirDadosHeranca(){
        System.out.println("=============");
        System.out.println("-- Herança --");
        System.out.println("=============");

        Autor autor = new Autor();
        autor.setNome("Bonifácio");
        autor.setEmail("Teste@email.com.br");
        autor.setCpf(111111111);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Livro Ebook");
        ebook.setValor(89.90);
        ebook.aplicarDesconto(13);

        ebook.imprimirDadosLivro();

        System.out.println("================================");
        System.out.println("-- Herança  Classe LivroFisico--");
        System.out.println("================================");
        Autor autorLivroFisico = new Autor();
        autorLivroFisico.setCpf(333333333);
        autorLivroFisico.setNome("Fisiculturista");
        autorLivroFisico.setEmail("fisio@email.com");

        LivroFisico livroFisico = new LivroFisico(autorLivroFisico);
        livroFisico.setValor(90.99);
        livroFisico.setNome("Livro de fisica");
        livroFisico.setDescricao("Um livro de fisica");
        livroFisico.setIsbn(101010101);
        System.out.println("Valor do livro "+livroFisico.getValor());
        livroFisico.getTaxaDeImpressao(20);
        livroFisico.imprimirDadosLivro();


    }
}
