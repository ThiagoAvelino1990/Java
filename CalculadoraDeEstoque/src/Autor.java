public class Autor {

    /**
     * Construtor da classe
     */
    public Autor(){
        System.out.println("Um Autor foi criado");
    }

    private String nome;
    private String email;
    private Integer cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
