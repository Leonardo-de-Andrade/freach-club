package tela;

import complemento.Formatacao;
import complemento.Validacao;
import dao.ClienteDAO;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Leonardo
 */
public class IfrCliente extends javax.swing.JInternalFrame {

    int id = 0;

    public IfrCliente() {
        initComponents();
        new ClienteDAO().popularTabela(tblCliente, "", "", "", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        tfdId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdRg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jftfCpf = new javax.swing.JFormattedTextField();
        jftfTelefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfdBuscaNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfdBuscaTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfdBuscaCpf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfdBuscaRg = new javax.swing.JTextField();

        setTitle("Cadastro de Clientes");
        setToolTipText("");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tfdId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdId.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("RG");

        tfdNome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdNomeActionPerformed(evt);
            }
        });

        tfdRg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdRgActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Telefone");

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCpf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jftfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfCpfActionPerformed(evt);
            }
        });

        try {
            jftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfTelefone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jftfCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdRg)
                            .addComponent(jftfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addContainerGap(143, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(6, 6, 6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdRg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        jLabel1.setText("Nome");

        tfdBuscaNome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdBuscaNomeActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF");

        tfdBuscaTelefone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel7.setText("Telefone");

        tfdBuscaCpf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel10.setText("RG");

        tfdBuscaRg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfdBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(tfdBuscaRg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdBuscaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tfdBuscaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnPesquisar)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfdBuscaRg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfdBuscaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfdBuscaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (tfdNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o nome do cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tfdRg.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "O campo RG deve ter no máximo 15 caracteres!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jftfTelefone.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "O campo Telefone deve ter no máximo 15 caracteres!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (!jftfCpf.getText().equals("   .   .   -  ") && !Validacao.validarCPF(Formatacao.removerFormatacao(jftfCpf.getText()))) {
            JOptionPane.showMessageDialog(null, "O campo cpf é inválido!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Cliente client = new Cliente();
        client.setNome(tfdNome.getText());
        client.setRg(tfdRg.getText());
        client.setTelefone(jftfTelefone.getText().equals("(  )      -    ") ? "" : jftfTelefone.getText());
        client.setCpf(jftfCpf.getText().equals("   .   .   -  ") ? "" : jftfCpf.getText());
        if (tfdId.getText().equals("")) {
            client.setId(id);
        } else {
            client.setId(Integer.parseInt(tfdId.getText()));
        }

        ClienteDAO clientDAO = new ClienteDAO();

        try {
            if (tfdId.getText().equals("") && clientDAO.salvar(client)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else if (!tfdId.getText().equals("") && clientDAO.atualizar(client)) {
                JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
            }

            tfdNome.setText("");
            jftfCpf.setText("");
            tfdRg.setText("");
            jftfTelefone.setText("");
            tfdId.setText("");

            tfdNome.requestFocus();
            jftfCpf.requestFocus();
            tfdRg.requestFocus();
            jftfTelefone.requestFocus();
            tfdId.requestFocus();

            id = 0;
        } catch (Exception e) {
            System.out.println("Erro ao executar a ação = " + e);
        }    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new ClienteDAO().popularTabela(tblCliente, tfdBuscaNome.getText(), tfdBuscaCpf.getText(), tfdBuscaRg.getText(), tfdBuscaTelefone.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (tblCliente.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o cliente que deseja editar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente client = clienteDAO.consultarId(id);

        if (client != null) {
            tfdNome.setText(client.getNome());
            jftfCpf.setText(client.getCpf());
            tfdRg.setText(client.getRg());
            jftfTelefone.setText(client.getTelefone());
            tfdId.setText(String.valueOf(client.getId()));

            jTabbedPane1.setSelectedIndex(0);

        } else {
            System.out.println("erro na consulta");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (tblCliente.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o cliente que deseja excluir!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).equals(id)) {
            JOptionPane.showMessageDialog(null, "Não é possível excluir um cliente que está sendo editado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        ClienteDAO clienteDAO = new ClienteDAO();

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            if (clienteDAO.excluir(id)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                new ClienteDAO().popularTabela(tblCliente, tfdBuscaNome.getText(), tfdBuscaCpf.getText(), tfdBuscaRg.getText(), tfdBuscaTelefone.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void tfdBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdBuscaNomeActionPerformed

    private void tfdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdNomeActionPerformed

    }//GEN-LAST:event_tfdNomeActionPerformed

    private void tfdRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdRgActionPerformed

    private void jftfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JFormattedTextField jftfTelefone;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField tfdBuscaCpf;
    private javax.swing.JTextField tfdBuscaNome;
    private javax.swing.JTextField tfdBuscaRg;
    private javax.swing.JTextField tfdBuscaTelefone;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdRg;
    // End of variables declaration//GEN-END:variables
}
