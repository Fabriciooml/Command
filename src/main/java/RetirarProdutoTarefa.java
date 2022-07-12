public class RetirarProdutoTarefa implements Tarefa {

    private Produto produto;

    public RetirarProdutoTarefa(Produto produto) {
        this.produto = produto;
    }

    public void executar() {
        this.produto.retirarCarrinho();
    }

    public void cancelar() {
        this.produto.adicionarCarrinho();
    }
}