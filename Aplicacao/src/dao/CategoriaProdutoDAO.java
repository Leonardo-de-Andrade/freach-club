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
import modelo.CategoriaProduto;

/**
 *
 * @author Leonardo
 */
public class CategoriaProdutoDAO implements DAOMASTER<CategoriaProduto> {

    private ResultSet resultadoQ = null;

    @Override
    public boolean salvar(CategoriaProduto c) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO categoria VALUES ("
                    + "DEFAULT, "
                    + "'" + c.getNome() + "', "
                    + "'" + c.getDescricao() + "')";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar a categoria = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(CategoriaProduto c) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE categoria "
                    + "SET nome = '" + c.getNome() + "', "
                    + "descricao = '" + c.getDescricao() + "' "
                    + "WHERE id = " + c.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a categoria do produto = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM categoria "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return false;
        }
    }

    public void popularTabela(JTable tabela, String nomeCat, String descricaoCat) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[3];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Descrição";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM categoria "
                    + "WHERE "
                    + "NOME ILIKE '%" + nomeCat + "%' and "
                    + "DESCRICAO ILIKE '%" + descricaoCat + "%'"
            );

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX: " + e);
        }

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM categoria "
                    + "WHERE "
                    + "NOME ILIKE '%" + nomeCat + "%' and "
                    + "DESCRICAO ILIKE '%" + descricaoCat + "%'"
                    + "ORDER BY id"
            );

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("descricao");

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

                if (column == 3) {
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
                    column.setPreferredWidth(100);
                    break;
                case 2:
                    column.setPreferredWidth(70);
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

    public String getCategoriaProduto(int categoriaId) {
        String categoria = "";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT nome "
                    + "FROM categoria "
                    + "WHERE id = " + categoriaId
            );

            while (resultadoQ.next()) {
                categoria = resultadoQ.getString("nome");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar a categoria do produto...");
            System.out.println(e);
        }

        return categoria;
    }

    @Override
    public CategoriaProduto consultarId(int id) {
        CategoriaProduto cat = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM categoria "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                cat = new CategoriaProduto();

                cat.setId(resultadoQ.getInt("id"));
                cat.setNome(resultadoQ.getString("nome"));
                cat.setDescricao(resultadoQ.getString("descricao"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return cat;
    }
}
