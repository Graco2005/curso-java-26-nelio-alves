package secao7_comportamento_memoria_array_listas.aula03;

public class Quarto {

    private String nome;
    private String email;
    private int numeracao;

    public Quarto(String nome, String email, int numeracao) {
        this.nome = nome;
        this.email = email;
        this.numeracao = numeracao;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }
}
