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
    }
}
