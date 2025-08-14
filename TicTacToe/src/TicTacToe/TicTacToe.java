package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public TicTacToe() {
        initComponents();
    }
    
    
    private void gameScore () {
        jLabelX.setText(String.valueOf(xCount));
        jLabelO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player () {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else { 
            startGame = "X";
        }
    }
    
    private void winningGame () {
        String b1 = jbtnTic1.getText();
        String b2 = jbtnTic1.getText();
        String b3 = jbtnTic1.getText();
        String b4 = jbtnTic1.getText();
        String b5 = jbtnTic1.getText();
        String b6 = jbtnTic1.getText();
        String b7 = jbtnTic1.getText();
        String b8 = jbtnTic1.getText();
        String b9 = jbtnTic1.getText();
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
                xCount++;
                gameScore();
        }
        
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
                xCount++;
                gameScore();
        }
        
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
                oCount++;
                gameScore();
        }
        
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.MAGENTA);
            jbtnTic4.setBackground(Color.MAGENTA);
            jbtnTic7.setBackground(Color.MAGENTA);
                xCount++;
                gameScore();
        }
        
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
                xCount++;
                gameScore();
        }
         
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.MAGENTA);
            jbtnTic6.setBackground(Color.MAGENTA);
            jbtnTic9.setBackground(Color.MAGENTA);
                xCount++;
                gameScore();
        }
         
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
                xCount++;
                gameScore();
        }
        
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.cyan);
            jbtnTic5.setBackground(Color.cyan);
            jbtnTic7.setBackground(Color.cyan);
                xCount++;
                gameScore();
        }
        
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic3.setBackground(Color.PINK);
                oCount++;
                gameScore();
        } 
       
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.YELLOW);
            jbtnTic5.setBackground(Color.YELLOW);
            jbtnTic6.setBackground(Color.YELLOW);
                oCount++;
                gameScore();
        }
        
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.MAGENTA);
            jbtnTic8.setBackground(Color.MAGENTA);
            jbtnTic9.setBackground(Color.MAGENTA);
                oCount++;
                gameScore();
        }
         
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.MAGENTA);
            jbtnTic4.setBackground(Color.MAGENTA);
            jbtnTic7.setBackground(Color.MAGENTA);
                oCount++;
                gameScore();
        }
        
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.MAGENTA);
            jbtnTic5.setBackground(Color.MAGENTA);
            jbtnTic8.setBackground(Color.MAGENTA);
                oCount++;
                gameScore();
        }
        
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.PINK);
            jbtnTic6.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
                oCount++;
                gameScore();
        }
        
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic9.setBackground(Color.PINK);
                oCount++;
                gameScore();
        }
        
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic7.setBackground(Color.PINK);
                oCount++;
                gameScore();
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabelO = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 660, 700));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 660, 700));

        jbtnTic4.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 190));

        jbtnTic9.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 200, 190));

        jbtnTic1.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 190));

        jbtnTic5.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 220, 190));

        jbtnTic2.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 220, 190));

        jbtnTic3.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 200, 190));

        jbtnTic6.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 200, 190));

        jbtnTic7.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 220, 190));

        jbtnTic8.setBackground(new java.awt.Color(240, 240, 240));
        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 220, 190));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 650));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 660, 700));

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 660, 700));

        jbtnExit.setBackground(new java.awt.Color(240, 240, 240));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(0, 0, 0));
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 290, 130));

        jbtnNewGame.setBackground(new java.awt.Color(240, 240, 240));
        jbtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnNewGame.setForeground(new java.awt.Color(0, 0, 0));
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 150));

        jbtnReset.setBackground(new java.awt.Color(240, 240, 240));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 0, 0));
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 130));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 630, 310));

        jPanel9.setBackground(new java.awt.Color(95, 158, 160));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(95, 158, 160));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 660, 700));

        jPanel11.setBackground(new java.awt.Color(95, 158, 160));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 660, 700));

        jLabelO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabelO.setText("Player O: ");
        jPanel9.add(jLabelO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabelX.setText("Player X: ");
        jPanel9.add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton30.setBackground(new java.awt.Color(240, 240, 240));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 0));
        jButton30.setText("0");
        jButton30.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton30.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton30.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 300, 80));

        jButton32.setBackground(new java.awt.Color(240, 240, 240));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 0, 0));
        jButton32.setText("0");
        jButton32.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton32.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton32.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 300, 80));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 660, 650));

        jPanel12.setBackground(new java.awt.Color(95, 158, 160));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setBackground(new java.awt.Color(240, 240, 240));
        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Tic Tac Toe ");
        jPanel12.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 360, 50));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1360, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        jbtnTic4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        jbtnTic9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        jbtnTic1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        jbtnTic5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        jbtnTic3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        jbtnTic7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", 
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
            System.exit(0);
            
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jLabelX.setText("0");
        jLabelO.setText("0");
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton32;
    private javax.swing.JLabel jLabelO;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    // End of variables declaration//GEN-END:variables
}
