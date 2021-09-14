package panificadora.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import panificadora.model.salvarDados;

public class TelaCadastro extends javax.swing.JFrame {
    public TelaCadastro() {
        
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LN = new javax.swing.JLabel();
        LS = new javax.swing.JLabel();
        LU = new javax.swing.JLabel();
        Lc = new javax.swing.JLabel();
        LC = new javax.swing.JLabel();
        Ls = new javax.swing.JLabel();
        Sobre = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        User = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        Cpf = new javax.swing.JFormattedTextField();
        Cadastrar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        uf = new javax.swing.JComboBox<>();
        Lc1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 0, 210, 40);

        LN.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LN.setText("Nome:");
        getContentPane().add(LN);
        LN.setBounds(90, 160, 60, 30);

        LS.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LS.setText("Sobrenome:");
        getContentPane().add(LS);
        LS.setBounds(400, 160, 100, 30);

        LU.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LU.setText(" Usuário:");
        getContentPane().add(LU);
        LU.setBounds(70, 200, 80, 30);

        Lc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Lc.setText("UF:");
        getContentPane().add(Lc);
        Lc.setBounds(460, 260, 40, 30);

        LC.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LC.setText("Código:");
        getContentPane().add(LC);
        LC.setBounds(80, 120, 70, 30);

        Ls.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Ls.setText("Senha:");
        getContentPane().add(Ls);
        Ls.setBounds(440, 210, 60, 30);

        Sobre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(Sobre);
        Sobre.setBounds(500, 160, 170, 30);

        Codigo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(Codigo);
        Codigo.setBounds(150, 120, 120, 30);

        Nome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(Nome);
        Nome.setBounds(150, 160, 190, 30);

        User.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(User);
        User.setBounds(150, 200, 190, 30);

        Senha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(Senha);
        Senha.setBounds(500, 210, 170, 30);

        try {
            Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Cpf);
        Cpf.setBounds(150, 250, 120, 30);

        Cadastrar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(220, 370, 110, 40);

        limpar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        getContentPane().add(limpar);
        limpar.setBounds(80, 370, 110, 40);

        pesquisar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(360, 390, 110, 40);

        alterar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(220, 430, 110, 40);

        excluir.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(80, 430, 110, 40);

        uf.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "CE", "BA", "PA", "ES", "PE", "PI", "PB", "RJ", "SP" }));
        getContentPane().add(uf);
        uf.setBounds(500, 260, 75, 30);

        Lc1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Lc1.setText("CPF:");
        getContentPane().add(Lc1);
        Lc1.setBounds(100, 250, 50, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/arrow_undo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 73, 23);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoAmarelo.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-30, 0, 790, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoCadastroFornecedor.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-40, -60, 840, 630);

        setSize(new java.awt.Dimension(722, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        salvarDados sd = new salvarDados();
        File f = new File("../Panificadora/Clientes/Cliente"+Codigo+"/Cliente"+Codigo+".txt");
        
        try{
        
            int op = Integer.parseInt(JOptionPane.showInputDialog("Deseja\n [1] - Criar uma nova conta\n [2] - Atualizar Conta"));
        
        switch(op){
            case 1:
                
                
               
                sd.setCodigo(Codigo.getText());
                sd.Criarpastas();
                sd.setUsuario(User.getText());
                sd.setSenha(String.valueOf(Senha.getPassword()));
                sd.setNome(Nome.getText());
                sd.setCpf(Cpf.getText());
                sd.setSobrenome(Sobre.getText());
                sd.setUf((String)uf.getSelectedItem());
                
                if(Codigo.getText().equals("") || User.getText().equals("") || Senha.getPassword().equals("") || Cpf.getText().equals("") || Sobre.getText().equals("") || (uf.getSelectedIndex() == 0)){
                    JOptionPane.showMessageDialog(null,"Alguns campos não foram preenchidos","Aviso",JOptionPane.ERROR_MESSAGE);
        
                }else{
                 //Salvar as informações do usuário
                 JOptionPane.showMessageDialog(null, sd.SalvarNovosDados()); 
                }
                
               
            break;
            
            case 2:
                sd.setCodigo(Codigo.getText());
                sd.Criarpastas();
                sd.setUsuario(User.getText());
                sd.setSenha(String.valueOf(Senha.getPassword()));
                sd.setNome(Nome.getText());
                sd.setCpf(Cpf.getText());
                sd.setSobrenome(Sobre.getText());
                sd.setUf((String)uf.getSelectedItem());
                
                if(Codigo.getText().equals("") || User.getText().equals("") || Senha.getPassword().equals("") || Cpf.getText().equals("") || Sobre.getText().equals("") || (uf.getSelectedIndex() == 0)){
                    JOptionPane.showMessageDialog(null,"Alguns campos não foram preenchidos","Aviso",JOptionPane.ERROR_MESSAGE);
        
                }else{
                 //Salvar as informações do usuário
                  JOptionPane.showMessageDialog(null, sd.SalvaDados());  
                }
            break;
             
            default:
                JOptionPane.showMessageDialog(null,"Item inválido ou não atribuído");
            break;    
                
        } 
        
        }catch(java.lang.NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Item inválido ou não atribuído");
        }

        
        
        Codigo.setEnabled(false);
        Nome.setEnabled(false);
        Cpf.setEnabled(false);
        User.setEnabled(false);
        Senha.setEnabled(false);
        uf.setEnabled(false);
        Sobre.setEnabled(false);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
    Codigo.setText("");
    Nome.setText("");
    User.setText("");
    Cpf.setText("");
    Sobre.setText("");
    Senha.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
if(evt.getSource() == pesquisar){
           try{
               String codigo = JOptionPane.showInputDialog("Digite o Código:");
               
               BufferedReader ler = new BufferedReader(new FileReader("../Panificadora/Clientes/Cliente"+codigo+"/Cliente"+codigo+".txt"));
               
        
        User.setText(ler.readLine());
        Senha.setText(ler.readLine());
        Nome.setText(ler.readLine());
        Cpf.setText(ler.readLine());
        Sobre.setText(ler.readLine());
        uf.setSelectedItem(ler.readLine());
        Codigo.setText(ler.readLine()); 
        
        
        ler.close();
       
           }catch(Exception erro){
               JOptionPane.showMessageDialog(null, "Erro: "+erro.getMessage());
           }
    }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        Nome.setEnabled(true);
        Sobre.setEnabled(true);
        Cpf.setEnabled(true);
        User.setEnabled(true);
        Senha.setEnabled(true);
        uf.setEnabled(true);
        Codigo.setEnabled(true);
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
    salvarDados sd = new salvarDados();
    String  codigo = JOptionPane.showInputDialog("Digite o Código: ");
    JOptionPane.showMessageDialog(null, sd.Excluir(codigo));
    
    }//GEN-LAST:event_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro tc = new TelaCadastro();
                tc.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JFormattedTextField Cpf;
    private javax.swing.JLabel LC;
    private javax.swing.JLabel LN;
    private javax.swing.JLabel LS;
    private javax.swing.JLabel LU;
    private javax.swing.JLabel Lc;
    private javax.swing.JLabel Lc1;
    private javax.swing.JLabel Ls;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField Sobre;
    private javax.swing.JTextField User;
    private javax.swing.JButton alterar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpar;
    private javax.swing.JButton pesquisar;
    private javax.swing.JComboBox<String> uf;
    // End of variables declaration//GEN-END:variables
}
