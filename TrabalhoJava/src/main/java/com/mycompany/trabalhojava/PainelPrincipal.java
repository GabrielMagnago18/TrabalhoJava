package com.mycompany.trabalhojava;

public class PainelPrincipal extends javax.swing.JFrame {

    private CadastroAgendamento cadastroAgendamento;
    private CadastroProfessor cadastroProfessor;
    private CadastroSalaDefesa cadastroSalaDefesa;
    private CadastroAluno cadastroAluno;

    public PainelPrincipal() {
        initComponents();
        cadastroAgendamento = new CadastroAgendamento();
        cadastroProfessor = new CadastroProfessor();
        cadastroSalaDefesa = new CadastroSalaDefesa();
        cadastroAluno = new CadastroAluno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgendamento = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();
        btnSalaDefesa = new javax.swing.JButton();
        btnSeuOutroPainel = new javax.swing.JButton(); // Add this line

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Escolha uma opção:");

        btnAgendamento.setText("Cadastro Agendamento");
        btnAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentoActionPerformed(evt);
            }
        });

        btnProfessor.setText("Cadastro Professor");
        btnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorActionPerformed(evt);
            }
        });

        btnSalaDefesa.setText("Cadastro Sala de Defesa");
        btnSalaDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaDefesaActionPerformed(evt);
            }
        });

        btnSeuOutroPainel.setText("Seu Outro Painel"); // Add this line
        btnSeuOutroPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeuOutroPainelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalaDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(btnSeuOutroPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)) // Add this line
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalaDefesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeuOutroPainel) // Add this line
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>                        

    private void btnAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        this.setVisible(false);
        cadastroAgendamento.setVisible(true);
    }                                               

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
        cadastroProfessor.setVisible(true);
    }                                             

    private void btnSalaDefesaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        cadastroSalaDefesa.setVisible(true);
    }                                              
    
    private void btnSeuOutroPainelActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        cadastroAluno.setVisible(true);
    }                                              

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAgendamento;
    private javax.swing.JButton btnProfessor;
    private javax.swing.JButton btnSalaDefesa;
    private javax.swing.JButton btnSeuOutroPainel; // Add this line
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
