public class LivroFisico extends Livro{

    public LivroFisico(Autor autor){
        super(autor);
    }

    public void getTaxaDeImpressao(double taxa){
        this.setValor(this.getValor() + (this.getValor() * (taxa/100)));
        System.out.println("Taxa aplicada de: "+taxa+" %");
    }

    @Override
    public void imprimirDadosLivro(){
        System.out.println("Nome do livro: "+super.getNome()+"\nDescrição do Livro: "+super.getDescricao()+"\nValor do Livro: "+super.getValor()+"\nISBN: "+super.getIsbn()+"\nAutor: "+super.getAutor());
    }

    @Override
    public boolean aplicarDesconto(double desconto){
        if (desconto > 10) {
            System.out.println("Desconto não aplicado");
            return false;
        }
        //Acessar atributos da classe pai
        System.out.println("(Livro Físico)Usando a classe pai para desconto");
        return super.aplicarDesconto(desconto);
    }
}
