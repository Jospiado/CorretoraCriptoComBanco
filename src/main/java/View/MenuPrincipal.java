/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DepositarController;
import Controller.Helper.MenuPrincipalHelper;
import Controller.MenuPrincipalController;
import DAO.JPAUTIL;
import DAO.MoedaDAO;
import DAO.ServicoDAO;
import Model.Servico;
import Model.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;



/**
 *
 * @author João Pedro
 */
public class MenuPrincipal extends javax.swing.JFrame {
    EntityManager em = new JPAUTIL().getEntityManager();
    private final MenuPrincipalController controller;
    private final MenuPrincipalHelper helper;

    /**
     * Creates new form MenuPrincipal
     */
   
    
    public MenuPrincipal() {
        initComponents();
        
        
        
        
        helper = new MenuPrincipalHelper(this);
        controller = new MenuPrincipalController(this);
        preenchertabelaConstrutor();        
        controller.setarvalorPatrimonio();
        controller.setarmoedas();
        controller.setaremcarteira();
              
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        quantia = new javax.swing.JTextField();
        BotaoDepositar = new javax.swing.JButton();
        BotaoVender = new javax.swing.JButton();
        botaocomprar = new javax.swing.JButton();
        combomoedas1 = new javax.swing.JComboBox<>();
        combomoedas = new javax.swing.JComboBox<>();
        data = new javax.swing.JTextField();
        textemcarteira = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        emcarteira = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        RemoveMoeda = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorbtc = new javax.swing.JLabel();
        valorreal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.Operação", "Código", "Nome", "Tipo Operação", "Quantidade", "Data", "Valor R$", "Valor Moeda", "Valor BTC"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 770, 180));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lucro 5%");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 60, 20));

        quantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantiaActionPerformed(evt);
            }
        });
        quantia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                quantiaPropertyChange(evt);
            }
        });
        getContentPane().add(quantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 80, 30));

        BotaoDepositar.setBackground(new java.awt.Color(153, 153, 0));
        BotaoDepositar.setText("DEPOSITAR");
        BotaoDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 120, 40));

        BotaoVender.setBackground(new java.awt.Color(255, 51, 51));
        BotaoVender.setText("VENDER");
        BotaoVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVenderActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 120, 40));

        botaocomprar.setBackground(new java.awt.Color(51, 204, 0));
        botaocomprar.setText("COMPRAR");
        botaocomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocomprarActionPerformed(evt);
            }
        });
        getContentPane().add(botaocomprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 120, 40));

        combomoedas1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combomoedas1ItemStateChanged(evt);
            }
        });
        combomoedas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomoedas1ActionPerformed(evt);
            }
        });
        getContentPane().add(combomoedas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 150, 30));

        combomoedas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combomoedasItemStateChanged(evt);
            }
        });
        combomoedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomoedasActionPerformed(evt);
            }
        });
        getContentPane().add(combomoedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 30));

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, -1));

        textemcarteira.setBackground(new java.awt.Color(255, 255, 255));
        textemcarteira.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textemcarteira.setForeground(new java.awt.Color(102, 255, 51));
        getContentPane().add(textemcarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 110, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 110, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Digite o ID do Serviço para Exclui-lo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 270, 30));

        emcarteira.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        emcarteira.setForeground(new java.awt.Color(255, 255, 255));
        emcarteira.setText("EM CARTEIRA:");
        getContentPane().add(emcarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 180, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("QUANTIA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 30));

        preco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        preco.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, 20));

        RemoveMoeda.setBackground(new java.awt.Color(255, 0, 0));
        RemoveMoeda.setText("Remover Moeda");
        RemoveMoeda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveMoedaActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveMoeda, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 130, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 130, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SELECIONE A CRIPTOMOEDA A EXCLUIR:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 350, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PREÇO R$:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIGITE A DATA DE HOJE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 300, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECIONE A CRIPTOMOEDA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 350, 30));

        valorbtc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        valorbtc.setForeground(new java.awt.Color(255, 255, 255));
        valorbtc.setText(" xxxx");
        getContentPane().add(valorbtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 160, 30));

        valorreal.setBackground(new java.awt.Color(255, 255, 255));
        valorreal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        valorreal.setForeground(new java.awt.Color(255, 255, 255));
        valorreal.setText("xxxx");
        getContentPane().add(valorreal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/TelaDenegociacao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Cadastrar Moeda");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void preenchertabelaConstrutor(){
        ServicoDAO serv = new ServicoDAO(em);
        ArrayList<Servico> servicos = (ArrayList<Servico>) serv.selectAll();
        helper.preenchertabela(servicos);
    }
    private void BotaoVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVenderActionPerformed
            this.controller.venda();
    }//GEN-LAST:event_BotaoVenderActionPerformed

    private void combomoedasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combomoedasItemStateChanged
             this.controller.setaremcarteira();                                            
    }//GEN-LAST:event_combomoedasItemStateChanged

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void quantiaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_quantiaPropertyChange
            
    }//GEN-LAST:event_quantiaPropertyChange

    private void quantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiaActionPerformed
              this.controller.setarpreco();
        

    }//GEN-LAST:event_quantiaActionPerformed

    private void combomoedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomoedasActionPerformed
          

    }//GEN-LAST:event_combomoedasActionPerformed

    private void botaocomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocomprarActionPerformed
              this.controller.compra();
    }//GEN-LAST:event_botaocomprarActionPerformed

    private void BotaoDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDepositarActionPerformed
             this.controller.navegarparadeposito();
             
    }//GEN-LAST:event_BotaoDepositarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
             this.controller.navegarparacadastrar();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.controller.excluirServico();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combomoedas1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combomoedas1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combomoedas1ItemStateChanged

    private void combomoedas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomoedas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomoedas1ActionPerformed

    private void RemoveMoedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveMoedaActionPerformed
            this.controller.removerMoeda();
    }//GEN-LAST:event_RemoveMoedaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDepositar;
    private javax.swing.JButton BotaoVender;
    private javax.swing.JButton RemoveMoeda;
    private javax.swing.JButton botaocomprar;
    private javax.swing.JComboBox<String> combomoedas;
    private javax.swing.JComboBox<String> combomoedas1;
    private javax.swing.JTextField data;
    private javax.swing.JLabel emcarteira;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel preco;
    private javax.swing.JTextField quantia;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel textemcarteira;
    private javax.swing.JLabel valorbtc;
    private javax.swing.JLabel valorreal;
    // End of variables declaration//GEN-END:variables

    public JLabel getValorbtc() {
        return valorbtc;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public void setValorbtc(JLabel valorbtc) {
        this.valorbtc = valorbtc;
    }

    public JLabel getValorreal() {
        return valorreal;
    }

    public void setValorreal(JLabel valorreal) {
        this.valorreal = valorreal;
    }

    public JComboBox<String> getCombomoedas() {
        return combomoedas;
    }

    public void setCombomoedas(JComboBox<String> combomoedas) {
        this.combomoedas = combomoedas;
    }

    public JLabel getPreco() {
        return preco;
    }

    public void setPreco(JLabel preco) {
        this.preco = preco;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public JTextField getQuantia() {
        return quantia;
    }

    public void setQuantia(JTextField quantia) {
        this.quantia = quantia;
    }

    public JTextField getData() {
        return data;
    }

    public void setData(JTextField data) {
        this.data = data;
    }

    public JLabel getTextemcarteira() {
        return textemcarteira;
    }

    public void setTextemcarteira(JLabel textemcarteira) {
        this.textemcarteira = textemcarteira;
    }

    public JComboBox<String> getCombomoedas1() {
        return combomoedas1;
    }

    public void setCombomoedas1(JComboBox<String> combomoedas1) {
        this.combomoedas1 = combomoedas1;
    }
    
    


    public JLabel getValordamoeda() {
        return textemcarteira;
    }

    public void setValordamoeda(JLabel valordamoeda) {
        this.textemcarteira = valordamoeda;
    }
    
}
