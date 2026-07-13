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
        return super.toString();
    }
}
