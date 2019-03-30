/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.view;

import br.com.henrique.control.EditarExcluirCliente;
import br.com.henrique.control.TesteClienteControl;
import br.com.henrique.control.TestePanelControl;
import br.com.henrique.control.TesteServicoControl;
import br.com.henrique.uteis.ThereadRelogio;

/**
 *
 * @author ACER
 */
public class TESTE extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstacionamento
     */
    private TesteClienteControl clienteControl;
    private TesteServicoControl servicoControl;
    private EditarExcluirCliente editarExcluirCliente;

    public TESTE() {
        initComponents();
        this.setResizable(false);
        ThereadRelogio.start();
        clienteControl = new TesteClienteControl();
        servicoControl = new TesteServicoControl();
        editarExcluirCliente = new EditarExcluirCliente();
        TestePanelControl.carregarCarrosEstacionados();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jToolBar1 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bSalvarEntradaSaida = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabel14 = new javax.swing.JLabel();
        bRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        tfMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbTipo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servidor", "Público" }));

        try {
            tfPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("Cor");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setText("Cadastrar Cliente");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Marca");

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Modelo");

        labelCarros.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelCarros.setText("Cadastrar Carro");

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 16)); // NOI18N
        jLabel3.setText("  ");

        tfCor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Data");

        try {
            tfPlacaServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfPlacaServico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("Placa");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setText("Hora");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setText("Entrada e Saída");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel11.setText("Entrada");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setText("Valor");

        try {
            tfDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataSaida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDataSaidaFocusLost(evt);
            }
        });

        try {
            tfDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDataEntradaFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setText("Placa");

        bSalvarEntradaSaida.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        bSalvarEntradaSaida.setText("Salvar");
        bSalvarEntradaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarEntradaSaidaActionPerformed(evt);
            }
        });

        panels.setMinimumSize(new java.awt.Dimension(600, 400));
        panels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelsMouseClicked(evt);
            }
        });

        tableCarroEstacionados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableCarroEstacionados);

        jButton1.setText("Fechar Conta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        panels.addTab("Carros Estacionados", jPanel1);

        panelEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEditarMouseClicked(evt);
            }
        });

        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableClientes1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableClientes1);

        panelCliente.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 390));

        panelEditar.addTab("Cliente", panelCliente);

        panelCarro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCarros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tableCarros);

        panelCarro.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 390));

        panelEditar.addTab("Carro", panelCarro);

        panelServicos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableServicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tableServicos);

        panelServicos.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 390));

        labelValorTotal.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        labelValorTotal.setText("jLabel15");
        panelServicos.add(labelValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 160, 40));

        panelEditar.addTab("Serviços", panelServicos);

        panels.addTab("Editar Arquivos", panelEditar);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel14.setText("Saída");

        tfHoraEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfHoraEntradaFocusLost(evt);
            }
        });

        tfHoraSaida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfHoraSaidaFocusLost(evt);
            }
        });

        bRefresh.setText("R");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bRefresh, org.jdesktop.beansbinding.ELProperty.create("Atualizar Valores"), bRefresh, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenu4.setText("Adicionar");

        jMenuItem8.setText("Serviço");
        jMenu4.add(jMenuItem8);
        jMenuItem8.getAccessibleContext().setAccessibleDescription("");

        jMenuItem7.setText("Cliente");
        jMenu4.add(jMenuItem7);

        jMenuItem5.setText("Carro");
        jMenu4.add(jMenuItem5);

        jMenu1.add(jMenu4);

        jMenuItem11.setText("Home");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Arquivos");

        jMenuItem4.setText("Historico");
        jMenu2.add(jMenuItem4);

        jMenu3.setText("Editar");

        jMenuItem3.setText("Carros");
        jMenu3.add(jMenuItem3);

        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfPlacaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(tfDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelCarros))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bRefresh))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(15, 15, 15)
                                    .addComponent(tfHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bSalvarEntradaSaida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(panels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(260, 260, 260)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(390, 390, 390)
                                        .addComponent(tfDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(370, 370, 370)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(420, 420, 420)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(tfPlacaServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(340, 340, 340)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(labelCarros)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSalvarEntradaSaida)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed
    /**
     * Salva carro e cliente
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clienteControl.salvarAction();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bSalvarEntradaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarEntradaSaidaActionPerformed
        servicoControl.salvarServicoAction(); // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarEntradaSaidaActionPerformed

    private void panelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsMouseClicked
        TestePanelControl.carregarCliente();      // TODO add your handling code here:
    }//GEN-LAST:event_panelsMouseClicked

    private void panelEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEditarMouseClicked
        TestePanelControl.carregarCarros();        // TODO add your handling code here:
        TestePanelControl.carregarServicos();// TODO add your handling code here:
    }//GEN-LAST:event_panelEditarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        servicoControl.fecharContaAction();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfHoraSaidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHoraSaidaFocusLost
        servicoControl.atualizaTFValor();
    }//GEN-LAST:event_tfHoraSaidaFocusLost

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        servicoControl.atualizaTFValor();        // TODO add your handling code here:
    }//GEN-LAST:event_bRefreshActionPerformed

    private void tfHoraEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHoraEntradaFocusLost
        servicoControl.atualizaTFValor();        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraEntradaFocusLost

    private void tfDataEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDataEntradaFocusLost
        servicoControl.atualizaTFValor();        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataEntradaFocusLost

    private void tfDataSaidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDataSaidaFocusLost
        servicoControl.atualizaTFValor();        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataSaidaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TESTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TESTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TESTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TESTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TESTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bSalvarEntradaSaida;
    public static final javax.swing.JComboBox<String> cbTipo = new javax.swing.JComboBox<>();
    private javax.swing.JButton jButton1;
    public static final javax.swing.JButton jButton3 = new javax.swing.JButton();
    public static final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static final javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
    private javax.swing.JToolBar jToolBar1;
    public static final javax.swing.JLabel labelCarros = new javax.swing.JLabel();
    public static final javax.swing.JLabel labelValorTotal = new javax.swing.JLabel();
    public static final javax.swing.JPanel panelCarro = new javax.swing.JPanel();
    public static final javax.swing.JPanel panelCliente = new javax.swing.JPanel();
    public static final javax.swing.JTabbedPane panelEditar = new javax.swing.JTabbedPane();
    private static final javax.swing.JPanel panelServicos = new javax.swing.JPanel();
    public static final javax.swing.JTabbedPane panels = new javax.swing.JTabbedPane();
    public static final javax.swing.JTable tableCarroEstacionados = new javax.swing.JTable();
    public static final javax.swing.JTable tableCarros = new javax.swing.JTable();
    public static final javax.swing.JTable tableClientes1 = new javax.swing.JTable();
    public static final javax.swing.JTable tableServicos = new javax.swing.JTable();
    public static final javax.swing.JTextField tfCor = new javax.swing.JTextField();
    public static final javax.swing.JFormattedTextField tfDataEntrada = new javax.swing.JFormattedTextField();
    public static final javax.swing.JFormattedTextField tfDataSaida = new javax.swing.JFormattedTextField();
    public static final javax.swing.JTextField tfHoraEntrada = new javax.swing.JTextField();
    public static final javax.swing.JTextField tfHoraSaida = new javax.swing.JTextField();
    public static final javax.swing.JTextField tfMarca = new javax.swing.JTextField();
    public static final javax.swing.JTextField tfModelo = new javax.swing.JTextField();
    public static final javax.swing.JTextField tfNome = new javax.swing.JTextField();
    public static final javax.swing.JFormattedTextField tfPlaca = new javax.swing.JFormattedTextField();
    public static final javax.swing.JFormattedTextField tfPlacaServico = new javax.swing.JFormattedTextField();
    public static final javax.swing.JTextField tfValor = new javax.swing.JTextField();
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
