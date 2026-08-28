package secao5_introducao_poo.aula02;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco(R$)=" + preco +
                ", quantidade=" + quantidade +
                ", total do valor no estoque(R$)" + totalValorEstoque() +
                '}';
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
