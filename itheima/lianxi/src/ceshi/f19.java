//package ceshi;
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
// */
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.JFreeChart;
//import org.jfree.data.general.DefaultPieDataset;
///**
// *
// * @author 14338
// */
//public class f19 extends javax.swing.JFrame {
//
//    /**
//     * Creates new form f19
//     */
//    public f19() {
//        initComponents();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">
//    private void initComponents() {
//
//        jScrollPane1 = new javax.swing.JScrollPane();
//        tableSales = new javax.swing.JTable();
//        DisplayButton = new javax.swing.JButton();
//        panelSales = new javax.swing.JPanel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        tableSales.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null},
//                        {null, null, null}
//                },
//                new String [] {
//                        "编号", "品牌", "销量"
//                }
//        ));
//        jScrollPane1.setViewportView(tableSales);
//
//        DisplayButton.setText("显示数据");
//        DisplayButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                DisplayButtonActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout panelSalesLayout = new javax.swing.GroupLayout(panelSales);
//        panelSales.setLayout(panelSalesLayout);
//        panelSalesLayout.setHorizontalGroup(
//                panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 987, Short.MAX_VALUE)
//        );
//        panelSalesLayout.setVerticalGroup(
//                panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 670, Short.MAX_VALUE)
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(64, 64, 64)
//                                                .addComponent(DisplayButton)))
//                                .addGap(41, 41, 41)
//                                .addComponent(panelSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addContainerGap())
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(18, 18, 18)
//                                                .addComponent(DisplayButton))
//                                        .addComponent(panelSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        pack();
//    }// </editor-fold>
//
//    private void DisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {
//        String []brand = {"三星","诺基亚","小米","OPPO","索尼","步步高","苹果","红米"};
//        Integer []sales={35,20,6,7,30,30,50,35};
//
//        for(int i=0;i<8;i++)
//        {
//            tableSales.getModel().setValueAt(i+1,i,0);
//            tableSales.getModel().setValueAt(brand[i],i,1);
//            tableSales.getModel().setValueAt(sales[i],i,2);
//        }
//
//        //显示数据到图表
//        DefaultPieDataset dataset = new DefaultPieDataset();
//        for(int i=0;i<8;i++)
//        {
//            dataset.setValue(brand[i], sales[i]);
//        }
//        JFreeChart pieChart = ChartFactory.createPieChart("手机销量图", dataset,true, true, false);
//
//        ChartPanel chartpanel = new ChartPanel(pieChart);
//        chartpanel.setSize(panelSales.getSize());
//        panelSales.removeAll();
//        panelSales.add(chartpanel);
//        panelSales.validate();        // TODO add your handling code here:
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(f19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(f19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(f19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(f19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new f19().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify
//    private javax.swing.JButton DisplayButton;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JPanel panelSales;
//    private javax.swing.JTable tableSales;
//    // End of variables declaration
//}
//
