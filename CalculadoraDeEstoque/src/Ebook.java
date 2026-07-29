public class Ebook extends Livro{
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWaterMark(){
        return this.waterMark;
    }
    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "waterMark='" + waterMark + '\'' +
                '}';
    }

    @Override
    public void imprimirDadosLivro() {
        super.imprimirDadosLivro();
    }

    @Override
    public boolean aplicarDesconto(double desconto){
        if (desconto > 15) {
            return false;
        }
        //Acessar atributos da classe pai
        return super.aplicarDesconto(desconto);
    }

}
