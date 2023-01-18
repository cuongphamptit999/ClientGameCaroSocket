/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.ptit.view.scene;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import vn.ptit.ClientMain;

public class InGameView extends javax.swing.JFrame {

    final int COLUMN = 16, ROW = 16;

    private JButton btnOnBoard[][];

    /**
     * Creates new form InGame
     */
    public InGameView() {
        initComponents();
        setLocationRelativeTo(null);
        jTextArea1.setEditable(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);

        // board
        plBoardContainer.setLayout(new GridLayout(ROW, COLUMN));
        initBoard();
        dispose();

    }

    public void initBoard() {
        plBoardContainer.removeAll();
        btnOnBoard = new JButton[COLUMN + 2][ROW + 2];

        for (int row = 0; row < ROW; row++) {
            for (int column = 0; column < COLUMN; column++) {
                btnOnBoard[row][column] = createBoardButton(row, column);
                plBoardContainer.add(btnOnBoard[row][column]);
            }
        }
    }

    public JButton createBoardButton(int row, int column) {
        JButton b = new JButton();
        b.setFocusPainted(false);
        b.setBackground(Color.decode("#CCFFCC"));
        b.setActionCommand(row + " " + column);

        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plRightContainer = new javax.swing.JPanel();
        plToolContainer = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        plPlayerContainer = new javax.swing.JPanel();
        plPlayer = new javax.swing.JPanel();
        lbAvatar1 = new javax.swing.JLabel();
        lbPlayerNameId1 = new javax.swing.JLabel();
        lbVersus = new javax.swing.JLabel();
        lbAvatar2 = new javax.swing.JLabel();
        lbPlayerNameId2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        plTimer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        plBoardContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Caro Game");
        setResizable(false);

        plToolContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jButton2.setText("Chơi mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Thoát phòng");

        jLabel4.setText("Chủ phòng: cuongpham");

        javax.swing.GroupLayout plToolContainerLayout = new javax.swing.GroupLayout(plToolContainer);
        plToolContainer.setLayout(plToolContainerLayout);
        plToolContainerLayout.setHorizontalGroup(
            plToolContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plToolContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plToolContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        plToolContainerLayout.setVerticalGroup(
            plToolContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plToolContainerLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        plPlayer.setBorder(javax.swing.BorderFactory.createTitledBorder("Người chơi"));

        lbAvatar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/ptit/view/img/icons8-question-mark-96.png"))); // NOI18N
        lbAvatar1.setBorder(javax.swing.BorderFactory.createTitledBorder("..."));
        lbAvatar1.setOpaque(true);

        lbPlayerNameId1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbPlayerNameId1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlayerNameId1.setText("Đang chờ...");

        lbVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/ptit/view/img/icons8_sword_48px.png"))); // NOI18N

        lbAvatar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/ptit/view/img/icons8-question-mark-96.png"))); // NOI18N
        lbAvatar2.setBorder(javax.swing.BorderFactory.createTitledBorder("..."));

        lbPlayerNameId2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbPlayerNameId2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlayerNameId2.setText("Đang chờ...");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/ptit/view/img/icons8-delete-24.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/ptit/view/img/icons8-circle-24.png"))); // NOI18N

        javax.swing.GroupLayout plPlayerLayout = new javax.swing.GroupLayout(plPlayer);
        plPlayer.setLayout(plPlayerLayout);
        plPlayerLayout.setHorizontalGroup(
            plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPlayerNameId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVersus, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPlayerNameId2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        plPlayerLayout.setVerticalGroup(
            plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plPlayerLayout.createSequentialGroup()
                        .addGroup(plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plPlayerLayout.createSequentialGroup()
                                .addComponent(lbAvatar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPlayerNameId1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(plPlayerLayout.createSequentialGroup()
                                .addComponent(lbAvatar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPlayerNameId2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(plPlayerLayout.createSequentialGroup()
                        .addComponent(lbVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        plTimer.setBorder(javax.swing.BorderFactory.createTitledBorder("Thời gian"));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setText("00 : 00");

        javax.swing.GroupLayout plTimerLayout = new javax.swing.GroupLayout(plTimer);
        plTimer.setLayout(plTimerLayout);
        plTimerLayout.setHorizontalGroup(
            plTimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTimerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(96, 96, 96))
        );
        plTimerLayout.setVerticalGroup(
            plTimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTimerLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout plPlayerContainerLayout = new javax.swing.GroupLayout(plPlayerContainer);
        plPlayerContainer.setLayout(plPlayerContainerLayout);
        plPlayerContainerLayout.setHorizontalGroup(
            plPlayerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plTimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plPlayerContainerLayout.setVerticalGroup(
            plPlayerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPlayerContainerLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(plPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plTimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhắn tin"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Gửi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(1, 1, 1))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout plRightContainerLayout = new javax.swing.GroupLayout(plRightContainer);
        plRightContainer.setLayout(plRightContainerLayout);
        plRightContainerLayout.setHorizontalGroup(
            plRightContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plPlayerContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plToolContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plRightContainerLayout.setVerticalGroup(
            plRightContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plRightContainerLayout.createSequentialGroup()
                .addComponent(plToolContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plPlayerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        plBoardContainer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plBoardContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plRightContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plBoardContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plRightContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InGameView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InGameView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InGameView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InGameView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InGameView().setVisible(true);
            }
        });
    }

    public JLabel getLbPlayerNameId1() {
        return lbPlayerNameId1;
    }

    public JLabel getLbPlayerNameId2() {
        return lbPlayerNameId2;
    }

    public JLabel getLbAvatar1() {
        return lbAvatar1;
    }

    public JLabel getLbAvatar2() {
        return lbAvatar2;
    }

    public JButton[][] getBtnOnBoard() {
        return btnOnBoard;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public JLabel getLbVersus() {
        return lbVersus;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }
    
    public void addListener(ActionListener actionListener) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                btnOnBoard[i][j].addActionListener(actionListener);
            }
        }
        jButton1.addActionListener(actionListener);
        jButton2.addActionListener(actionListener);
        jButton3.addActionListener(actionListener);

    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAvatar1;
    private javax.swing.JLabel lbAvatar2;
    private javax.swing.JLabel lbPlayerNameId1;
    private javax.swing.JLabel lbPlayerNameId2;
    private javax.swing.JLabel lbVersus;
    private javax.swing.JPanel plBoardContainer;
    private javax.swing.JPanel plPlayer;
    private javax.swing.JPanel plPlayerContainer;
    private javax.swing.JPanel plRightContainer;
    private javax.swing.JPanel plTimer;
    private javax.swing.JPanel plToolContainer;
    // End of variables declaration//GEN-END:variables
}
