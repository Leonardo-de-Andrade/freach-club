package tela;

import java.util.Date;
import javax.swing.JOptionPane;
import dao.ClienteDAO;
import dao.PedidoDAO;
import modelo.Pedido;
import modelo.PedidoProduto;
import modelo.Sessao;
import complemento.Formatacao;

/**
 *
 * @author Leonardo
 */
public class IfrPedido extends javax.swing.JInternalFrame {

    int idProduto = 0;
    int idPedido = 0;
    Double total = 0.0;
    Boolean pedidoFeito = false;

    public IfrPedido() {
        initComponents();
        chkStatus.setSelected(true);
        jtfProdutoID.setVisible(false);
        jtfClienteID.setVisible(false);
        jtfCliente.setEditable(false);
        jtfProduto.setEditable(false);
        Formatacao.formatarData(tffDataInicial);
        Formatacao.formatarData(tffDataFinal);
        new PedidoDAO().GerarCabecalho(tblProduto);
        new PedidoDAO().popularTabelaPedido(tblPedido, "");
        new PedidoDAO().popularTabelaPedidoPesquisa(tblPedidoPesquisa, "", "", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jlId = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        jlCliente = new javax.swing.JLabel();
        jlProduto = new javax.swing.JLabel();
        btnAdicionarProduto = new javax.swing.JButton();
        btnPequisarCliente = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtfCliente = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jlQuantidade = new javax.swing.JLabel();
        jsQuantidade = new javax.swing.JSpinner();
        jlStatus = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tfdValorUnitario = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfdValorTotal = new javax.swing.JTextField();
        chkStatus = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jtfProdutoID = new javax.swing.JTextField();
        jtfClienteID = new javax.swing.JTextField();
        jtfProduto = new javax.swing.JTextField();
        btnPequisarProduto = new javax.swing.JButton();
        jcbFormaPagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnPesquisaConsulta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jtfBusca = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnFiltroPesquisa = new javax.swing.JButton();
        chkStatusPesquisa = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPedidoPesquisa = new javax.swing.JTable();
        tffDataInicial = new javax.swing.JFormattedTextField();
        jlTotal = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        tffDataFinal = new javax.swing.JFormattedTextField();
        btnFiltroLimpar = new javax.swing.JButton();
        jcbFormaPagamentoPesquisa = new javax.swing.JComboBox<>();
        btnFechar = new javax.swing.JButton();

        setTitle("Cadastro de Pedido");

        jPanel1.setToolTipText("");

        jlId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlId.setText("Id");

        tfdId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdId.setEnabled(false);
        tfdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdActionPerformed(evt);
            }
        });

        jlCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCliente.setText("Cliente");

        jlProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlProduto.setText("Produto");

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnPequisarCliente.setText("Pesquisar");
        btnPequisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPequisarClienteActionPerformed(evt);
            }
        });

        btnExcluirProduto.setText("Excluir Produto");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Forma de Pagamento");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Valor Total");

        jtfCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jlQuantidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlQuantidade.setText("Quantidade");

        jlStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlStatus.setText("Status");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Valor Unitário");

        tfdValorUnitario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdValorUnitario.setEnabled(false);
        tfdValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdValorUnitarioActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/star.png"))); // NOI18N

        tfdValorTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdValorTotal.setEnabled(false);
        tfdValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdValorTotalActionPerformed(evt);
            }
        });

        chkStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chkStatus.setText("Ativo");

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

        jtfProdutoID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jtfClienteID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtfClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteIDActionPerformed(evt);
            }
        });

        jtfProduto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnPequisarProduto.setText("Pesquisar");
        btnPequisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPequisarProdutoActionPerformed(evt);
            }
        });

        jcbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Crédito", "Débito", "Dinheiro" }));
        jcbFormaPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFormaPagamentoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jlProduto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jlId))
                            .addComponent(jlCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPequisarCliente))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPequisarProduto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jtfClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfProdutoID)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel20)
                                .addGap(25, 25, 25)
                                .addComponent(tfdValorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProdutoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCliente)
                                    .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPequisarCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlProduto)
                                    .addComponent(btnPequisarProduto)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20)
                                        .addComponent(tfdValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

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

        btnPesquisaConsulta.setText("Pesquisar");
        btnPesquisaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaConsultaActionPerformed(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPedido);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Busca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisaConsulta)
                        .addContainerGap(407, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaConsulta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Data início");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Data Final");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Status");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Forma de Pagamento");

        btnFiltroPesquisa.setText("Pesquisar");
        btnFiltroPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroPesquisaActionPerformed(evt);
            }
        });

        chkStatusPesquisa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chkStatusPesquisa.setText("Ativo");
        chkStatusPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkStatusPesquisaActionPerformed(evt);
            }
        });

        tblPedidoPesquisa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblPedidoPesquisa);

        tffDataInicial.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jlTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTotal.setText("Total");

        jtfTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        tffDataFinal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnFiltroLimpar.setText("Limpar");
        btnFiltroLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroLimparActionPerformed(evt);
            }
        });

        jcbFormaPagamentoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Crédito", "Débito", "Dinheiro" }));
        jcbFormaPagamentoPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFormaPagamentoPesquisaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(tffDataFinal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tffDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jcbFormaPagamentoPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jlTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFiltroPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkStatusPesquisa)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(btnFiltroLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jlTotal)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltroLimpar)
                    .addComponent(btnFiltroPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel26)
                    .addComponent(tffDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(chkStatusPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbFormaPagamentoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtro de Pesquisa", jPanel3);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        if (new PedidoDAO().validaEdicaoPedido(new PedidoDAO().getIdPedido()).equals("")) {
            JOptionPane.showMessageDialog(null, "Finalize o pedido primeiro para poder fechar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tfdValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdValorTotalActionPerformed

    private void tfdValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdValorUnitarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (tfdValorTotal.getText().equals("") || tfdValorTotal.getText().equals("0.0")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira pelo menos um produto", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jtfCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jcbFormaPagamento.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma forma de pagamento", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!tfdId.getText().equals("")) {
            Pedido p = new Pedido();
            p.setCliente_id(Integer.parseInt(jtfClienteID.getText()));
            p.setFormaPagamento(String.valueOf(jcbFormaPagamento.getSelectedItem()));
            p.setUsuario_id(Sessao.getInstance().getUsuario().getId());
            p.setStatus(chkStatus.isSelected() ? "Ativo" : "Desativado");
            p.setId(Integer.parseInt(tfdId.getText()));

            if (new PedidoDAO().atualizar(p)) {
                JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Problemas para alterar o pedido!");
            }
        } else {
            new PedidoDAO().setFormaPagamento(String.valueOf(jcbFormaPagamento.getSelectedItem()), new PedidoDAO().getIdPedido());
        }

        jtfCliente.setText("");
        jcbFormaPagamento.setSelectedIndex(0);
        tfdValorTotal.setText("");
        tfdId.setText("");

        jtfCliente.setEnabled(true);
        chkStatus.setEnabled(true);
        chkStatus.setSelected(true);

        total = 0.0;
        idPedido = 0;
        idProduto = 0;
        pedidoFeito = false;
        new PedidoDAO().GerarCabecalho(tblProduto);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        if (tblProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto que deseja excluir!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

        idProduto = Integer.parseInt(idString);

        PedidoDAO pedidoDAO = new PedidoDAO();

        if (tfdId.getText().equals("")) {
            idPedido = pedidoDAO.getIdPedido();
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
                if (pedidoDAO.excluirProduto(idPedido, idProduto)) {
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

                    total -= (Double.parseDouble(String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2))) * Integer.parseInt(String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3))));
                    total = arredondaTotal(total);
                    pedidoDAO.setTotalPedido(total, idPedido);
                    tfdValorTotal.setText(total.toString());
                    new PedidoDAO().popularTabelaProduto(tblProduto, idPedido);
                    new PedidoDAO().popularTabelaPedido(tblPedido, "");
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!");
                }
            }
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
                if (pedidoDAO.excluirProduto(Integer.parseInt(tfdId.getText()), idProduto)) {
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

                    total = Double.parseDouble(tfdValorTotal.getText()) - (Double.parseDouble(String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2))) * Integer.parseInt(String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3))));
                    total = arredondaTotal(total);
                    pedidoDAO.setTotalPedido(total, Integer.parseInt(tfdId.getText()));
                    tfdValorTotal.setText(total.toString());
                    new PedidoDAO().popularTabelaProduto(tblProduto, Integer.parseInt(tfdId.getText()));
                    new PedidoDAO().popularTabelaPedido(tblPedido, "");
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!");
                }
            }
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnPequisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPequisarClienteActionPerformed
        DlgPesquisarCliente dlgPesquisarCliente = new DlgPesquisarCliente(null, true, this);
        dlgPesquisarCliente.setVisible(true);
    }//GEN-LAST:event_btnPequisarClienteActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed

        if (jtfCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jtfProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira pelo menos um produto", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (Integer.parseInt(jsQuantidade.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma quantidade válida do produto", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Pedido p = new Pedido();
        PedidoProduto pp = new PedidoProduto();
        PedidoDAO pedidoDAO = new PedidoDAO();

        if (tfdId.getText().equals("") && pedidoFeito == false) {
            p.setCliente_id(Integer.parseInt(jtfClienteID.getText()));
            p.setUsuario_id(Sessao.getInstance().getUsuario().getId());
            p.setFormaPagamento(String.valueOf(jcbFormaPagamento.getSelectedItem().equals("Selecione") ? "" : String.valueOf(jcbFormaPagamento.getSelectedItem())));
            p.setStatus(chkStatus.isSelected() ? "Ativo" : "Desativado");
            p.setData(new Date());
            p.setTotal(total);
            p.setId(idPedido);
            
            pedidoFeito = true;
            pedidoDAO.salvar(p);
        }

        if (tfdId.getText().equals("")) {
            idPedido = pedidoDAO.getIdPedido();
            total += (Integer.parseInt(jsQuantidade.getValue().toString()) * Double.parseDouble(tfdValorUnitario.getText()));
            total = arredondaTotal(total);
            pp.setPedido_id(idPedido);
            pedidoDAO.setTotalPedido(total, idPedido);
        } else {
            total = Double.parseDouble(tfdValorTotal.getText()) + (Integer.parseInt(jsQuantidade.getValue().toString()) * Double.parseDouble(tfdValorUnitario.getText()));
            total = arredondaTotal(total);
            pp.setPedido_id(Integer.parseInt(tfdId.getText()));
            pedidoDAO.setTotalPedido(total, Integer.parseInt(tfdId.getText()));
        }

        pp.setProduto_id(Integer.parseInt(jtfProdutoID.getText()));
        pp.setQuantidade(Integer.parseInt(jsQuantidade.getValue().toString()));
        tfdValorTotal.setText(total.toString());

        if (pedidoDAO.salvarProduto(pp)) {
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");

            if (tfdId.getText().equals("")) {
                pedidoDAO.popularTabelaProduto(tblProduto, idPedido);
            } else {
                pedidoDAO.popularTabelaProduto(tblProduto, Integer.parseInt(tfdId.getText()));
            }

            jtfCliente.setEnabled(false);
            chkStatus.setEnabled(false);
            jtfProduto.setText("");
            jtfProdutoID.setText("");
            jsQuantidade.setValue(0);
            tfdValorUnitario.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!");

        }
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void tfdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdActionPerformed

    private void btnPesquisaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaConsultaActionPerformed
        new PedidoDAO().popularTabelaPedido(tblPedido, jtfBusca.getText());
    }//GEN-LAST:event_btnPesquisaConsultaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblPedido.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o pedido que deseja excluir!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tblPedido.getValueAt(tblPedido.getSelectedRow(), 0).equals(idPedido)) {
            JOptionPane.showMessageDialog(null, "Não é possível excluir um pedido que está sendo editado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblPedido.getValueAt(tblPedido.getSelectedRow(), 0));

        idPedido = Integer.parseInt(idString);

        PedidoDAO pedidoDAO = new PedidoDAO();

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            if (pedidoDAO.excluir(idPedido)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                new PedidoDAO().popularTabelaPedido(tblPedido, jtfBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFiltroPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroPesquisaActionPerformed
        if (!tffDataInicial.getText().equals("  /  /    ") && !tffDataFinal.getText().equals("  /  /    ")) {
            new PedidoDAO().popularTabelaPedidoPesquisaAmpla(tblPedidoPesquisa, tffDataInicial.getText(), tffDataFinal.getText(), jcbFormaPagamentoPesquisa.getSelectedItem().equals("Selecione") ? "" : String.valueOf(jcbFormaPagamentoPesquisa.getSelectedItem()), chkStatusPesquisa.isSelected() ? "Ativo" : "Desativado", jtfTotal.getText());
        } else {
            new PedidoDAO().popularTabelaPedidoPesquisa(tblPedidoPesquisa, jcbFormaPagamentoPesquisa.getSelectedItem().equals("Selecione") ? "" : String.valueOf(jcbFormaPagamentoPesquisa.getSelectedItem()), chkStatusPesquisa.isSelected() ? "Ativo" : "Desativado", jtfTotal.getText());
        }
    }//GEN-LAST:event_btnFiltroPesquisaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblPedido.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o pedido que deseja editar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (new PedidoDAO().validaEdicaoPedido(new PedidoDAO().getIdPedido()).equals("")) {
            JOptionPane.showMessageDialog(null, "Finalize o pedido primeiro para poder editar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idString = String.valueOf(tblPedido.getValueAt(tblPedido.getSelectedRow(), 0));

        idPedido = Integer.parseInt(idString);

        PedidoDAO pedidoDAO = new PedidoDAO();
        ClienteDAO clientePedido = new ClienteDAO();

        Pedido p = pedidoDAO.consultarId(idPedido);

        if (p != null) {
            total = p.getTotal();
            jtfClienteID.setText(p.getCliente_id().toString());
            jtfCliente.setText(clientePedido.getClientePedido(Integer.parseInt(p.getCliente_id().toString())));
            jcbFormaPagamento.setSelectedItem(p.getFormaPagamento());
            tfdValorTotal.setText(p.getTotal().toString());
            if (p.getStatus().equals("Ativo")) {
                chkStatus.setSelected(true);
            } else {
                chkStatus.setSelected(false);
            }
            pedidoDAO.popularTabelaProduto(tblProduto, idPedido);
            tfdId.setText(String.valueOf(p.getId()));

            jTabbedPane1.setSelectedIndex(0);
        } else {
            System.out.println("erro na consulta");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFiltroLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroLimparActionPerformed
        tffDataInicial.setText("");
        tffDataFinal.setText("");
        jtfTotal.setText("");
        jcbFormaPagamentoPesquisa.setSelectedIndex(0);
        chkStatusPesquisa.setSelected(false);
        new PedidoDAO().popularTabelaPedidoPesquisa(tblPedidoPesquisa, "", "", "");
    }//GEN-LAST:event_btnFiltroLimparActionPerformed

    private void chkStatusPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkStatusPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkStatusPesquisaActionPerformed

    private void btnPequisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPequisarProdutoActionPerformed
        DlgPesquisarProduto dlgPesquisarItem = new DlgPesquisarProduto(null, true, this);
        dlgPesquisarItem.setVisible(true);
    }//GEN-LAST:event_btnPequisarProdutoActionPerformed

    private void jtfClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteIDActionPerformed

    private void jcbFormaPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFormaPagamentoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFormaPagamentoItemStateChanged

    private void jcbFormaPagamentoPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFormaPagamentoPesquisaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFormaPagamentoPesquisaItemStateChanged

    public void definirValorProduto(String id, String nome, String valorUnitario) {
        jtfProdutoID.setText(id);
        jtfProduto.setText(nome);
        tfdValorUnitario.setText(valorUnitario);
    }

    public void definirClientePedido(String id, String nome) {
        jtfClienteID.setText(id);
        jtfCliente.setText(nome);
    }

    public Double arredondaTotal(Double total) {
        if (total <= 0) {
            total = 0.0;
        } else {
            total = Math.floor(total * 100) / 100;
        }
        return total;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFiltroLimpar;
    private javax.swing.JButton btnFiltroPesquisa;
    private javax.swing.JButton btnPequisarCliente;
    private javax.swing.JButton btnPequisarProduto;
    private javax.swing.JButton btnPesquisaConsulta;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkStatus;
    private javax.swing.JCheckBox chkStatusPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbFormaPagamento;
    private javax.swing.JComboBox<String> jcbFormaPagamentoPesquisa;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlProduto;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JTextField jtfBusca;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfClienteID;
    private javax.swing.JTextField jtfProduto;
    private javax.swing.JTextField jtfProdutoID;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTable tblPedidoPesquisa;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdValorTotal;
    private javax.swing.JTextField tfdValorUnitario;
    private javax.swing.JFormattedTextField tffDataFinal;
    private javax.swing.JFormattedTextField tffDataInicial;
    // End of variables declaration//GEN-END:variables
}
