/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//https://tips4java.wordpress.com/2008/10/11/table-format-renderers/
package com.vendedores.client.view;

import com.vendedores.client.model.Dado;
import com.vendedores.client.model.ListaLigada;
import com.vendedores.client.utilities.NumberRenderer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author aevan
 */
public class InserirVendedoresView extends javax.swing.JFrame {

    private ListaLigada list;

    /**
     * Creates new form Interface
     */
    public InserirVendedoresView() {
        initComponents();
        this.list = new ListaLigada();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVendedor = new javax.swing.JTextField();
        lblVendedor = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        spnIdade = new javax.swing.JSpinner();
        lblTotalVendas = new javax.swing.JLabel();
        lblIdentificacaoVendaIC = new javax.swing.JLabel();
        txtFilial = new javax.swing.JTextField();
        lblFilial = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jScrollPaneTabelaVendedores = new javax.swing.JScrollPane();
        tblVendedores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        spnIdentificacaoVendaIC = new javax.swing.JSpinner();
        txtTotalVendas = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtVendedor);
        txtVendedor.setBounds(90, 20, 330, 40);

        lblVendedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVendedor.setText("Vendedor:");
        getContentPane().add(lblVendedor);
        lblVendedor.setBounds(20, 30, 60, 14);

        lblIdade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdade.setText("Idade:");
        getContentPane().add(lblIdade);
        lblIdade.setBounds(20, 90, 40, 10);

        spnIdade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        getContentPane().add(spnIdade);
        spnIdade.setBounds(90, 90, 67, 22);

        lblTotalVendas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalVendas.setText("Total de vendas:");
        getContentPane().add(lblTotalVendas);
        lblTotalVendas.setBounds(190, 90, 90, 16);

        lblIdentificacaoVendaIC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdentificacaoVendaIC.setText("Identificação da venda(IC):");
        getContentPane().add(lblIdentificacaoVendaIC);
        lblIdentificacaoVendaIC.setBounds(10, 200, 150, 16);
        getContentPane().add(txtFilial);
        txtFilial.setBounds(90, 130, 340, 40);

        lblFilial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFilial.setText("Filial:");
        getContentPane().add(lblFilial);
        lblFilial.setBounds(20, 140, 40, 16);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(450, 450, 72, 23);

        tblVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendedor", "Idade", "Total", "Filial", "IC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneTabelaVendedores.setViewportView(tblVendedores);

        getContentPane().add(jScrollPaneTabelaVendedores);
        jScrollPaneTabelaVendedores.setBounds(40, 240, 480, 190);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 200, 90, 21);

        spnIdentificacaoVendaIC.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(spnIdentificacaoVendaIC);
        spnIdentificacaoVendaIC.setBounds(190, 200, 160, 22);

        txtTotalVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTotalVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVendasActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalVendas);
        txtTotalVendas.setBounds(290, 90, 190, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendedorActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        String vendedor = txtVendedor.getText();
        int idade = Integer.parseInt(spnIdade.getValue().toString());
        double total = Double.parseDouble(txtTotalVendas.getText().replace(",", "."));
        String filial = txtFilial.getText();
        int ic = Integer.parseInt(spnIdentificacaoVendaIC.getValue().toString());

        if (vendedor.equals("")
                || idade == 0
                || total == 0
                || filial.equals("")
                || ic == 0) {

            JOptionPane.showMessageDialog(this, "Campos em branco ou com valores nulos.");

        } else {
            Dado dado = new Dado(vendedor, idade, total, filial, ic);            
            list.adiciona(dado);

            Object data[] = {vendedor, idade, total, filial, ic};

            TableColumnModel m = tblVendedores.getColumnModel();
            m.getColumn(2).setCellRenderer(NumberRenderer.getCurrencyRenderer());

            DefaultTableModel tblModel = (DefaultTableModel) tblVendedores.getModel();
            tblModel.addRow(data);

        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtTotalVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVendasActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        System.out.println(this.list);
        //[[Luiz, 19, 2300.0, Osasco, 1],[Marcelo, 22, 2700.0, Rio de Janeiro, 2],[Ana, 25, 2400.0, S�o Paulo, 3]]
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(InserirVendedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirVendedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirVendedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirVendedoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InserirVendedoresView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPaneTabelaVendedores;
    private javax.swing.JLabel lblFilial;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblIdentificacaoVendaIC;
    private javax.swing.JLabel lblTotalVendas;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JSpinner spnIdade;
    private javax.swing.JSpinner spnIdentificacaoVendaIC;
    private javax.swing.JTable tblVendedores;
    private javax.swing.JTextField txtFilial;
    private javax.swing.JFormattedTextField txtTotalVendas;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
