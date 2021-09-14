package panificadora.view;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import panificadora.model.SalvaDadosFornecedor;

public class CadastroFornecedor extends javax.swing.JFrame {

    public CadastroFornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codFo = new javax.swing.JTextField();
        efo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        refo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ncfo = new javax.swing.JTextField();
        resenfo = new javax.swing.JPasswordField();
        senfo = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        atualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 500, 53);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 280, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Código:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 70, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("E-mail:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 180, 80, 30);
        getContentPane().add(codFo);
        codFo.setBounds(290, 70, 80, 30);
        getContentPane().add(efo);
        efo.setBounds(290, 180, 270, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Repetir Senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 320, 160, 30);
        getContentPane().add(refo);
        refo.setBounds(290, 220, 270, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Repetir E-mail:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 220, 180, 30);

        Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(130, 440, 150, 40);

        limpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        getContentPane().add(limpar);
        limpar.setBounds(340, 440, 140, 40);

        pesquisar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(540, 370, 150, 40);

        alterar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(130, 370, 150, 40);

        excluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(540, 440, 150, 40);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Nome de Usuário:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 130, 210, 30);
        getContentPane().add(ncfo);
        ncfo.setBounds(290, 130, 270, 30);
        getContentPane().add(resenfo);
        resenfo.setBounds(290, 320, 270, 30);
        getContentPane().add(senfo);
        senfo.setBounds(290, 280, 270, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraLaranja.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 130, 250, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraLaranja.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 180, 230, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraLaranja.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 220, 250, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraLaranja.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 280, 250, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraLaranja.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(90, 320, 240, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraLaranja.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(120, 70, 210, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/arrow_undo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 90, 40);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoAmarelo.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 710, 60);

        atualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(340, 370, 140, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoCadastroFornecedor.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 710, 520);

        setSize(new java.awt.Dimension(722, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        
        //Chamar a classe "SalvaDadosFornecedor".
        SalvaDadosFornecedor forn = new SalvaDadosFornecedor();
        
        String email = efo.getText();
        String senha = String.valueOf(senfo.getPassword());

        //Pegatr as informações do campos de textos    
        forn.setCodigo(codFo.getText());
        forn.Criarpastas();
        forn.setNomeUsuario(ncfo.getText());
        forn.setEmail(efo.getText());
        forn.setReEmail(refo.getText());
        forn.setSenha(String.valueOf(senfo.getPassword()));
        forn.setReSenha(String.valueOf(resenfo.getPassword()));
        
        if(codFo.getText().equals("") || ncfo.getText().equals("") || efo.getText().equals("") || refo.getText().equals("") || senfo.getText().equals("") || resenfo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Alguns campos não foram preenchidos","Aviso",JOptionPane.ERROR_MESSAGE);
        
        }else{
            //Salvar as informações do usuário
            JOptionPane.showMessageDialog(null, forn.salvaDados());
        }
        //Travar os campos de textos
        codFo.setEnabled(false);
        ncfo.setEnabled(false);
        efo.setEnabled(false);
        refo.setEnabled(false);
        senfo.setEnabled(false);
        resenfo.setEnabled(false);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        
         //Limpar os campos de textos mundando-os para vazio
        codFo.setText("");
        ncfo.setText("");
        efo.setText("");
        refo.setText("");
        senfo.setText("");
        resenfo.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        
        //Quando o botão for pressionado
        if(evt.getSource() == pesquisar){
            try{
                
                 //Inserir o código para pesquisar a conta.
                String codigo = JOptionPane.showInputDialog("Digite o Código:");
                
                 //Ler o arquivo.
                BufferedReader leitura = new BufferedReader(new FileReader("../Panificadora/Fornecedor/Fornecedor"+codigo+"/Fornecedor"+codigo+".txt"));
                
                 //Ler cada linha do arquivo, começando da primeira linha até a última.
                ncfo.setText(leitura.readLine());
                senfo.setText(leitura.readLine());
                resenfo.setText(leitura.readLine());
                efo.setText(leitura.readLine());
                refo.setText(leitura.readLine());
                codFo.setText(leitura.readLine());
                
                 //Fechar arquivo
                leitura.close();

            }
             //Caso o código for incorreto ou não existir
            catch(Exception erro){
                JOptionPane.showMessageDialog(null,"Conta Inexistente","Aviso",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        
         //Liberar Campos de textos
        codFo.setEnabled(true);
        ncfo.setEnabled(true);
        efo.setEnabled(true);
        refo.setEnabled(true);
        senfo.setEnabled(true);
        resenfo.setEnabled(true);
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        
         //Chamar a classe SalvaDados no qual está presente o método Excluir
        SalvaDadosFornecedor forn = new SalvaDadosFornecedor();
        
         //Pesquisar o arquivo código.
        String  codigo = JOptionPane.showInputDialog("Digite o Código: ");
        
         //Chamar método para excluir arquivo.
        JOptionPane.showMessageDialog(null, forn.Excluir(codigo));
    }//GEN-LAST:event_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        //Chamar a classe "SalvaDadosFornecedor".
        SalvaDadosFornecedor forn = new SalvaDadosFornecedor();
        
        String email = efo.getText();
        String senha = String.valueOf(senfo.getPassword());

        //Pegatr as informações do campos de textos    
        forn.setCodigo(codFo.getText());
        forn.setNomeUsuario(ncfo.getText());
        forn.setEmail(efo.getText());
        forn.setReEmail(refo.getText());
        forn.setSenha(String.valueOf(senfo.getPassword()));
        forn.setReSenha(String.valueOf(resenfo.getPassword()));
        
        if(codFo.getText().equals("") || ncfo.getText().equals("") || efo.getText().equals("") || refo.getText().equals("") || senfo.getPassword().equals("") || resenfo.getPassword().equals("")){
            JOptionPane.showMessageDialog(null,"Alguns campos não foram preenchidos","Aviso",JOptionPane.ERROR_MESSAGE);
        
        }else{
            //Salvar as informações do usuário
            JOptionPane.showMessageDialog(null, forn.Atualizar());
        }
        
        //Salvar as informações do usuário
        
        
        //Travar os campos de textos
        codFo.setEnabled(false);
        ncfo.setEnabled(false);
        efo.setEnabled(false);
        refo.setEnabled(false);
        senfo.setEnabled(false);
        resenfo.setEnabled(false);
    }//GEN-LAST:event_atualizarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField codFo;
    private javax.swing.JTextField efo;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField ncfo;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTextField refo;
    private javax.swing.JPasswordField resenfo;
    private javax.swing.JPasswordField senfo;
    // End of variables declaration//GEN-END:variables
}
