/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controlador;

import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.BancoDados;
import modelo.Livro;

/**
 *
 * @author isado
 */
public class TelaInicial extends javax.swing.JFrame {

    BancoDados bd = new BancoDados("localhost", "acervo", "3306", "acervo", "acervo123");
    int id;
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        lblTextoId = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        lblPaginas = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblResumo = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumo = new javax.swing.JTextArea();
        lblId = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setResizable(false);

        btnPrimeiro.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnPrimeiro.setText("<<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        lblTextoId.setText("Codigo livro: ");

        lblTitulo.setText("T??tulo do livro");

        txtTitulo.setText("...");
        txtTitulo.setToolTipText("T??tulo");

        lblAno.setText("Ano de lan??amento");

        lblPaginas.setText("N??mero de p??ginas");

        txtAno.setText("...");
        txtAno.setToolTipText("Ano lan??amento");

        lblPais.setText("Pa??s de origem");

        lblIdioma.setText("Idioma");

        txtPais.setText("...");
        txtPais.setToolTipText("Pa??s de origem");

        lblResumo.setText("Resumo");

        txtPaginas.setText("...");
        txtPaginas.setToolTipText("P??ginas");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnDeletar.setText("Excluir");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtResumo.setColumns(20);
        txtResumo.setLineWrap(true);
        txtResumo.setRows(5);
        txtResumo.setText("...");
        txtResumo.setToolTipText("Resumo");
        jScrollPane1.setViewportView(txtResumo);

        lblId.setText("0");
        lblId.setToolTipText("Id livro");

        txtIdioma.setText("...");
        txtIdioma.setToolTipText("Idioma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPais)
                            .addComponent(lblAno)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaginas)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPaginas)
                                    .addComponent(lblIdioma))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIdioma)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResumo)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addGap(39, 39, 39)
                                .addComponent(btnSalvar)
                                .addGap(40, 40, 40)
                                .addComponent(btnDeletar)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblTextoId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoId)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(lblPaginas))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(lblIdioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // id = menor id que achar, a?? puxa as infos daquele id
        id = parseInt(lblId.getText());
        if(bd.isConnected()){
            Livro livro = new Livro(bd.getConexao());
            try{
                if (livro.obterLivroMenorId()) {
                    lblId.setText(""+livro.getIdLivro());
                    txtTitulo.setText(livro.getTitulo());
                    txtAno.setText(""+livro.getAnoLancamento());
                    txtIdioma.setText(livro.getIdioma());
                    txtPaginas.setText(""+livro.getNumeroPaginas());
                    txtPais.setText(livro.getPaisOrigem());
                    txtResumo.setText(livro.getResumo());
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro n??o existe");
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, "N??o achei o livro");
            }      
        }
        else{
            JOptionPane.showMessageDialog(this, "O banco de dados n??o est?? conectado\n"+bd.getMensagemErro());
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // id= idAtual-1. a?? puxa as infos daquele id
        id = parseInt(lblId.getText());
        if(bd.isConnected()){
            Livro livro = new Livro(bd.getConexao());
            try{
                if(livro.obterLivroPeloIdLivro(id-1)){
                    lblId.setText(""+livro.getIdLivro());
                    txtTitulo.setText(livro.getTitulo());
                    txtAno.setText(""+livro.getAnoLancamento());
                    txtIdioma.setText(livro.getIdioma());
                    txtPaginas.setText(""+livro.getNumeroPaginas());
                    txtPais.setText(livro.getPaisOrigem());
                    txtResumo.setText(livro.getResumo());
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro n??o existe");
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, "N??o achei o livro");
            }
      
        }
        else{
            JOptionPane.showMessageDialog(this, "O banco de dados n??o est?? conectado\n"+bd.getMensagemErro());
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // id= idAtual+1. a?? puxa as infos daquele id
        id = parseInt(lblId.getText());
        if(bd.isConnected()){
            Livro livro = new Livro(bd.getConexao());
            try{
                if(livro.obterLivroPeloIdLivro(id+1)){
                    lblId.setText(""+livro.getIdLivro());
                    txtTitulo.setText(livro.getTitulo());
                    txtAno.setText(""+livro.getAnoLancamento());
                    txtIdioma.setText(livro.getIdioma());
                    txtPaginas.setText(""+livro.getNumeroPaginas());
                    txtPais.setText(livro.getPaisOrigem());
                    txtResumo.setText(livro.getResumo());
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro n??o existe");
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, "N??o achei o livro");
            }
      
        }
        else{
            JOptionPane.showMessageDialog(this, "O banco de dados n??o est?? conectado\n"+bd.getMensagemErro());
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // id = maior id que achar, a?? puxa as infos daquele id
        id = parseInt(lblId.getText());
        if(bd.isConnected()){
            Livro livro = new Livro(bd.getConexao());
            try{
                if (livro.obterLivroMaiorId()) {
                    lblId.setText(""+livro.getIdLivro());
                    txtTitulo.setText(livro.getTitulo());
                    txtAno.setText(""+livro.getAnoLancamento());
                    txtIdioma.setText(livro.getIdioma());
                    txtPaginas.setText(""+livro.getNumeroPaginas());
                    txtPais.setText(livro.getPaisOrigem());
                    txtResumo.setText(livro.getResumo());
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro n??o existe");
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, "N??o achei o livro");
            }      
        }
        else{
            JOptionPane.showMessageDialog(this, "O banco de dados n??o est?? conectado\n"+bd.getMensagemErro());
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // zera todos os campos, a     
        lblId.setText("");
        txtTitulo.setText("");
        txtAno.setText("");
        txtIdioma.setText("");
        txtPaginas.setText("");
        txtPais.setText("");
        txtResumo.setText("");
        btnNovo.setEnabled(true);
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // adicionar o livro ao banco de dados       

        if(bd.isConnected()){
          Livro livro = new Livro(bd.getConexao());
            if (btnNovo.isEnabled() && lblId.getText().equals("")) {
                try{
                    int ano = parseInt(txtAno.getText());
                    livro.setAnoLancamento(ano);
                    livro.setIdioma(txtIdioma.getText());  
                    int pgs = parseInt(txtPaginas.getText());
                    livro.setNumeroPaginas(pgs);
                    livro.setPaisOrigem(txtPais.getText());
                    livro.setResumo(txtResumo.getText());
                    livro.setTitulo(txtTitulo.getText());
                    livro.incluiLivro();
                    lblId.setText(""+livro.getIdLivro());
                    JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso");                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar o livro");
                }
                
            }else{
                try{
                    livro.setAnoLancamento(parseInt(txtAno.getText()));
                    livro.setIdioma(txtIdioma.getText());
                    int pgs = parseInt(txtPaginas.getText());
                    livro.setNumeroPaginas(pgs);
                    livro.setPaisOrigem(txtPais.getText());
                    livro.setResumo(txtResumo.getText());
                    livro.setTitulo(txtTitulo.getText());
                    id = parseInt(lblId.getText());
                    livro.setIdLivro(id);
                    livro.atualizaLivro();
                    JOptionPane.showMessageDialog(this,"Livro alterado com sucesso");                    
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o livro");
                }
            }          
        }
        else{
          JOptionPane.showMessageDialog(this, "O banco de dados n??o est?? conectado\n"+bd.getMensagemErro());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // delete from livro where id = idAtual; mostrar mensagem de confirma????o
        if(bd.isConnected()){
            Livro livro = new Livro(bd.getConexao());
            try{           
                id = parseInt(lblId.getText());
                livro.deletaLivro(id);
                JOptionPane.showConfirmDialog(this, "Deseja mesmo deletar esse livro?", "Excluir?", JOptionPane.YES_NO_OPTION);                
                JOptionPane.showMessageDialog(this, "Livro apagado!");
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, "Erro ao deletar o livro");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "O banco de dados n??o est?? conectado\n"+bd.getMensagemErro());
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblResumo;
    private javax.swing.JLabel lblTextoId;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextArea txtResumo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
