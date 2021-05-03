package modelo;

/**
 *
 * @author Leonardo
 */
public class PedidoProduto {

    private Object pedido_id;
    private Object produto_id;
    private int quantidade;

    public Object getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Object pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Object getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Object produto_id) {
        this.produto_id = produto_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
