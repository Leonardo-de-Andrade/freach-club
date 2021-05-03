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
import modelo.Usuario;

/**
 *
 * @author Leonardo
 */
public class UsuarioDAO implements DAOMASTER<Usuario> {

    private ResultSet resultadoQ = null;

    @Override
    public boolean salvar(Usuario u) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO usuario VALUES ( "
                    + "DEFAULT, "
                    + "'" + u.getNome() + "', "
                    + "'" + u.getEmail() + "', "
                    + "md5('" + u.getSenha() + "'), "
                    + "'" + u.getStatus() + "' "
                    + ")";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar o usuario = " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Usuario u) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE usuario "
                    + "SET nome = '" + u.getNome() + "', "
                    + "email = '" + u.getEmail() + "', "
                    + "senha = md5('" + u.getSenha() + "'), "
                    + "status = '" + u.getStatus() + "' "
                    + "WHERE id = " + u.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar o usuario = " + e);
            return false;
        }
    }

    public boolean atualizarSemSenha(Usuario u) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE usuario "
                    + "SET nome = '" + u.getNome() + "', "
                    + "email = '" + u.getEmail() + "', "
                    + "senha = '" + u.getSenha() + "', "
                    + "status = '" + u.getStatus() + "' "
                    + "WHERE id = " + u.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar o usuario = " + e);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE "
                    + "FROM usuario "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return false;
        }
    }

    @Override
    public Usuario consultarId(int id) {
        Usuario us = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM usuario "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                us = new Usuario();

                us.setId(resultadoQ.getInt("id"));
                us.setNome(resultadoQ.getString("nome"));
                us.setEmail(resultadoQ.getString("email"));
                us.setSenha(resultadoQ.getString("senha"));
                us.setStatus(resultadoQ.getString("status"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }

        return us;
    }

    public String getSenhaUsuario(int id) {

        String senhaUsuario = "";

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT senha "
                    + "FROM usuario "
                    + "WHERE id = " + id);

            while (resultadoQ.next()) {
                senhaUsuario = resultadoQ.getString("senha");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar a senha...");
            System.out.println(e);
        }

        return senhaUsuario;
    }

    public boolean autenticar(String usuario, String senha, String status) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM usuario "
                    + "WHERE "
                    + "email = '" + usuario + "' AND "
                    + "senha = md5('" + senha + "') AND "
                    + "status = '" + status + "'";

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            return resultadoQ.next();

        } catch (Exception e) {
            System.out.println("Erro ao autenticar: " + e);
            return false;
        }
    }

    public int getUsuario(String usuario, String senha, String status) {

        int usuarioId = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT id "
                    + "FROM usuario "
                    + "WHERE "
                    + "email = '" + usuario + "' AND "
                    + "senha = md5('" + senha + "') AND "
                    + "status = '" + status + "'");

            while (resultadoQ.next()) {
                usuarioId = resultadoQ.getInt("id");
            }

        } catch (Exception e) {
            System.out.println("problemas para encontrar o usuario...");
            System.out.println(e);
        }

        return usuarioId;
    }

    public void popularTabela(JTable tabela, String nomeUsuario, String emailUsuario, String statusUsuario) {

        int numColunas = 4;
        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Email";
        cabecalho[3] = "Status";

        int lin = 0;

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT * "
                            + "FROM usuario "
                            + "WHERE "
                            + "NOME ILIKE '%" + nomeUsuario + "%' and "
                            + "EMAIL ILIKE '%" + emailUsuario + "%' and "
                            + "STATUS ILIKE '%" + statusUsuario + "%'"
                            + "ORDER BY id"
                    );

            resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();

            dadosTabela = new Object[numRegistros][numColunas];

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("email");
                dadosTabela[lin][3] = resultadoQ.getString("status");

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

                if (column == 2) {
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

        tabela.setDefaultRenderer(Object.class,
                new DefaultTableCellRenderer() {

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
        }
        );
    }
}
