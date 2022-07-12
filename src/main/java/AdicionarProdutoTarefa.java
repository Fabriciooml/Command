public class AdicionarProdutoTarefa implements Tarefa {

    private Produto produto;

    public AdicionarProdutoTarefa(Produto produto) {
        this.produto = produto;
    }

    public void executar() {
        this.produto.adicionarCarrinho();
    }

    public void cancelar() {
        this.produto.retirarCarrinho();
    }
}