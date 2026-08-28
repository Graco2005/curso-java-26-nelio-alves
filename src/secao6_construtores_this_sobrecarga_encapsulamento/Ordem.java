package secao6_construtores_this_sobrecarga_encapsulamento;

import java.util.Date;

public class Ordem {

    private Date data;
    private Produto produto;

    public Ordem(Date data, Produto produto) {
        super();
        this.data = data;
        this.produto.nome = "Computador";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
