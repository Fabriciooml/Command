import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarrinhoTest {

    Carrinho carrinho;
    Produto produto;

    @BeforeEach
    void setUp(){
        carrinho = new Carrinho();
        produto = new Produto("Playstation 5", 4749.90f);
    }

    @Test
    void deveAdicionarProduto() {
        Tarefa adicionaProduto = new AdicionarProdutoTarefa(produto);
        carrinho.executarTarefa(adicionaProduto);

        assertEquals("Produto adicionado ao carrinho", produto.getSituacao());
    }

    @Test
    void deveRetirarProduto() {
        Tarefa retiraProduto = new RetirarProdutoTarefa(produto);
        carrinho.executarTarefa(retiraProduto);

        assertEquals("Produto retirado do carrinho", produto.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa adicionaProduto = new AdicionarProdutoTarefa(produto);
        Tarefa retiraProduto = new RetirarProdutoTarefa(produto);

        carrinho.executarTarefa(adicionaProduto);
        carrinho.executarTarefa(retiraProduto);

        carrinho.cancelarUltimaTarefa();

        assertEquals("Produto adicionado ao carrinho", produto.getSituacao());
    }
}
