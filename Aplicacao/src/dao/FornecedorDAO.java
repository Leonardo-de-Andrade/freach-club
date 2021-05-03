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
import modelo.Fornecedor;

/**
 *
 * @author Leonardo
 */
public class FornecedorDAO implements DAOMASTER<Fornecedor> {

    private ResultSet resultadoQ = null;

    @Override
    public boolean salvar(Fornecedor f) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO fornecedor VALUES ("
                    + "DEFAULT, "
                    + "'" + f.getNome() + "', "
                    + "'" + f.getTelefone() + "', "
                    + "'" + f.getEmpresa() + "')";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar o fornecedor = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Fornecedor f) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE fornecedor "
                    + "SET nome = '" + f.getNome() + "', "
                    + "telefone = '" + f.getTelefone() + "', "
                    + "empresa = '" + f.getEmpresa() + "' "
                    + "WHERE id = " + f.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar os dados do fornecedor = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM fornecedor "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return false;
        }
    }

    public void popularTabela(JTable tabela, String nomeFornec, String telefoneFornec, String empresaFornec) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Telefone";
        cabecalho[3] = "Empresa";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM fornecedor "
                    + "WHERE "
                    + "NOME ILIKE '%" + nomeFornec + "%' and "
                    + "TELEFONE ILIKE '%" + telefoneFornec + "%' and "
                    + "EMPRESA ILIKE '%" + empresaFornec + "%'"
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
                    + "FROM fornecedor "
                    + "WHERE "
                    + "NOME ILIKE '%" + nomeFornec + "%' and "
                    + "TELEFONE ILIKE '%" + telefoneFornec + "%' and "
                    + "EMPRESA ILIKE '%" + empresaFornec + "%'"
                    + "ORDER BY id"
            );

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("telefone");
                dadosTabela[lin][3] = resultadoQ.getString("empresa");

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
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
                case 2:
                    column.setPreferredWidth(20);
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
    
     public String getFornecedor(int fornecedorId) {
        String fornecedor = "";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT nome "
                    + "FROM fornecedor "
                    + "WHERE id = " + fornecedorId
            );

            while (resultadoQ.next()) {
                fornecedor = resultadoQ.getString("nome");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar o fornecedor...");
            System.out.println(e);
        }

        return fornecedor;
    }

    @Override
    public Fornecedor consultarId(int id) {
        Fornecedor fornec = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM fornecedor "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                fornec = new Fornecedor();

                fornec.setId(resultadoQ.getInt("id"));
                fornec.setNome(resultadoQ.getString("nome"));
                fornec.setTelefone(resultadoQ.getString("telefone"));
                fornec.setEmpresa(resultadoQ.getString("empresa"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return fornec;
    }
}
