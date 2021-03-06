/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.forms;

import agenda.dao.ContatoDao;
import agenda.logica.Contato;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michell
 */
public class JTAgendaContatos extends javax.swing.JFrame {

    /**
     * Creates new form JTAgendaContatos
     */
    DefaultTableModel tmContato = new DefaultTableModel(null, new String []{"Id", "Nome", "Endereco", "Telefone","email",  
        "Sexo"});//modelo de tabela criado
    List<Contato> contatos;
    ListSelectionModel lsmContato;
    
    public JTAgendaContatos() {
        initComponents();
        desabilitaDados();//metodo de desativar dados
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jTEndereco = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jTTelefone = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTSexo = new javax.swing.JTextField();
        jLSexo = new javax.swing.JLabel();
        jBPesquisa = new javax.swing.JButton();
        jTPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel8.setText("jLabel8");

        jTextField8.setText("jTextField8");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do contato"));

        jLId.setText("Id: ");

        jLNome.setText("Nome: ");

        jLEndereco.setText("Endereco: ");

        jLEmail.setText("Email: ");

        jLTelefone.setText("Telefone:");

        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        jLSexo.setText("Sexo: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEndereco)
                            .addComponent(jLId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTelefone)
                    .addComponent(jLSexo)
                    .addComponent(jLEmail))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTEmail, jTEndereco, jTNome, jTTelefone});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEmail)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefone)
                            .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSexo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLId)
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNome)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEndereco)
                            .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jBPesquisa.setText("Pesquisa");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        jTTabela.setModel(tmContato);
        jTTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmContato = jTTabela.getSelectionModel();
        lsmContato.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if (! e.getValueIsAdjusting()){
                    jTTabelaLinhaSelecionada(jTTabela);
                }
            }
        });
        jScrollPane1.setViewportView(jTTabela);

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNovo)
                .addGap(48, 48, 48)
                .addComponent(jBAlterar)
                .addGap(48, 48, 48)
                .addComponent(jBExcluir)
                .addGap(43, 43, 43)
                .addComponent(jBSalvar)
                .addGap(44, 44, 44)
                .addComponent(jBSair)
                .addGap(84, 84, 84))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAlterar, jBExcluir, jBNovo, jBSair, jBSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBSalvar)
                    .addComponent(jBSair))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisa))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisa))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdActionPerformed

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        try {
            listarContatos();
        } catch (SQLException ex) {
            System.out.println("Error ao listar contatos" + ex);
        }
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaDados();//habilita dados para fazer um novo 
        jTNome.setText("");
        jTEmail.setText("");
        jTEndereco.setText("");
        jTTelefone.setText("");
        jTSexo.setText("");
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if(verificaDados()){
            cadastro();
            desabilitaDados();//para deixar os dados desabilitados apos salvar
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            excluirContato();
            listarContatos();
        } catch (SQLException ex) {
            System.out.println("Error ao excluir contato" + ex);
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            alteraContato();
            listarContatos();
        } catch (SQLException ex) {
            System.out.println("Error ao alterar contato" + ex);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed
    
    public void excluirContato() throws SQLException{
        int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_NO_OPTION){
            ContatoDao dao = new ContatoDao();
            dao.remove(contatos.get(jTTabela.getSelectedRow()));
        }
    }
    
    public void alteraContato() throws SQLException{
        if(jTTabela.getSelectedRow() != -1){
            if(verificaDados()){
                Contato contato = new Contato();
                ContatoDao dao = new ContatoDao();
                    contato.setId(Long.valueOf(jTId.getText()));
                    contato.setNome(jTNome.getText());
                    contato.setEndereco(jTEndereco.getText());
                    contato.setTelefone(jTTelefone.getText());
                    contato.setEmail(jTEmail.getText());
                    contato.setSexo(jTSexo.getText());
                    dao.altera(contato);
                    JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
            }
        }
    }
    
    public void jTTabelaLinhaSelecionada(JTable tabela){
        if (jTTabela.getSelectedRow() != -1){
            habilitaDados();
        jTId.setText(String.valueOf(contatos.get(tabela.getSelectedRow()).getId()));
        jTNome.setText(contatos.get(tabela.getSelectedRow()).getNome());
        jTEndereco.setText(contatos.get(tabela.getSelectedRow()).getEndereco());
        jTEmail.setText(contatos.get(tabela.getSelectedRow()).getEmail());
        jTTelefone.setText(contatos.get(tabela.getSelectedRow()).getTelefone());
        jTSexo.setText(contatos.get(tabela.getSelectedRow()).getSexo());
    }else{
            jTId.setText("");
            jTNome.setText("");
            jTEndereco.setText("");
            jTEmail.setText("");
            jTTelefone.setText("");
            jTSexo.setText("");
        }
    }
    public void desabilitaDados(){//Para desabilitar campos, como o do ID que não se altera
        jTId.setEditable(false);
        jTNome.setEditable(false);
        jTEndereco.setEditable(false);
        jTTelefone.setEditable(false);
        jTEmail.setEditable(false);
        jTSexo.setEditable(false);
    }
    
        public void habilitaDados(){//Para habilitar campos, para se alterar 
        jTNome.setEditable(true);
        jTEndereco.setEditable(true);
        jTTelefone.setEditable(true);
        jTEmail.setEditable(true);
        jTSexo.setEditable(true);
    }
        
        public void listarContatos() throws SQLException{
            ContatoDao dao = new ContatoDao();
            contatos = dao.getLista("%" + jTPesquisa.getText() + "%");
            mostraPesquisa(contatos);
        }
        
        private void mostraPesquisa(List<Contato> contatos) {
            while(tmContato.getRowCount()>0){
                tmContato.removeRow(0);
            }
       if(contatos.size() == 0){
           JOptionPane.showMessageDialog(null, "Nehum contato cadastrado");
       }else{
           String [] linha = new String []{null, null, null, null, null};
           for (int i = 0; i < contatos.size(); i++) {
               tmContato.addRow(linha);
               tmContato.setValueAt(contatos.get(i).getId(), i, 0);
               tmContato.setValueAt(contatos.get(i).getNome(), i, 1);
               tmContato.setValueAt(contatos.get(i).getEndereco(), i, 2);
               tmContato.setValueAt(contatos.get(i).getTelefone(), i, 3);
               tmContato.setValueAt(contatos.get(i).getEmail(), i, 4);
               tmContato.setValueAt(contatos.get(i).getSexo(), i, 5);
           }
       }
    }
    
    public void cadastro(){//metodo para cadastrar contatos
        try {
            //seta os valores no banco de dados
            Contato c1 = new Contato();
            c1.setNome(jTNome.getText());
            c1.setEndereco(jTEndereco.getText());
            c1.setTelefone(jTTelefone.getText());
            c1.setEmail(jTEmail.getText());
            c1.setSexo(jTSexo.getText());

            //objeto de conexao com um try cat
            ContatoDao dao = new ContatoDao();
            dao.adiciona(c1);
        } catch (SQLException ex) {
            System.out.println("Error ao cadastrar contatos" + ex);
        }
    }
    
    public boolean verificaDados(){//validaoçao de Campos
            if (!jTNome.getText().equals("") && !jTEndereco.getText().equals("") && !jTTelefone.getText().equals("")
                && !jTEmail.getText().equals("") && !jTSexo.getText().equals("")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos de cadastro devem ser preechidos!");
            return false;
        }
    }
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
            java.util.logging.Logger.getLogger(JTAgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTAgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTAgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTAgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTAgendaContatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPesquisa;
    private javax.swing.JTextField jTSexo;
    private javax.swing.JTable jTTabela;
    private javax.swing.JTextField jTTelefone;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    
}
