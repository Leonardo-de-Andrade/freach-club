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
import modelo.Produto;

/**
 *
 * @author Leonardo
 */
public class ProdutoDAO implements DAOMASTER<Produto> {

    private ResultSet resultadoQ = null;

    @Override
    public boolean salvar(Produto p) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO produto VALUES ("
                    + "DEFAULT, "
                    + "'" + p.getNome() + "', "
                    + "'" + p.getValorUnitario() + "', "
                    + "'" + p.getDescricao() + "', "
                    + "'" + p.getFornecedor() + "', "
                    + "'" + p.getCategoria() + "')";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar o produto = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Produto p) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE produto "
                    + "SET nome = '" + p.getNome() + "', "
                    + "valor_unitario = '" + p.getValorUnitario() + "', "
                    + "descricao = '" + p.getDescricao() + "', "
                    + "fornecedor_id = '" + p.getFornecedor() + "', "
                    + "categoria_id = '" + p.getCategoria() + "' "
                    + "WHERE id = " + p.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar os dados do produto = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM produto "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return false;
        }
    }

    public void popularTabela(JTable tabela, String busca) {

        int numColunas = 7;
        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Fornecedor";
        cabecalho[3] = "Categoria";
        cabecalho[4] = "Valor Unitario";
        cabecalho[5] = "Descrição";

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT p.id, p.nome, f.nome as nome_fornecedor, c.nome as nome_categoria, p.valor_unitario, p.descricao "
                            + "FROM produto p, categoria c, fornecedor f "
                            + "WHERE "
                            + "p.fornecedor_id = f.id AND "
                            + "p.categoria_id = c.id AND "
                            + "p.NOME ILIKE '%" + busca + "%' "
                            + "ORDER BY p.id"
                    );

            resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();

            dadosTabela = new Object[numRegistros][numColunas];

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("nome_fornecedor");
                dadosTabela[lin][3] = resultadoQ.getString("nome_categoria");
                dadosTabela[lin][4] = resultadoQ.getString("valor_unitario");
                dadosTabela[lin][5] = resultadoQ.getString("descricao");

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

                if (column == 7) {
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
                case 4:
                    column.setPreferredWidth(100);
                    break;
                case 5:
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

    @Override
    public Produto consultarId(int id) {
        Produto produto = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT p.id, p.nome, f.id as id_fornecedor, c.id as id_categoria, p.valor_unitario, p.descricao "
                    + "FROM produto p, categoria c, fornecedor f "
                    + "WHERE p.fornecedor_id = f.id and "
                    + "p.categoria_id = c.id and "
                    + "p.id = " + id;

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                produto = new Produto();
                produto.setId(resultadoQ.getInt("id"));
                produto.setNome(resultadoQ.getString("nome"));
                produto.setFornecedor(resultadoQ.getInt("id_fornecedor"));
                produto.setCategoria(resultadoQ.getInt("id_categoria"));
                produto.setValorUnitario(resultadoQ.getDouble("valor_unitario"));
                produto.setDescricao(resultadoQ.getString("descricao"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return produto;
    }
}
