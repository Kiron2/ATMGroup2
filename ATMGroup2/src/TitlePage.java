

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class TitlePage extends javax.swing.JFrame {

    /**
     * Creates new form TitlePage
     */
    public TitlePage() {
        initComponents();
        
        ImageIcon iFP = new ImageIcon(getClass().getResource("images/background_for_ATM.png"));
        Image imageBG = (iFP).getImage().getScaledInstance(lbl_screen.getWidth()+10, lbl_screen.getHeight(), Image.SCALE_SMOOTH);
        iFP = new ImageIcon(imageBG);
        lbl_screen.setIcon(iFP);
        
        ImageIcon iIN = new ImageIcon(getClass().getResource("images/insert.png"));
        Image imageIN = (iIN).getImage().getScaledInstance(btn_insert.getWidth()+10, btn_insert.getHeight(), Image.SCALE_SMOOTH);
        iIN = new ImageIcon(imageIN);
        btn_insert.setIcon(iIN);
        
        ImageIcon iRA = new ImageIcon(getClass().getResource("images/resetAll.png"));
        Image imageRA = (iRA).getImage().getScaledInstance(btn_resetall.getWidth()+10, btn_resetall.getHeight(), Image.SCALE_SMOOTH);
        iRA = new ImageIcon(imageRA);
        btn_resetall.setIcon(iRA);
        
        ImageIcon i7 = new ImageIcon(getClass().getResource("images/7.png"));
        Image image7 = (i7).getImage().getScaledInstance(btn_seven.getWidth()+10, btn_seven.getHeight(), Image.SCALE_SMOOTH);
        i7 = new ImageIcon(image7);
        btn_seven.setIcon(i7);
        
        ImageIcon i8 = new ImageIcon(getClass().getResource("images/8.png"));
        Image image8 = (i8).getImage().getScaledInstance(btn_eight.getWidth()+10, btn_eight.getHeight(), Image.SCALE_SMOOTH);
        i8 = new ImageIcon(image8);
        btn_eight.setIcon(i8);
        
        ImageIcon i9 = new ImageIcon(getClass().getResource("images/9.png"));
        Image image9 = (i9).getImage().getScaledInstance(btn_nine.getWidth()+10, btn_nine.getHeight(), Image.SCALE_SMOOTH);
        i9 = new ImageIcon(image9);
        btn_nine.setIcon(i9);
        
        ImageIcon i4 = new ImageIcon(getClass().getResource("images/4.png"));
        Image image4 = (i4).getImage().getScaledInstance(btn_four.getWidth()+10, btn_four.getHeight(), Image.SCALE_SMOOTH);
        i4 = new ImageIcon(image4);
        btn_four.setIcon(i4);
        
        ImageIcon i5 = new ImageIcon(getClass().getResource("images/5.png"));
        Image image5 = (i5).getImage().getScaledInstance(btn_five.getWidth()+10, btn_five.getHeight(), Image.SCALE_SMOOTH);
        i5 = new ImageIcon(image5);
        btn_five.setIcon(i5);
        
        ImageIcon i6 = new ImageIcon(getClass().getResource("images/6.png"));
        Image image6 = (i6).getImage().getScaledInstance(btn_six.getWidth()+10, btn_six.getHeight(), Image.SCALE_SMOOTH);
        i6 = new ImageIcon(image6);
        btn_six.setIcon(i6);
        
        ImageIcon i1 = new ImageIcon(getClass().getResource("images/1.png"));
        Image image1 = (i1).getImage().getScaledInstance(btn_one.getWidth()+10, btn_one.getHeight(), Image.SCALE_SMOOTH);
        i1 = new ImageIcon(image1);
        btn_one.setIcon(i1);
        
        ImageIcon i2 = new ImageIcon(getClass().getResource("images/2.png"));
        Image image2 = (i2).getImage().getScaledInstance(btn_two.getWidth()+10, btn_two.getHeight(), Image.SCALE_SMOOTH);
        i2 = new ImageIcon(image2);
        btn_two.setIcon(i2);
        
        ImageIcon i3 = new ImageIcon(getClass().getResource("images/3.png"));
        Image image3 = (i3).getImage().getScaledInstance(btn_three.getWidth()+10, btn_three.getHeight(), Image.SCALE_SMOOTH);
        i3 = new ImageIcon(image3);
        btn_three.setIcon(i3);
        
        ImageIcon iR = new ImageIcon(getClass().getResource("images/reset.png"));
        Image imageR = (iR).getImage().getScaledInstance(btn_reset.getWidth()+10, btn_reset.getHeight(), Image.SCALE_SMOOTH);
        iR = new ImageIcon(imageR);
        btn_reset.setIcon(iR);
        
        ImageIcon i0 = new ImageIcon(getClass().getResource("images/0.png"));
        Image image0 = (i0).getImage().getScaledInstance(btn_zero.getWidth()+10, btn_zero.getHeight(), Image.SCALE_SMOOTH);
        i0 = new ImageIcon(image0);
        btn_zero.setIcon(i0);
        
        ImageIcon iB = new ImageIcon(getClass().getResource("images/arrowleft.png"));
        Image imageB = (iB).getImage().getScaledInstance(btn_back.getWidth()+10, btn_back.getHeight(), Image.SCALE_SMOOTH);
        iB = new ImageIcon(imageB);
        btn_back.setIcon(iB);
        
        ImageIcon iR1 = new ImageIcon(getClass().getResource("images/resetpng.png"));
        Image imageR1 = (iR1).getImage().getScaledInstance(btn_reset_cardno.getWidth()-10, btn_reset_cardno.getHeight(), Image.SCALE_SMOOTH);
        iR1 = new ImageIcon(imageR1);
        btn_reset_cardno.setIcon(iR1);
        
        ImageIcon iR2 = new ImageIcon(getClass().getResource("images/resetpng.png"));
        Image imageR2 = (iR2).getImage().getScaledInstance(btn_reset_cardno1.getWidth()-10, btn_reset_cardno1.getHeight(), Image.SCALE_SMOOTH);
        iR2 = new ImageIcon(imageR2);
        btn_reset_cardno1.setIcon(iR2);
        
        ImageIcon iR3 = new ImageIcon(getClass().getResource("images/resetpng.png"));
        Image imageR3 = (iR3).getImage().getScaledInstance(btn_reset_cardno2.getWidth()-10, btn_reset_cardno2.getHeight(), Image.SCALE_SMOOTH);
        iR3 = new ImageIcon(imageR3);
        btn_reset_cardno2.setIcon(iR3);
        
        ImageIcon iR4 = new ImageIcon(getClass().getResource("images/resetpng.png"));
        Image imageR4 = (iR4).getImage().getScaledInstance(btn_reset_cardno3.getWidth()-10, btn_reset_cardno3.getHeight(), Image.SCALE_SMOOTH);
        iR4 = new ImageIcon(imageR4);
        btn_reset_cardno3.setIcon(iR4);
        
        ImageIcon i16 = new ImageIcon(getClass().getResource("images/16digit.png"));
        Image image16 = (i16).getImage().getScaledInstance(lbl_cardno.getWidth()-10, lbl_cardno.getHeight(), Image.SCALE_SMOOTH);
        i16 = new ImageIcon(image16);
        lbl_cardno.setIcon(i16);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        pnl_screen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_screen = new javax.swing.JLabel();
        pnl_keypad = new javax.swing.JPanel();
        btn_seven = new javax.swing.JButton();
        btn_eight = new javax.swing.JButton();
        btn_nine = new javax.swing.JButton();
        btn_four = new javax.swing.JButton();
        btn_five = new javax.swing.JButton();
        btn_six = new javax.swing.JButton();
        btn_one = new javax.swing.JButton();
        btn_two = new javax.swing.JButton();
        btn_three = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        lbl_keypad = new javax.swing.JLabel();
        pnl_cardno = new javax.swing.JPanel();
        lbl_cardno = new javax.swing.JLabel();
        btn_insert = new javax.swing.JButton();
        btn_reset_cardno = new javax.swing.JButton();
        btn_reset_cardno1 = new javax.swing.JButton();
        btn_reset_cardno2 = new javax.swing.JButton();
        btn_reset_cardno3 = new javax.swing.JButton();
        pass_cardno1 = new javax.swing.JPasswordField();
        pass_cardno2 = new javax.swing.JPasswordField();
        pass_cardno3 = new javax.swing.JPasswordField();
        pass_cardno4 = new javax.swing.JPasswordField();
        btn_resetall = new javax.swing.JButton();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM NA MALUPET");
        setPreferredSize(new java.awt.Dimension(1020, 1000));
        setSize(new java.awt.Dimension(1020, 1020));

        pnl_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_screen.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_screen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setEnabled(false);
        pnl_screen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 280, 90));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setEnabled(false);
        pnl_screen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 280, 90));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setEnabled(false);
        pnl_screen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 300, 90));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setEnabled(false);
        pnl_screen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 300, 90));

        lbl_screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/choose.png"))); // NOI18N
        pnl_screen.add(lbl_screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 975, 465));

        pnl_main.add(pnl_screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 470));

        pnl_keypad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        btn_seven.setText("7");
        pnl_keypad.add(btn_seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, 100));

        btn_eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        btn_eight.setText("8");
        pnl_keypad.add(btn_eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 100));

        btn_nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        btn_nine.setText("9");
        btn_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nineActionPerformed(evt);
            }
        });
        pnl_keypad.add(btn_nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 100));

        btn_four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        btn_four.setText("4");
        btn_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fourActionPerformed(evt);
            }
        });
        pnl_keypad.add(btn_four, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 110, 100));

        btn_five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        btn_five.setText("5");
        btn_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fiveActionPerformed(evt);
            }
        });
        pnl_keypad.add(btn_five, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 110, 100));

        btn_six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        btn_six.setText("6");
        btn_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sixActionPerformed(evt);
            }
        });
        pnl_keypad.add(btn_six, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 110, 100));

        btn_one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        btn_one.setText("1");
        pnl_keypad.add(btn_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, 100));

        btn_two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        btn_two.setText("2");
        pnl_keypad.add(btn_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, 100));

        btn_three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        btn_three.setText("3");
        btn_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_threeActionPerformed(evt);
            }
        });
        pnl_keypad.add(btn_three, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 110, 100));

        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        pnl_keypad.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 110, 100));

        btn_zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        btn_zero.setText("0");
        pnl_keypad.add(btn_zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 110, 100));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowleft.png"))); // NOI18N
        btn_back.setText("<----");
        pnl_keypad.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 110, 100));

        lbl_keypad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BlueBG_cust.png"))); // NOI18N
        lbl_keypad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_keypad.add(lbl_keypad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pnl_main.add(pnl_keypad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 630, 450));

        pnl_cardno.setBackground(new java.awt.Color(153, 153, 153));
        pnl_cardno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_cardno.setFont(new java.awt.Font("SimSun-ExtB", 1, 16)); // NOI18N
        lbl_cardno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16digit.png"))); // NOI18N
        lbl_cardno.setText("ENTER YOUR 16-DIGITS CARD NUMBER");

        btn_insert.setBackground(new java.awt.Color(153, 153, 153));
        btn_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert.png"))); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.setBorder(null);
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_reset_cardno.setBackground(new java.awt.Color(153, 153, 153));
        btn_reset_cardno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resetpng.png"))); // NOI18N
        btn_reset_cardno.setText("     ");
        btn_reset_cardno.setBorder(null);

        btn_reset_cardno1.setBackground(new java.awt.Color(153, 153, 153));
        btn_reset_cardno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resetpng.png"))); // NOI18N
        btn_reset_cardno1.setText("R");
        btn_reset_cardno1.setBorder(null);

        btn_reset_cardno2.setBackground(new java.awt.Color(153, 153, 153));
        btn_reset_cardno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resetpng.png"))); // NOI18N
        btn_reset_cardno2.setText("R");
        btn_reset_cardno2.setBorder(null);
        btn_reset_cardno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset_cardno2ActionPerformed(evt);
            }
        });

        btn_reset_cardno3.setBackground(new java.awt.Color(153, 153, 153));
        btn_reset_cardno3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resetpng.png"))); // NOI18N
        btn_reset_cardno3.setText("R");
        btn_reset_cardno3.setBorder(null);

        pass_cardno1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_cardno1.setText("jPasswordField1");

        pass_cardno2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_cardno2.setText("jPasswordField1");
        pass_cardno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_cardno2ActionPerformed(evt);
            }
        });

        pass_cardno3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_cardno3.setText("jPasswordField1");

        pass_cardno4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_cardno4.setText("jPasswordField1");

        btn_resetall.setBackground(new java.awt.Color(153, 153, 153));
        btn_resetall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resetAll.png"))); // NOI18N
        btn_resetall.setText("RESET ALL");
        btn_resetall.setBorder(null);

        javax.swing.GroupLayout pnl_cardnoLayout = new javax.swing.GroupLayout(pnl_cardno);
        pnl_cardno.setLayout(pnl_cardnoLayout);
        pnl_cardnoLayout.setHorizontalGroup(
            pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cardnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cardnoLayout.createSequentialGroup()
                        .addComponent(pass_cardno1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset_cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_cardnoLayout.createSequentialGroup()
                        .addComponent(pass_cardno2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset_cardno1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_cardnoLayout.createSequentialGroup()
                        .addComponent(pass_cardno3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset_cardno2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_cardnoLayout.createSequentialGroup()
                        .addComponent(pass_cardno4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset_cardno3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_cardnoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_resetall, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        pnl_cardnoLayout.setVerticalGroup(
            pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cardnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_cardno1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset_cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_cardno2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset_cardno1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_cardno3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset_cardno2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_reset_cardno3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_cardno4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_cardnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_resetall, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_main.add(pnl_cardno, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 340, 450));

        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BlueBG_cust.png"))); // NOI18N
        pnl_main.add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 1100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, 955, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_fourActionPerformed

    private void btn_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sixActionPerformed

    private void btn_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nineActionPerformed

    private void btn_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_fiveActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_threeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_threeActionPerformed

    private void btn_reset_cardno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset_cardno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reset_cardno2ActionPerformed

    private void pass_cardno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_cardno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_cardno2ActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        int response;

        String cardno1 = pass_cardno1.getText();
        String cardno2 = pass_cardno2.getText();
        String cardno3 = pass_cardno3.getText();
        String cardno4 = pass_cardno4.getText();
        
        String cardnumber = cardno1 + "-" + cardno2 + "-" + cardno3 + "-" + cardno4;
        
        if((cardno1.length() == 4) && (cardno2.length() == 4) && (cardno3.length() == 4) && (cardno4.length() == 4)){
            
            response = JOptionPane.showConfirmDialog(this, cardnumber, "  Are you sure?", JOptionPane.YES_NO_OPTION);
            
            if(response == JOptionPane.YES_OPTION){
                ImageIcon iOP = new ImageIcon(getClass().getResource("images/choose.png"));
                Image imageOP = (iOP).getImage().getScaledInstance(lbl_screen.getWidth(), lbl_screen.getHeight(), Image.SCALE_SMOOTH);
                iOP = new ImageIcon(imageOP);
                lbl_screen.setIcon(iOP);
                
                
            }
        
        }else{
            JOptionPane.showMessageDialog(this, " Card number consists of 16 numbers.\n Please enter 4 numbers each text field.", "  Wrong Input!", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_btn_insertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Connection myconObj = null;
        Statement mystatObj = null;
        ResultSet myresObj = null;
        String query = "Select * from ATM Database.AccountDetails";
        
        try{
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/ATM Database", "group3", "1234qwer");
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery ("");
            
            int id = myresObj.getInt("ID");
            String accountName = myresObj.getString("AccountName");
            int accountNumber = myresObj.getInt("AccountNumber");
            int pincode = myresObj.getInt("Pincode");
            int balance = myresObj.getInt("Balance");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    
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
            java.util.logging.Logger.getLogger(TitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitlePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_eight;
    private javax.swing.JButton btn_five;
    private javax.swing.JButton btn_four;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_nine;
    private javax.swing.JButton btn_one;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_reset_cardno;
    private javax.swing.JButton btn_reset_cardno1;
    private javax.swing.JButton btn_reset_cardno2;
    private javax.swing.JButton btn_reset_cardno3;
    private javax.swing.JButton btn_resetall;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_six;
    private javax.swing.JButton btn_three;
    private javax.swing.JButton btn_two;
    private javax.swing.JButton btn_zero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_cardno;
    private javax.swing.JLabel lbl_keypad;
    private javax.swing.JLabel lbl_screen;
    private javax.swing.JPasswordField pass_cardno1;
    private javax.swing.JPasswordField pass_cardno2;
    private javax.swing.JPasswordField pass_cardno3;
    private javax.swing.JPasswordField pass_cardno4;
    private javax.swing.JPanel pnl_cardno;
    private javax.swing.JPanel pnl_keypad;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JPanel pnl_screen;
    // End of variables declaration//GEN-END:variables
}
