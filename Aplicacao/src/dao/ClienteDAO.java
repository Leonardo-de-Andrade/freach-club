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
import modelo.Cliente;

/**
 *
 * @author Leonardo
 */
public class ClienteDAO implements DAOMASTER<Cliente> {

    private ResultSet resultadoQ = null;

    @Override
    public boolean salvar(Cliente c) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO cliente VALUES ("
                    + "DEFAULT, "
                    + "'" + c.getNome() + "', "
                    + "'" + c.getCpf() + "', "
                    + "'" + c.getRg() + "', "
                    + "'" + c.getTelefone() + "')";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar o cliente = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Cliente c) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE cliente "
                    + "SET nome = '" + c.getNome() + "', "
                    + "cpf = '" + c.getCpf() + "', "
                    + "rg = '" + c.getRg() + "', "
                    + "telefone = '" + c.getTelefone() + "' "
                    + "WHERE id = " + c.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar os dados do cliente = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM cliente "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return false;
        }
    }

    public void popularTabela(JTable tabela, String nomeCliente, String cpfCliente, String rgCliente, String telefoneCliente) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "CPF";
        cabecalho[3] = "RG";
        cabecalho[4] = "Telefone";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM cliente "
                    + "WHERE "
                    + "NOME ILIKE '%" + nomeCliente + "%' and "
                    + "CPF ILIKE '%" + cpfCliente + "%' and "
                    + "RG ILIKE '%" + rgCliente + "%' and "
                    + "TELEFONE ILIKE '%" + telefoneCliente + "%' "
            );

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][6];

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX: " + e);
        }

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM cliente "
                    + "WHERE "
                    + "NOME ILIKE '%" + nomeCliente + "%' and "
                    + "CPF ILIKE '%" + cpfCliente + "%' and "
                    + "RG ILIKE '%" + rgCliente + "%' and "
                    + "TELEFONE ILIKE '%" + telefoneCliente + "%' "
                    + "ORDER BY id"
            );

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cpf");
                dadosTabela[lin][3] = resultadoQ.getString("rg");
                dadosTabela[lin][4] = resultadoQ.getString("telefone");

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

                if (column == 5) {
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
                    column.setPreferredWidth(100);
                    break;
                case 2:
                    column.setPreferredWidth(20);
                    break;
                case 3:
                    column.setPreferredWidth(20);
                    break;
                case 4:
                    column.setPreferredWidth(20);
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

    public String getClientePedido(int clienteId) {
        String cliente = "";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT nome "
                    + "FROM cliente "
                    + "WHERE id = " + clienteId
            );

            while (resultadoQ.next()) {
                cliente = resultadoQ.getString("nome");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar o pedido...");
            System.out.println(e);
        }

        return cliente;
    }

    @Override
    public Cliente consultarId(int id) {
        Cliente cli = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM cliente "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                cli = new Cliente();

                cli.setId(resultadoQ.getInt("id"));
                cli.setNome(resultadoQ.getString("nome"));
                cli.setCpf(resultadoQ.getString("cpf"));
                cli.setRg(resultadoQ.getString("rg"));
                cli.setTelefone(resultadoQ.getString("telefone"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return cli;
    }
}
