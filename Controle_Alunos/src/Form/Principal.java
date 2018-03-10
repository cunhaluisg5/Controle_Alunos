/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Dados.BancoDadosCliente;
import Modelo.Aluno;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Luís Gustavo
 */
public class Principal extends javax.swing.JFrame {
    Aluno aluno;
    BancoDadosCliente banco;
    
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grCurso = new javax.swing.ButtonGroup();
        lbMatricula = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        btReajuste = new javax.swing.JButton();
        lbIngresso = new javax.swing.JLabel();
        tfIngresso = new javax.swing.JTextField();
        lbPeriodo = new javax.swing.JLabel();
        cbPeriodo = new javax.swing.JComboBox<>();
        pnCurso = new javax.swing.JPanel();
        rdAdministracao = new javax.swing.JRadioButton();
        rdInformatica = new javax.swing.JRadioButton();
        rdPedagogia = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Alunos");

        lbMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMatricula.setText("Matrícula");
        lbMatricula.setName("lbMatricula"); // NOI18N

        tfMatricula.setBackground(new java.awt.Color(0, 0, 153));
        tfMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfMatricula.setForeground(new java.awt.Color(255, 255, 0));
        tfMatricula.setName("tfMatricula"); // NOI18N

        btBuscar.setBackground(new java.awt.Color(204, 204, 255));
        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setName("btBuscar"); // NOI18N

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome");
        lbNome.setName("lbNome"); // NOI18N

        tfNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfNome.setName("tfNome"); // NOI18N

        btReajuste.setBackground(new java.awt.Color(204, 204, 255));
        btReajuste.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btReajuste.setText("Aplicar Reajuste");
        btReajuste.setName("btReajuste"); // NOI18N
        btReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReajusteActionPerformed(evt);
            }
        });

        lbIngresso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbIngresso.setText("Data de Ingresso");
        lbIngresso.setName("lbIngresso"); // NOI18N

        tfIngresso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfIngresso.setName("tfIngresso"); // NOI18N

        lbPeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPeriodo.setText("Período");
        lbPeriodo.setName("lbPeriodo"); // NOI18N

        cbPeriodo.setBackground(new java.awt.Color(204, 204, 255));
        cbPeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°" }));
        cbPeriodo.setName("cbPeriodo"); // NOI18N

        pnCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pnCurso.setName("pnCurso"); // NOI18N

        grCurso.add(rdAdministracao);
        rdAdministracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdAdministracao.setText("Administração");
        rdAdministracao.setName("rdAdministracao"); // NOI18N

        grCurso.add(rdInformatica);
        rdInformatica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdInformatica.setText("Informática");
        rdInformatica.setName("rdInformatica"); // NOI18N

        grCurso.add(rdPedagogia);
        rdPedagogia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdPedagogia.setText("Pedagogia");
        rdPedagogia.setName("rdPedagogia"); // NOI18N

        javax.swing.GroupLayout pnCursoLayout = new javax.swing.GroupLayout(pnCurso);
        pnCurso.setLayout(pnCursoLayout);
        pnCursoLayout.setHorizontalGroup(
            pnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdAdministracao)
                .addGap(26, 26, 26)
                .addComponent(rdInformatica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdPedagogia)
                .addContainerGap())
        );
        pnCursoLayout.setVerticalGroup(
            pnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCursoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdAdministracao)
                    .addComponent(rdInformatica)
                    .addComponent(rdPedagogia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para Autenticação", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setName("pnAutenticacao"); // NOI18N

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 153));
        lbEmail.setText("Email");
        lbEmail.setName("lbEmail"); // NOI18N

        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfEmail.setName("tfEmail"); // NOI18N

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(0, 0, 153));
        lbSenha.setText("Senha");
        lbSenha.setName("lbSenha"); // NOI18N

        tfSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfSenha.setName("tfSenha"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSenha)
                        .addGap(36, 36, 36)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAdicionar.setBackground(new java.awt.Color(204, 204, 255));
        btAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.setName("btAdicionar"); // NOI18N
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(204, 204, 255));
        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setText("Remover");
        btRemover.setName("btRemover"); // NOI18N

        btListar.setBackground(new java.awt.Color(204, 204, 255));
        btListar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btListar.setText("Listar");
        btListar.setName("btListar"); // NOI18N

        btLimpar.setBackground(new java.awt.Color(204, 204, 255));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 0, 0));
        btLimpar.setText("Limpar");
        btLimpar.setName("btLimpar"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbIngresso)
                            .addComponent(tfIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbMatricula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btBuscar))
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPeriodo)
                                .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btReajuste)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMatricula)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReajuste))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIngresso)
                    .addComponent(lbPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btRemover)
                    .addComponent(btListar)
                    .addComponent(btLimpar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        aluno = new Aluno();
        aluno.setNum_matricula(tfMatricula.getText());
        aluno.setNome(tfNome.getText());
        aluno.setData_ingresso(tfIngresso.getText());
        aluno.setPeriodo(cbPeriodo.getSelectedItem().toString());
        JRadioButton radio;
        Enumeration jr = grCurso.getElements();
        while ( jr.hasMoreElements() )
        {
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
              aluno.setCurso(radio.getText());
        }
        aluno.setEmail(tfEmail.getText());
        aluno.setSenha(tfSenha.getText());
        
        banco = new BancoDadosCliente();
        banco.addAluno(aluno);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReajusteActionPerformed
        String resultado;
        resultado = JOptionPane.showInputDialog(null, "Informe o valor!");
        aluno.reajustarMensalidade(Integer.parseInt(resultado));
        JOptionPane.showMessageDialog(null, "A mensalidade é " + aluno.getValor_mensalidade(), "Mensalidade", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btReajusteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btReajuste;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox<String> cbPeriodo;
    private javax.swing.ButtonGroup grCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbIngresso;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeriodo;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPanel pnCurso;
    private javax.swing.JRadioButton rdAdministracao;
    private javax.swing.JRadioButton rdInformatica;
    private javax.swing.JRadioButton rdPedagogia;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIngresso;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
}
