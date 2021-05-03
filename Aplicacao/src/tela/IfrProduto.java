package tela;

import javax.swing.JOptionPane;
import modelo.Produto;
import dao.CategoriaProdutoDAO;
import dao.FornecedorDAO;
import dao.ProdutoDAO;

/**
 *
 * @author Leonardo
 */
public class IfrProduto extends javax.swing.JInternalFrame {

    int id = 0;

    public IfrProduto() {
        initComponents();
        tfdCategoriaProduto.setEditable(false);
        jtfCategoriaProdutoId.setVisible(false);
        jtfFornecedor.setEditable(false);
        jtfFornecedorId.setVisible(false);
        new ProdutoDAO().popularTabela(tblProduto, "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        tfdId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfdDescricao = new javax.swing.JTextField();
        jffValorUnitario = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfdCategoriaProduto = new javax.swing.JTextField();
        jbPesquisarCategoria = new javax.swing.JButton();
        jtfCategoriaProdutoId = new javax.swing.JTextField();
        jtfFornecedor = new javax.swing.JTextField();
        jbPesquisarFornecedor = new javax.swing.JButton();
        jtfFornecedorId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfdBusca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setTitle("Cadastro de Produtos");
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Valor Unitario");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fornecedor");

        tfdNome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tfdId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdId.setEnabled(false);
        tfdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Id");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Categoria do Produto");

        tfdDescricao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jffValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,##"))));
        jffValorUnitario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        tfdCategoriaProduto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jbPesquisarCategoria.setText("Pesquisar");
        jbPesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarCategoriaActionPerformed(evt);
            }
        });

        jtfFornecedor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jbPesquisarFornecedor.setText("Pesquisar");
        jbPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(tfdDescricao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCategoriaProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFornecedorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jffValorUnitario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdCategoriaProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPesquisarCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbPesquisarFornecedor, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtfCategoriaProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFornecedorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbPesquisarFornecedor)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPesquisarCategoria))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jffValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel5.setText("Busca");

        tfdBusca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProduto);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (jtfFornecedorId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um fornecedor", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jtfCategoriaProdutoId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma categoria para o produto", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tfdNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um nome para o produto", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jffValorUnitario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o valor unitário do produto", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jffValorUnitario.getDocument().getLength() > 5) {
            JOptionPane.showMessageDialog(null, "Não são aceitos valores na casa da centena ou acima", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Produto p = new Produto();
        p.setNome(tfdNome.getText());
        p.setFornecedor(Integer.parseInt(jtfFornecedorId.getText()));
        p.setCategoria(Integer.parseInt(jtfCategoriaProdutoId.getText()));
        p.setValorUnitario(Double.parseDouble(jffValorUnitario.getText()));
        p.setDescricao(tfdDescricao.getText());
        if (tfdId.getText().equals("")) {
            p.setId(id);
        } else {
            p.setId(Integer.parseInt(tfdId.getText()));
        }

        ProdutoDAO produtoDAO = new ProdutoDAO();

        try {
            if (tfdId.getText().equals("") && produtoDAO.salvar(p)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else if (!tfdId.getText().equals("") && produtoDAO.atualizar(p)) {
                JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
            }

            tfdNome.setText("");
            jtfFornecedor.setText("");
            jtfFornecedorId.setText("");
            tfdCategoriaProduto.setText("");
            jtfCategoriaProdutoId.setText("");
            jffValorUnitario.setText("");
            tfdDescricao.setText("");
            tfdId.setText("");

            tfdNome.requestFocus();
            jffValorUnitario.requestFocus();
            tfdDescricao.requestFocus();
            tfdId.requestFocus();

            id = 0;
        } catch (Exception e) {
            System.out.println("Erro ao executar a ação = " + e);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new ProdutoDAO().popularTabela(tblProduto, tfdBusca.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto que deseja excluir!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tblProduto.getValueAt(tblProduto.getSelectedRow(), 0).equals(id)) {
            JOptionPane.showMessageDialog(null, "Não é possível excluir um produto que está sendo editado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        ProdutoDAO produtoDAO = new ProdutoDAO();

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            if (produtoDAO.excluir(id)) {
                id = 0;
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                new ProdutoDAO().popularTabela(tblProduto, tfdBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o produto que deseja editar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        CategoriaProdutoDAO categoriaProdutoDAO = new CategoriaProdutoDAO();
        FornecedorDAO forncedorDAO = new FornecedorDAO();

        Produto p = produtoDAO.consultarId(id);

        if (p != null) {
            tfdNome.setText(p.getNome());
            jtfFornecedorId.setText(p.getFornecedor().toString());
            jtfFornecedor.setText(forncedorDAO.getFornecedor(Integer.parseInt(p.getFornecedor().toString())));
            jtfCategoriaProdutoId.setText(p.getCategoria().toString());
            tfdCategoriaProduto.setText(categoriaProdutoDAO.getCategoriaProduto(Integer.parseInt(p.getCategoria().toString())));
            jffValorUnitario.setText(p.getValorUnitario().toString());
            tfdDescricao.setText(p.getDescricao());
            tfdId.setText(String.valueOf(p.getId()));

            jTabbedPane1.setSelectedIndex(0);
        } else {
            System.out.println("erro na consulta");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tfdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdActionPerformed

    private void jbPesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarCategoriaActionPerformed
        DlgPesquisarCategoriaProduto dlgPesquisarCategoriaProduto = new DlgPesquisarCategoriaProduto(null, true, this);
        dlgPesquisarCategoriaProduto.setVisible(true);
    }//GEN-LAST:event_jbPesquisarCategoriaActionPerformed

    private void jbPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarFornecedorActionPerformed
        DlgPesquisarFornecedor dlgPesquisarFornecedor = new DlgPesquisarFornecedor(null, true, this);
        dlgPesquisarFornecedor.setVisible(true);
    }//GEN-LAST:event_jbPesquisarFornecedorActionPerformed

    public void definirCategoriaProduto(String id, String nome) {
        jtfCategoriaProdutoId.setText(id);
        tfdCategoriaProduto.setText(nome);
    }

    public void definirFornecedor(String id, String nome) {
        jtfFornecedorId.setText(id);
        jtfFornecedor.setText(nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbPesquisarCategoria;
    private javax.swing.JButton jbPesquisarFornecedor;
    private javax.swing.JFormattedTextField jffValorUnitario;
    private javax.swing.JTextField jtfCategoriaProdutoId;
    private javax.swing.JTextField jtfFornecedor;
    private javax.swing.JTextField jtfFornecedorId;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField tfdBusca;
    private javax.swing.JTextField tfdCategoriaProduto;
    private javax.swing.JTextField tfdDescricao;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdNome;
    // End of variables declaration//GEN-END:variables
}
