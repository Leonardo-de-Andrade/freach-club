package modelo;

import java.util.Date;

/**
 *
 * @author Leonardo
 */
public class Pedido {

    private int id;
    private String formaPagamento;
    private String status;
    private Object cliente_id;
    private Object usuario_id;
    private Date data;
    private Double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Object getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Object cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Object getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Object usuario_id) {
        this.usuario_id = usuario_id;
    }
}
