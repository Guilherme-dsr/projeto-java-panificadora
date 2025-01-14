/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panificadora.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Guilherme-Pc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
                                Date da = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / YYYY"); 
        Data.setText(formato.format(da));
        
        Timer t = new Timer(1000,new Home.horas());
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JPanel();
        Hora = new javax.swing.JLabel();
        a1 = new javax.swing.JPanel();
        Data = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);
        getContentPane().setLayout(null);

        a.setBackground(new java.awt.Color(0, 0, 0));
        a.setForeground(new java.awt.Color(204, 0, 0));

        Hora.setForeground(new java.awt.Color(255, 0, 0));
        a.add(Hora);

        getContentPane().add(a);
        a.setBounds(580, 40, 80, 30);

        a1.setBackground(new java.awt.Color(0, 0, 0));

        Data.setForeground(new java.awt.Color(255, 0, 0));
        a1.add(Data);

        getContentPane().add(a1);
        a1.setBounds(470, 40, 100, 30);

        L1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        L1.setText("Panificadora");
        getContentPane().add(L1);
        L1.setBounds(260, 0, 150, 28);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoAmarelo.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-30, 0, 790, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoCadastroFornecedor.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-50, -30, 790, 630);

        jMenu1.setText("Cadastros");

        jMenuItem1.setText("Cadastro de produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cadastro de funcionário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cadastro de fornecedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Cadastro de Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Login");

        jMenuItem5.setText("Logar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Vendas");

        jMenuItem6.setText("Vendas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(666, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     String cod = JOptionPane.showInputDialog("Digite o código de Fornecedor: ");   
     if(cod.equalsIgnoreCase("for")){   
        TelaCadastro3 a = new TelaCadastro3();
        a.setVisible(true);
        dispose();
     }else{
         JOptionPane.showMessageDialog(null,"Código Inválido","Aviso",JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

     String cod = JOptionPane.showInputDialog("Digite o código de Funcionário: ");
     if(cod.equalsIgnoreCase("fun")){
    TelaCadastro2 a = new TelaCadastro2();
    a.setVisible(true);
    dispose();
     }else{
          JOptionPane.showMessageDialog(null,"Código Inválido","Aviso",JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    String cod = JOptionPane.showInputDialog("Digite o código de Fornecedor: ");
    if(cod.equalsIgnoreCase("for")){
    CadastroFornecedor a = new CadastroFornecedor();
    a.setVisible(true);
    dispose();
    }else{
         JOptionPane.showMessageDialog(null,"Código Inválido","Aviso",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    TelaCadastro a = new TelaCadastro();
    a.setVisible(true);
    dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    TelaLogin a = new TelaLogin();
    a.setVisible(true);
    dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    TelaVendas a = new TelaVendas();
    a.setVisible(true);
    dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel L1;
    private javax.swing.JPanel a;
    private javax.swing.JPanel a1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables

    public class horas implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Calendar c = Calendar.getInstance();
        Hora.setText(String.format("%1$tH:%1$tM:%1$tS", c));
    }
    }}
