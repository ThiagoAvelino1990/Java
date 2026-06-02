public class CalculadoraDeEstoque {
    public static void main(String[] args){

        IntroducaoJava introducaoJava = new IntroducaoJava();
        introducaoJava.imprimirDados();

        System.out.print("====== ");
        System.out.print("Orientação ao objeto");
        System.out.println(" ======");

        Livro livro1 = new Livro("Livro1", "Livro de estudos", 109.99, 123456789);

        livro1.imprimirDadosLivro();

        Livro livro2 = new Livro("Livro2", "Livro de receitas", 70.99, 987654321);

        livro2.imprimirDadosLivro();

        livro2.setValor(80.99);
        livro2.imprimirDadosLivro();


    }
}
