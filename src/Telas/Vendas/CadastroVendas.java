/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas.Vendas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class CadastroVendas extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVendas
     */
    public CadastroVendas() {
        initComponents();
        lblDinheiro.setVisible(false);
        txtDinheiro.setVisible(false);
        lblPixCodigo.setVisible(false);
        lblTroco.setVisible(false);
        lblValorTroco.setVisible(false);
        lblDinheiroDado.setVisible(false);
        lblSoma.setVisible(false);
        lblCONFIA.setVisible(false);
        lblSoma.setVisible(false);
        lblTroco.setVisible(false);

        Connection conexao;
        PreparedStatement st;
        ResultSet rs;
        //Conexão com o BD
        DefaultTableModel defTable;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_raphas", "root", "admin123");
            //Busca o item na tabela do BD
            st = conexao.prepareStatement("SELECT Nome_prod FROM tb_estoque;");
            rs = st.executeQuery();

            while (rs.next()) {
                cbxProduto.addItem(rs.getString("Nome_Prod"));
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "CPF inválido " + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex);
            return;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto " + ex);
            return;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultaVenda = new javax.swing.JTable();
        lblValorFinal = new javax.swing.JLabel();
        btnFazerVenda = new javax.swing.JButton();
        cbxProduto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbxMeioPagamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblDinheiro = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        lblPixCodigo = new javax.swing.JLabel();
        lblDinheiroDado = new javax.swing.JLabel();
        lblSoma = new javax.swing.JLabel();
        lblTroco = new javax.swing.JLabel();
        lblValorTroco = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        lblCONFIA = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        tbConsultaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbConsultaVenda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 690, 240);

        lblValorFinal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorFinal.setForeground(new java.awt.Color(153, 0, 0));
        lblValorFinal.setText("00.00");
        getContentPane().add(lblValorFinal);
        lblValorFinal.setBounds(750, 350, 50, 30);

        btnFazerVenda.setText("Finalizar!");
        btnFazerVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFazerVenda);
        btnFazerVenda.setBounds(720, 390, 100, 40);

        cbxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProduto);
        cbxProduto.setBounds(20, 20, 180, 30);

        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 340, 160, 30);
        getContentPane().add(txtCPF);
        txtCPF.setBounds(20, 370, 160, 30);

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 340, 160, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(210, 370, 160, 30);

        cbxMeioPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POS Crédito", "POS Débito", "PIX", "Vale Alimentação", "Dinheiro" }));
        cbxMeioPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMeioPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxMeioPagamento);
        cbxMeioPagamento.setBounds(420, 370, 180, 30);

        jLabel4.setText("Meio de Pagamento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 340, 180, 30);

        lblDinheiro.setText("DINHEIRO:");
        getContentPane().add(lblDinheiro);
        lblDinheiro.setBounds(420, 410, 170, 30);

        txtDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDinheiroActionPerformed(evt);
            }
        });
        getContentPane().add(txtDinheiro);
        txtDinheiro.setBounds(420, 440, 190, 30);

        lblPixCodigo.setText("  PIX: RaphasPix@confia.com");
        getContentPane().add(lblPixCodigo);
        lblPixCodigo.setBounds(420, 390, 190, 60);

        lblDinheiroDado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDinheiroDado.setForeground(new java.awt.Color(0, 0, 0));
        lblDinheiroDado.setText("00.00");
        getContentPane().add(lblDinheiroDado);
        lblDinheiroDado.setBounds(750, 300, 50, 30);

        lblSoma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoma.setForeground(new java.awt.Color(0, 0, 0));
        lblSoma.setText("_____________");
        getContentPane().add(lblSoma);
        lblSoma.setBounds(740, 300, 70, 40);

        lblTroco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTroco.setText("Troco:");
        getContentPane().add(lblTroco);
        lblTroco.setBounds(720, 450, 50, 30);

        lblValorTroco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorTroco.setText("00.00");
        getContentPane().add(lblValorTroco);
        lblValorTroco.setBounds(770, 450, 50, 30);

        btnRemover.setText("Remover!");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(230, 20, 90, 30);

        lblCONFIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/confia.png"))); // NOI18N
        getContentPane().add(lblCONFIA);
        lblCONFIA.setBounds(600, 410, 15, 20);

        txtValorPagar.setToolTipText("");
        txtValorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagarActionPerformed(evt);
            }
        });
        getContentPane().add(txtValorPagar);
        txtValorPagar.setBounds(740, 260, 64, 40);

        setSize(new java.awt.Dimension(862, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFazerVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerVendaActionPerformed
        DefaultTableModel table = (DefaultTableModel) tbConsultaVenda.getModel();
        if (txtNome.getText().isEmpty() == true) {

            JOptionPane.showMessageDialog(null, "Campo Invalido");
            return;
        }
        if (txtDinheiro.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo Invalido");
            return;
        }
        if (txtValorPagar.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo Invalido");
            return;
        }
        //String teste = tbConsultaVenda.getColumnModel().toString();
        //JOptionPane.showMessageDialog(null, teste);
        try {
            String produtos = "";
            Connection conexao;
            PreparedStatement st;
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_raphas", "root", "admin123");
            st = conexao.prepareStatement("insert into tb_vendas (cpf_vend, nome_vend, Produtos_vend, formapag_vend, valortotal_vend) values(?,?,?,?,?);");
            st.setInt(1, Integer.parseInt(txtCPF.getText()));
            st.setString(2, txtNome.getText());
            st.setString(3, cbxProduto.getSelectedItem().toString());
            st.setString(4, cbxMeioPagamento.getSelectedItem().toString());
            st.setDouble(5, Double.parseDouble(txtValorPagar.getText()));
            st.executeUpdate();
            double a = 0;
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");

            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_raphas", "root", "admin123");
            st = conexao.prepareStatement("SELECT valortotal_vend from tb_vendas;");
            rs = st.executeQuery();
            rs.next();
            double soma = Double.parseDouble(rs.getString("valortotal_vend"));
            while (rs.next()) {

            }

            double DinheiroDado = Double.parseDouble(txtDinheiro.getText());
            double DinheiroRecebido = Double.parseDouble(txtValorPagar.getText());

            double resposta = DinheiroDado - DinheiroRecebido;

            lblValorFinal.setText(Double.toString(DinheiroRecebido));
            lblDinheiroDado.setText(Double.toString(DinheiroDado));

            lblTroco.setText(Double.toString(resposta));
            JOptionPane.showMessageDialog(null, "Valor a pagar " + Double.toString(resposta));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "CPF inválido " + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca" + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro no BD está incorreto" + ex);
        }
    }//GEN-LAST:event_btnFazerVendaActionPerformed

    private void cbxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProdutoActionPerformed

        Connection conexao;
        PreparedStatement st;
        ResultSet rs;
        //Conexão com o BD
        DefaultTableModel defTable;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_raphas", "root", "admin123");
            //Busca o item na tabela do BD
            st = conexao.prepareStatement("SELECT id_prod, nome_prod, preco_prod, qtd_prod FROM tb_estoque where nome_prod = ?;");
            st.setString(1, cbxProduto.getSelectedItem().toString());
            rs = st.executeQuery();

            while (rs.next()) {

                defTable = (DefaultTableModel) tbConsultaVenda.getModel();
                Object[] dados = {rs.getString("id_prod"), rs.getString("nome_prod"),
                    rs.getString("qtd_prod"), rs.getString("preco_prod")};
                defTable.addRow(dados);

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "CPF inválido " + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex);
            return;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto " + ex);
            return;
        }
    }//GEN-LAST:event_cbxProdutoActionPerformed

    private void cbxMeioPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMeioPagamentoActionPerformed
        if (cbxMeioPagamento.getSelectedItem().toString() == "Dinheiro") {
            lblDinheiro.setVisible(true);
            txtDinheiro.setVisible(true);
            lblTroco.setVisible(true);
            lblValorTroco.setVisible(true);
            lblDinheiroDado.setVisible(true);
            lblSoma.setVisible(true);
            lblSoma.setVisible(true);
            lblTroco.setVisible(true);
        } else {
            lblDinheiro.setVisible(false);
            txtDinheiro.setVisible(false);
            lblTroco.setVisible(false);
            lblValorTroco.setVisible(false);
            lblDinheiroDado.setVisible(false);
            lblSoma.setVisible(false);
            lblSoma.setVisible(false);
            lblTroco.setVisible(false);
        }
        if (cbxMeioPagamento.getSelectedItem().toString() == "PIX") {
            lblPixCodigo.setVisible(true);
            lblCONFIA.setVisible(true);
        } else {
            lblPixCodigo.setVisible(false);
            lblCONFIA.setVisible(false);

        }
    }//GEN-LAST:event_cbxMeioPagamentoActionPerformed

    private void txtDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDinheiroActionPerformed
        if (txtDinheiro.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo Invalido");
            return;
        }
        if (txtValorPagar.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo Invalido");
            return;
        } else {
            double DinheiroDado = Double.parseDouble(txtDinheiro.getText());
            double DinheiroRecebido = Double.parseDouble(txtValorPagar.getText());

            double resposta = DinheiroDado - DinheiroRecebido;
            lblDinheiroDado.setText(Double.toString(DinheiroRecebido));
            lblValorFinal.setText(Double.toString(DinheiroRecebido));
            lblDinheiroDado.setText(Double.toString(DinheiroDado));

            lblValorTroco.setText(Double.toString(resposta));
        }
    }//GEN-LAST:event_txtDinheiroActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        //pega o número de linhas da tabela tblProdutos

        DefaultTableModel table = (DefaultTableModel) tbConsultaVenda.getModel();

        if (tbConsultaVenda.getSelectedRow() >= 0) {
            table.removeRow(tbConsultaVenda.getSelectedRow());
        } else {
            if (tbConsultaVenda.getSelectedRow() <= 0) {
                JOptionPane.showMessageDialog(null, "Tabela Vazia");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um campo válido");
            }
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void txtValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagarActionPerformed
        try {
            if (txtDinheiro.isVisible() == false) {
                if (txtValorPagar.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Invalido");
                    return;

                } else {
                    double DinheiroRecebido = Double.parseDouble(txtValorPagar.getText());
                    lblValorFinal.setText(Double.toString(DinheiroRecebido));
                }
            }

            //double DinheiroDado = Double.parseDouble(txtDinheiro.getText());
            double DinheiroRecebido = Double.parseDouble(txtValorPagar.getText());
            lblValorFinal.setText(Double.toString(DinheiroRecebido));
            
            //double resposta = DinheiroDado - DinheiroRecebido;
            //lblDinheiroDado.setText(Double.toString(DinheiroRecebido));
            //lblDinheiroDado.setText(Double.toString(DinheiroDado));

            //lblValorTroco.setText(Double.toString(resposta));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Campo Invalido");
        }
    }//GEN-LAST:event_txtValorPagarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFazerVenda;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbxMeioPagamento;
    private javax.swing.JComboBox<Object> cbxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCONFIA;
    private javax.swing.JLabel lblDinheiro;
    private javax.swing.JLabel lblDinheiroDado;
    private javax.swing.JLabel lblPixCodigo;
    private javax.swing.JLabel lblSoma;
    private javax.swing.JLabel lblTroco;
    private javax.swing.JLabel lblValorFinal;
    private javax.swing.JLabel lblValorTroco;
    private javax.swing.JTable tbConsultaVenda;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValorPagar;
    // End of variables declaration//GEN-END:variables
}