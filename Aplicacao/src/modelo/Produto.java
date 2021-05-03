package modelo;

/**
 *
 * @author Leonardo
 */
public class Produto {

    private int id;
    private String nome;
    private Double valorUnitario;
    private String descricao;
    private Object fornecedor;
    private Object categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public Object getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Object fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Object getCategoria() {
        return categoria;
    }

    public void setCategoria(Object categoria) {
        this.categoria = categoria;
    }
}
