package secao6_construtores_this_sobrecarga_encapsulamento;
// Construtores, this, Sobrecarga e Encapsulamento em Java


public class Produto {

    String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco(R$)=" + preco +
                ", quantidade=" + quantidade +
                ", total do valor no estoque(R$)" + totalValorEstoque() +
                '}';
    }

    // Caso, apesar de já ter outros construtores personalizados como os abaixo, você deseje ter um construtor padrão, basta inicializar ele sem valor algum
    public Produto(){
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double totalValorEstoque() {
        return preco * quantidade;
    }

    // A palavra 'this' tem a função de evitar ambiguidades em casos como esse que o meu objeto quantidade possui o mesmo nome do parâmetro da função adicionarProduto
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
}
