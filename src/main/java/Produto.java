public class Produto {

    private String nome;
    private float preco;
    private String situacao;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getSituacao() {
        return situacao;
    }

    public void adicionarCarrinho() {
        this.situacao = "Produto adicionado ao carrinho";
    }

    public void retirarCarrinho() {
        this.situacao = "Produto retirado do carrinho";
    }
}
