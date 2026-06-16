public class CalculadoraDeEstoque {
    public static void main(String[] args){

        IntroducaoJava introducaoJava = new IntroducaoJava();
        introducaoJava.imprimirDados();

        System.out.print("====== ");
        System.out.print("Orientação ao objeto");
        System.out.println(" ======");

        Livro livro1 = new Livro("Livro1", "Livro de estudos", 109.99, 123456789);

        System.out.println(livro1.toString());

        Livro livro2 = new Livro("Livro2", "Livro de receitas", 70.99, 987654321);

        System.out.println(livro2.toString());

        livro2.setValor(80.99);
        System.out.println(livro2.toString());

        System.out.print("====== ");
        System.out.print("Orientação ao objeto - Referênciando Uma classe em outra classe");
        System.out.println(" ======");

        Autor autor1 = new Autor();
        autor1.setNome("Joãozinho");
        autor1.setCpf(12345678);
        autor1.setEmail("joaozinho@email.com.br");

        Autor autor2 = new Autor();
        autor2.setNome("Mariazinha");
        autor2.setCpf(22345678);
        autor2.setEmail("mariazinha@email.com.br");

        livro1.autor = autor1; //Referência

        System.out.println(livro1.aplicarDesconto(99.99));
        System.out.println(livro1.toString());
        if(livro1.temAutor()){
            System.out.println(autor1.toString());
        }


        livro2.autor = autor2; // Referência
        System.out.println(livro2.toString());
        if(livro2.temAutor()){
            System.out.println(autor2.toString());
        }

        Livro livro3 = new Livro("Camaroes me mordam", "Livro sobre camaroes",90.99, 897867445 );

        Autor autor3 = new Autor();

        System.out.println(livro3.toString());
        if(livro3.temAutor()){
            System.out.println(autor3.toString());
        }else{
            System.out.println("Livro não possui autor");
        }


    }
}
