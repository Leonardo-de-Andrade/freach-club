package frenchclub;

import complemento.ConexaoBD;
import javax.swing.JOptionPane;
import tela.JanelaLogin;

/**
 *
 *
 * @author Leonardo
 */
public class Main {

    public static void main(String[] args) {

        if (ConexaoBD.getInstance() != null) {
            JanelaLogin jlogin = new JanelaLogin();
            jlogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco!");
        }
    }
}
