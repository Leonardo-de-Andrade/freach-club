package dao;

import complemento.ConexaoBD;
import complemento.DAOMASTER;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Pedido;
import modelo.PedidoProduto;

/**
 *
 * @author Leonardo
 */
public class PedidoDAO implements DAOMASTER<Pedido> {

    private ResultSet resultadoQ = null;

    @Override
    public boolean salvar(Pedido p) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO pedido VALUES ("
                    + "DEFAULT, "
                    + "'" + p.getCliente_id() + "', "
                    + "'" + p.getUsuario_id() + "', "
                    + "'" + p.getFormaPagamento() + "', "
                    + "'" + p.getStatus() + "', "
                    + "'" + p.getData() + "', "
                    + "'" + p.getTotal() + "')";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar o pedido = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Pedido p) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE pedido "
                    + "SET cliente_id = '" + p.getCliente_id() + "', "
                    + "usuario_id = '" + p.getUsuario_id() + "', "
                    + "forma_pagamento = '" + p.getFormaPagamento() + "', "
                    + "status = '" + p.getStatus() + "' "
                    + "WHERE id = " + p.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar o pedido = " + e);
            return false;
        }
    }

    public boolean salvarProduto(PedidoProduto pp) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO pedido_tem_produto VALUES ("
                    + "'" + pp.getPedido_id() + "', "
                    + "'" + pp.getProduto_id() + "', "
                    + "" + pp.getQuantidade() + ")";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar o produto = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE pedido "
                    + "SET status = 'Desativado' "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o pedido: " + e);
            return false;
        }
    }

    public int getIdPedido() {
        int produtoId = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT MAX(ID) as id FROM PEDIDO ");

            while (resultadoQ.next()) {
                produtoId = resultadoQ.getInt("id");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar o pedido...");
            System.out.println(e);
        }

        return produtoId;
    }

    public boolean setTotalPedido(Double totalPedido, int idPedido) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE pedido "
                    + "SET total = " + totalPedido + " "
                    + "WHERE id = " + idPedido;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao alterar o total do pedido: " + e);
            return false;
        }
    }

    public boolean setFormaPagamento(String pagamento, int idPedido) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE pedido "
                    + "SET forma_pagamento = '" + pagamento + "' "
                    + "WHERE id = " + idPedido;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao alterar a forma de pagamento do pedido: " + e);
            return false;
        }
    }

    public String validaEdicaoPedido(int idPedido) {

        String formaPagamento = "";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "Select forma_pagamento "
                    + "FROM pedido "
                    + "WHERE id = " + idPedido);

            while (resultadoQ.next()) {
                formaPagamento = resultadoQ.getString("forma_pagamento");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar o pedido...");
            System.out.println(e);
        }

        return formaPagamento;
    }

    public boolean excluirProduto(int idPedido, int idProduto) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM pedido_tem_produto "
                    + "WHERE pedido_id = " + idPedido + " and "
                    + "produto_id = " + idProduto;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o produto: " + e);
            return false;
        }
    }

    public void GerarCabecalho(JTable tabela) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Valor Unitario";
        cabecalho[3] = "Quantidade";

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override

            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(100);
                    break;
            }
        }

        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.cyan);
                } else {
                    setBackground(Color.white);
                }
                return this;
            }
        });
    }

    public void popularTabelaProduto(JTable tabela, int idPedido) {
        int numColunas = 4;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Valor Unitario";
        cabecalho[3] = "Quantidade";

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT p.id as produto_id, p.nome, p.valor_unitario, t.quantidade as quantidade_produto_pedido "
                            + "FROM produto p, pedido k, pedido_tem_produto t "
                            + "WHERE p.id = t.produto_id AND "
                            + "k.id = t.pedido_id AND "
                            + "k.id = " + idPedido
                            + "ORDER BY p.id"
                    );

            resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();

            dadosTabela = new Object[numRegistros][numColunas];

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("produto_id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("valor_unitario");
                dadosTabela[lin][3] = resultadoQ.getString("quantidade_produto_pedido");

                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela dos produtos do pedido...");
            System.out.println(e);
        }

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(70);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(5);
                    break;
            }
        }

        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.cyan);
                } else {
                    setBackground(Color.white);
                }
                return this;
            }
        });
    }

    public void popularTabelaPedido(JTable tabela, String criterio) {

        int numColunas = 4;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Cliente";
        cabecalho[2] = "Data";
        cabecalho[3] = "Total";

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT p.id, c.nome, to_char(p.data, 'DD/MM/YYYY') as data_atual, p.total "
                            + "FROM pedido p, cliente c "
                            + "WHERE p.cliente_id = c.id AND "
                            + "STATUS = 'Ativo'  AND "
                            + "c.nome ILIKE '%" + criterio + "%' "
                            + "ORDER BY id"
                    );

            resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();

            dadosTabela = new Object[numRegistros][numColunas];

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("data_atual");
                dadosTabela[lin][3] = resultadoQ.getDouble("total");

                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela do pedido...");
            System.out.println(e);
        }

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(70);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(5);
                    break;
            }
        }

        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.cyan);
                } else {
                    setBackground(Color.white);
                }
                return this;
            }
        });
    }

    public void popularTabelaPedidoPesquisaAmpla(JTable tabela, String dataIni, String dataFim, String pagamentoPedido, String statusPedido, String totalPedido) {

        int numColunas = 4;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Cliente";
        cabecalho[2] = "Data";
        cabecalho[3] = "Total";

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT p.id, c.nome, to_char(p.data, 'DD/MM/YYYY') as data_atual, p.total "
                            + "FROM pedido p, cliente c "
                            + "WHERE p.cliente_id = c.id AND "
                            + "p.FORMA_PAGAMENTO ILIKE '%" + pagamentoPedido + "%' AND "
                            + "p.STATUS ILIKE '%" + statusPedido + "%' AND "
                            + "p.TOTAL::varchar ILIKE '%" + totalPedido + "%' AND "
                            + "p.DATA >= to_date('" + dataIni + "','DD/MM/YYYY') AND "
                            + "p.DATA <= to_date('" + dataFim + "', 'DD/MM/YYYY') "
                            + "ORDER BY id"
                    );

            resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();

            dadosTabela = new Object[numRegistros][numColunas];

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("data_atual");
                dadosTabela[lin][3] = resultadoQ.getDouble("total");

                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela do pedido...");
            System.out.println(e);
        }

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(70);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(5);
                    break;
            }
        }

        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.cyan);
                } else {
                    setBackground(Color.white);
                }
                return this;
            }
        });
    }

    public void popularTabelaPedidoPesquisa(JTable tabela, String pagamentoPedido, String statusPedido, String totalPedido) {

        int numColunas = 4;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Cliente";
        cabecalho[2] = "Data";
        cabecalho[3] = "Total";

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT p.id, c.nome, to_char(p.data, 'DD/MM/YYYY') as data_atual, p.total "
                            + "FROM pedido p, cliente c "
                            + "WHERE p.cliente_id = c.id AND "
                            + "p.FORMA_PAGAMENTO ILIKE '%" + pagamentoPedido + "%' AND "
                            + "p.STATUS ILIKE '%" + statusPedido + "%' AND "
                            + "p.TOTAL::varchar ILIKE '%" + totalPedido + "%' "
                            + "ORDER BY id"
                    );

            resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();

            dadosTabela = new Object[numRegistros][numColunas];

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("data_atual");
                dadosTabela[lin][3] = resultadoQ.getDouble("total");

                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(70);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(5);
                    break;
            }
        }

        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.cyan);
                } else {
                    setBackground(Color.white);
                }
                return this;
            }
        });
    }

    @Override
    public Pedido consultarId(int id) {
        Pedido pedido = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT p.id, p.cliente_id, p.status, p.forma_pagamento, p.total "
                    + "FROM pedido p "
                    + "WHERE "
                    + "p.id = " + id;

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                pedido = new Pedido();
                pedido.setId(resultadoQ.getInt("id"));
                pedido.setCliente_id(resultadoQ.getInt("cliente_id"));
                pedido.setStatus(resultadoQ.getString("status"));
                pedido.setFormaPagamento(resultadoQ.getString("forma_pagamento"));
                pedido.setTotal(resultadoQ.getDouble("total"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return pedido;
    }
}
