public class IntroducaoJava {

    public IntroducaoJava(){

    }

    public void imprimirDados(){
        System.out.print("====== ");
        System.out.print("Livro - Desbravando Java e Orientação a objetos");
        System.out.print(" - Casa do Código");
        System.out.println(" ======");

        /** Tabela de tipos primitivos da linguagem Java
         * boolean  -> 1 bit
         * byte     -> 1 byte
         * short    -> 2 bytes
         * char     -> 2 bytes
         * int      -> 4 bytes
         * float    -> 4 bytes
         * long     -> 8 bytes
         * double   -> 8 bytes
         *
         */
        System.out.print("====== ");
        System.out.print("Tipos primitivos");
        System.out.println(" ======");

        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        double soma = livroTDD + livroJava8;

        System.out.println("Soma total: "+ soma);

        System.out.print("====== ");
        System.out.print("Casting de valores");
        System.out.println(" ======");

        System.out.println("Falor double: "+livroJava8);
        int numerointerio = (int) livroJava8;
        System.out.println("Valor do cast de inteiro: "+numerointerio);

        System.out.print("====== ");
        System.out.print("Condicionais");
        System.out.println(" ======");

        if (soma < 150){
            System.out.println("Estoque está muito baixo");
        }else if (soma >= 2000){
            System.out.println("Estoque está alto");
        }else{
            System.out.println("Estoque está bom");
        }
        System.out.println("------");
        System.out.println("Exemplo de operador ternário");
        double v1 = 10;
        double v2 = 20;
        double val = v1 > v2 ? 100 : 0;
        System.out.println(val);

        System.out.print("====== ");
        System.out.print("Loops de controle");
        System.out.println(" ======");

        System.out.println("While");
        int contador = 0;
        while(contador < 20 ){
            contador +=1;
        }
        System.out.println(contador);
        /**
         * Técnicas para operadores
         * Operador -> Equivalente
         * +=       -> x=x+x;
         * -=       -> x=x-x;
         * *=       -> x=x*x;
         * /=       -> x=x/x;
         * %=       -> x=x%x;
         */

        System.out.println("For");

        for(int i = 0; i < 5; i++){
            System.out.println("Valor de i é: "+i);
        }

        for(int i = 0; i < 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println("continue - Valor de i é: "+i);
        }

        for(int i = 0; i < 5; i++){
            if (i == 3){
                break;
            }
            System.out.println("break -Valor de i é: "+i);
        }

        System.out.print("====== ");
        System.out.print("Operadores Lógicos");
        System.out.println(" ======");
        /**
         * Operador - Significado
         * &&       -> E
         * ||       -> OU
         * !        -> NOT
         */
        int valorA  = 10;
        int valorB  = 20;
        int valorC  = 30;
        if (valorA < valorB && valorA < valorC){
            System.out.println("Condição com operador E. Todas as condições devem ser verdadeiras");
        }

        if (valorA > valorB || valorA < valorC){
            System.out.println("Condição com o operador OU. Uma das condições deve ser verdadeira");
        }

        if (!(valorA > valorB)){
            System.out.println("Condição com o operador NOT. Negação da condição");
        }

    }
}
