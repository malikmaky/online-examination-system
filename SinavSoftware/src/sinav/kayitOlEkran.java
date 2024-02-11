/*
 * 
 * 
 */
package sinav;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *
 * @author Malik
 */
public class kayitOlEkran extends javax.swing.JFrame {
    
    boolean kullaniciAdiDogruMu ;
    boolean ogrenciNoDogruMu ;
    boolean adiDogruMu ;
    boolean soyAdiDogruMu ;
    boolean sifreDogruMu ;
    
    /**
     * Creates new form kayitOlEkran
     */
    public kayitOlEkran() {
        kullaniciAdiDogruMu = false ;
        ogrenciNoDogruMu = false ;
        adiDogruMu = false;
        soyAdiDogruMu = false ;
        sifreDogruMu = false ;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabelField = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        sifreLabelField = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cikmakEminMiJFrame = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        metinLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kayitOlButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BannerPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        usernameLabelField1 = new javax.swing.JLabel();
        kullaniciAdiTextField1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        ogrenciNoLabelField = new javax.swing.JLabel();
        ogrenciNoTextField1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        adiTextField2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soyAdiTextField1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        sifreLabelField1 = new javax.swing.JLabel();
        sifreField2 = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        kullaniciAdiDurumLabel = new javax.swing.JLabel();
        ogrenciNoDurumLabel = new javax.swing.JLabel();
        sifreDurumLabel = new javax.swing.JLabel();
        soyAdiDurumLabel = new javax.swing.JLabel();
        adiDurumLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        usernameLabelField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabelField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabelField.setText("Kullanıcı Adı :");

        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField.setToolTipText("Kullanıcı Adı Veya Öğrenci Numarası Burada Giriniz.");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        sifreLabelField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sifreLabelField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreLabelField.setText("Şifre :");

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Fırat 1.jpg"))); // NOI18N

        jButton1.setText("Giriş Yap");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kayıt Ol");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cikmakEminMiJFrame.setUndecorated(true);
        cikmakEminMiJFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        metinLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 24)); // NOI18N
        metinLabel.setForeground(new java.awt.Color(0, 0, 0));
        metinLabel.setText("Ana Ekrana Dönmek İstediğinizden Emin Misiniz ?");
        jPanel4.add(metinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(155, 32, 70));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dosis ExtraBold", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Evet");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 30));

        jPanel7.setBackground(new java.awt.Color(155, 32, 70));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dosis ExtraBold", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hayır !");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, 30));

        cikmakEminMiJFrame.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 170));

        jPanel6.setBackground(new java.awt.Color(155, 32, 70));
        cikmakEminMiJFrame.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Olma Ekranı");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Fırat 1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        kayitOlButton4.setText("Kayıt Ol");
        kayitOlButton4.setToolTipText("Kayıt Olmak İçin Buraya Tıkla");
        kayitOlButton4.setBackground(Color.white);
        kayitOlButton4.setBorder(null);
        kayitOlButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kayitOlButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kayitOlButton4MouseReleased(evt);
            }
        });
        kayitOlButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(kayitOlButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 90, 25));

        jPanel2.setBackground(new java.awt.Color(37, 37, 37));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minLabel.setBackground(new java.awt.Color(187, 187, 187));
        minLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 60)); // NOI18N
        minLabel.setForeground(new java.awt.Color(255, 255, 255));
        minLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLabel.setText("-");
        minLabel.setToolTipText("Sekmeyi Sakla.");
        minLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });
        jPanel2.add(minLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        closeLabel.setBackground(new java.awt.Color(187, 187, 187));
        closeLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 36)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setToolTipText("Sekmeyi Kapat.");
        closeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        jPanel2.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BannerPanel.setBackground(new java.awt.Color(155, 32, 70));
        jPanel1.add(BannerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 20));

        jLabel5.setFont(new java.awt.Font("Dosis ExtraBold", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Kayıt Ol");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        usernameLabelField1.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        usernameLabelField1.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabelField1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLabelField1.setText("Kullanıcı Adı :");
        jPanel1.add(usernameLabelField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, -1));

        kullaniciAdiTextField1.setBackground(new java.awt.Color(225, 225, 225));
        kullaniciAdiTextField1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        kullaniciAdiTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        kullaniciAdiTextField1.setToolTipText("Öğrenci Numaranızı Buraya Giriniz.");
        kullaniciAdiTextField1.setBorder(null);
        kullaniciAdiTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciAdiTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(kullaniciAdiTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 260, 20));

        ogrenciNoLabelField.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        ogrenciNoLabelField.setForeground(new java.awt.Color(0, 0, 0));
        ogrenciNoLabelField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ogrenciNoLabelField.setText("Öğrenci Numarası :");
        jPanel1.add(ogrenciNoLabelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, -1));

        ogrenciNoTextField1.setBackground(new java.awt.Color(225, 225, 225));
        ogrenciNoTextField1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ogrenciNoTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ogrenciNoTextField1.setToolTipText("Öğrenci Numaranızı Buraya Giriniz.");
        ogrenciNoTextField1.setBorder(null);
        jPanel1.add(ogrenciNoTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, 10));

        jLabel3.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Adı :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, -1));

        adiTextField2.setBackground(new java.awt.Color(225, 225, 225));
        adiTextField2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        adiTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        adiTextField2.setToolTipText("Adınızı Buraya Giriniz.");
        adiTextField2.setBorder(null);
        jPanel1.add(adiTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 260, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 20));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fırat Üniversitesi @ 2022");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 200, 30));

        jLabel4.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Soyadı :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, -1));

        soyAdiTextField1.setBackground(new java.awt.Color(225, 225, 225));
        soyAdiTextField1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        soyAdiTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        soyAdiTextField1.setToolTipText("Soyadınızı Buraya Giriniz.");
        soyAdiTextField1.setBorder(null);
        jPanel1.add(soyAdiTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 260, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 20));

        sifreLabelField1.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        sifreLabelField1.setForeground(new java.awt.Color(0, 0, 0));
        sifreLabelField1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sifreLabelField1.setText("Şifre :");
        jPanel1.add(sifreLabelField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, -1));

        sifreField2.setBackground(new java.awt.Color(225, 225, 225));
        sifreField2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        sifreField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sifreField2.setToolTipText("Şifrenizi Buraya Giriniz.");
        sifreField2.setBorder(null);
        jPanel1.add(sifreField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 220, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 20));

        jPanel3.setBackground(new java.awt.Color(155, 32, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Kayıt Ol");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 90, 25));

        kullaniciAdiDurumLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Dogru.png"))); // NOI18N
        kullaniciAdiDurumLabel.setVisible(false);
        jPanel1.add(kullaniciAdiDurumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        ogrenciNoDurumLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Dogru.png"))); // NOI18N
        ogrenciNoDurumLabel.setVisible(false);
        ogrenciNoDurumLabel.setToolTipText("");
        jPanel1.add(ogrenciNoDurumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        sifreDurumLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Dogru.png"))); // NOI18N
        sifreDurumLabel.setVisible(false);
        jPanel1.add(sifreDurumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        soyAdiDurumLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Dogru.png"))); // NOI18N
        soyAdiDurumLabel.setVisible(false);
        jPanel1.add(soyAdiDurumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        adiDurumLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Dogru.png"))); // NOI18N
        adiDurumLabel.setVisible(false);
        jPanel1.add(adiDurumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 282, 30, 20));

        jButton3.setBackground(new java.awt.Color(225, 225, 225));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/Eyes.png"))); // NOI18N
        jButton3.setToolTipText("Şifreyi Göster.");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 30, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/Ok 2.png"))); // NOI18N
        jLabel8.setToolTipText("Ana Ekrana Dön.");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 35, 35));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 340, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private static boolean numaraVarMı(String x){
    //Parametre olarak girilen stringte rakam var olup olmadığını bulan method
        
    for(int i = 0 ; i < x.length(); i++ ){
        if(x.charAt(i) >= 48 && x.charAt(i)<= 57){
            return true;
        }
    }
    return false ;
}
    
    private static boolean harflerMi(String x){
        //Parametre olarak girilen string sadece Ingilizce harfler içerip içermediğini bulan method
        
       for(int i = 0 ; i < x.length(); i++ ){
        if((x.charAt(i) >= 65 && x.charAt(i)<= 90) || (x.charAt(i) >= 97 && x.charAt(i)<= 122)){
        } else{
            return false ;
        }
     }
            return true;
    }
    
    public static boolean ogrenciNoVarMı(String x) throws IOException{
        //Parametre olarak girilen Öğrenci Numara kayıtlı olup olmadığını bulan method
        
        logInMenu lin = new logInMenu();
        
        for(int i = 0 ; i<lin.ogrenciler.length ; i++ ){
            if(x.trim().equals(lin.ogrenciler[i].getOgrenciNo())){
                return true ;
            }
        }
        return false ;
    }

    public static boolean kullaniciAdiVarMı(String x) throws IOException{
       //Parametre olarak girilen Kullanıcı Adı kayıtlı olup olmadığını bulan method

        logInMenu lin = new logInMenu();
        
        for(int i = 0 ; i<lin.ogrenciler.length ; i++ ){
            if(x.trim().equals(lin.ogrenciler[i].getKullaniciAdi())){
                return true ;
            }
        }
        return false ;
    }
    
    private void kayitOlButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButton4ActionPerformed
     //Kayıt Ol sayfadaki textField ve passwordField şartlar
        
        ImageIcon Dogru = new ImageIcon(Paths.get("").toAbsolutePath().toString()+"\\src\\resimler\\Dogru.png") ;
        ImageIcon Yanlis = new ImageIcon(Paths.get("").toAbsolutePath().toString()+"\\src\\resimler\\Yanlis.png") ;
        
        
        if(kullaniciAdiTextField1.getText().trim().length()>0){
            try {
                if(!kullaniciAdiVarMı(kullaniciAdiTextField1.getText().trim())){
                    kullaniciAdiDurumLabel.setIcon(Dogru);
                    kullaniciAdiDurumLabel.setVisible(true);
                    kullaniciAdiDogruMu = true;
                }else{
                    kullaniciAdiDurumLabel.setIcon(Yanlis);
            kullaniciAdiDurumLabel.setToolTipText("Girdiğiniz Kullanıcı Adı Zaten Kayıtlı.");
                    kullaniciAdiDurumLabel.setVisible(true);
                    kullaniciAdiDogruMu = false; 
                }
            } catch (IOException ex) {
                Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            kullaniciAdiDurumLabel.setIcon(Yanlis);
            kullaniciAdiDogruMu = false;
            kullaniciAdiDurumLabel.setToolTipText("Girdiğiniz İfade Geçersiz.");
            kullaniciAdiDurumLabel.setVisible(true);
        }
        
        if(ogrenciNoTextField1.getText().trim().length()>0 && numaraMı(ogrenciNoTextField1.getText().trim())){
            try {
                if(!ogrenciNoVarMı(ogrenciNoTextField1.getText().trim())){ 
                    ogrenciNoDurumLabel.setIcon(Dogru);
                    ogrenciNoDurumLabel.setVisible(true);
                    ogrenciNoDogruMu = true ;
                }else{
                    ogrenciNoDurumLabel.setIcon(Yanlis);
                    ogrenciNoDurumLabel.setToolTipText("Girdiğiniz Öğrenci Numara Zaten Kayıtlı.");
                    ogrenciNoDurumLabel.setVisible(true);
                    ogrenciNoDogruMu = false ;
                }
            } catch (IOException ex) {
                Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                    ogrenciNoDurumLabel.setIcon(Yanlis);
                    ogrenciNoDurumLabel.setToolTipText("Gireceğiniz İfade Sadece Rakamlar İçermelidir.");
                    ogrenciNoDurumLabel.setVisible(true);
                    ogrenciNoDogruMu = false ;
        }
        
        if(adiTextField2.getText().trim().length()>0 && harflerMi(adiTextField2.getText().trim())){
                      adiDurumLabel.setIcon(Dogru);
                      adiDurumLabel.setVisible(true);
                           adiDogruMu = true ;
        }else{
                       adiDurumLabel.setIcon(Yanlis);
                       adiDurumLabel.setToolTipText("Gireceğiniz İfade Rakamlar Ve Özel Harfler İçermemelidir.");
                       adiDurumLabel.setVisible(true);
                       adiDogruMu = false ;
        }
        
        if(soyAdiTextField1.getText().trim().length() > 0 && harflerMi(soyAdiTextField1.getText().trim())){
                     soyAdiDurumLabel.setIcon(Dogru);
                     soyAdiDurumLabel.setVisible(true);
                     soyAdiDogruMu = true ;
        }else{
                     soyAdiDurumLabel.setIcon(Yanlis);
                     soyAdiDurumLabel.setToolTipText("Gireceğiniz İfade Rakamlar Ve Özel Harfler İçermemelidir.");
                     soyAdiDurumLabel.setVisible(true);
                     soyAdiDogruMu= false;
        }
        
        if(sifreGetir(sifreField2).trim().length()>0 && !sifreGetir(sifreField2).trim().contains(" ")){
                      sifreDurumLabel.setIcon(Dogru);
                      sifreDurumLabel.setVisible(true);
                     sifreDogruMu = true ;  
        }else{
                      sifreDurumLabel.setIcon(Yanlis);
                      sifreDurumLabel.setToolTipText("Girdiğiniz İfade Geçersiz."); 
                      sifreDurumLabel.setVisible(true);
                      sifreDogruMu = false ;  
        }

        
        
        if(kullaniciAdiDogruMu && ogrenciNoDogruMu && adiDogruMu && soyAdiDogruMu && sifreDogruMu ){
                
        Ogrenci o = new Ogrenci(kullaniciAdiTextField1.getText().trim() , ogrenciNoTextField1.getText().trim(), adiTextField2.getText().trim(), soyAdiTextField1.getText().trim(), sifreGetir(sifreField2).trim());
        try {
            o.ogrenciEkle();
        } catch (IOException ex) {
            Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        this.dispose();
         logInMenu lim = new logInMenu();
         lim.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_kayitOlButton4ActionPerformed

    private void kayitOlButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayitOlButton4MousePressed
       kayitOlButton4.setBackground(new Color(155, 30, 72));
    }//GEN-LAST:event_kayitOlButton4MousePressed

    private void kayitOlButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayitOlButton4MouseReleased
       kayitOlButton4.setBackground(Color.white);
    }//GEN-LAST:event_kayitOlButton4MouseReleased

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
          //Kayıt Ol sayfadaki textField ve passwordField şartlar
             
        ImageIcon Dogru = new ImageIcon("src\\resimler\\Dogru.png") ;
        ImageIcon Yanlis = new ImageIcon("src\\resimler\\Yanlis.png") ;
        
        
        if(kullaniciAdiTextField1.getText().trim().length()>0){
            try {
                if(!kullaniciAdiVarMı(kullaniciAdiTextField1.getText().trim())){
                    kullaniciAdiDurumLabel.setIcon(Dogru);
                    kullaniciAdiDurumLabel.setVisible(true);
                    kullaniciAdiDogruMu = true;
                }else{
                    kullaniciAdiDurumLabel.setIcon(Yanlis);
            kullaniciAdiDurumLabel.setToolTipText("Girdiğiniz Kullanıcı Adı Kullanılıyor.");
                    kullaniciAdiDurumLabel.setVisible(true);
                    kullaniciAdiDogruMu = false; 
                }
            } catch (IOException ex) {
                Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            kullaniciAdiDurumLabel.setIcon(Yanlis);
            kullaniciAdiDogruMu = false;
            kullaniciAdiDurumLabel.setToolTipText("Girdiğiniz İfade Geçersiz.");
            kullaniciAdiDurumLabel.setVisible(true);
        }
        
        if(ogrenciNoTextField1.getText().trim().length()>0 && numaraMı(ogrenciNoTextField1.getText().trim())){
            try {
                if(!ogrenciNoVarMı(ogrenciNoTextField1.getText().trim())){ 
                    ogrenciNoDurumLabel.setIcon(Dogru);
                    ogrenciNoDurumLabel.setVisible(true);
                    ogrenciNoDogruMu = true ;
                }else{
                    ogrenciNoDurumLabel.setIcon(Yanlis);
                    ogrenciNoDurumLabel.setToolTipText("Girdiğiniz Öğrenci Numarası Kullanılıyor.");
                    ogrenciNoDurumLabel.setVisible(true);
                    ogrenciNoDogruMu = false ;
                }
            } catch (IOException ex) {
                Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                    ogrenciNoDurumLabel.setIcon(Yanlis);
                    ogrenciNoDurumLabel.setToolTipText("Gireceğiniz İfade Sadece Rakam İçermelidir.");
                    ogrenciNoDurumLabel.setVisible(true);
                    ogrenciNoDogruMu = false ;
        }
        
        if(adiTextField2.getText().trim().length()>0 && harflerMi(adiTextField2.getText().trim())){
                      adiDurumLabel.setIcon(Dogru);
                      adiDurumLabel.setVisible(true);
                           adiDogruMu = true ;
        }else{
                       adiDurumLabel.setIcon(Yanlis);
                       adiDurumLabel.setToolTipText("Gireceğiniz İfade Rakam Ve Özel Harf İçermemelidir.");
                       adiDurumLabel.setVisible(true);
                       adiDogruMu = false ;
        }
        
        if(soyAdiTextField1.getText().trim().length() > 0 && harflerMi(soyAdiTextField1.getText().trim())){
                     soyAdiDurumLabel.setIcon(Dogru);
                     soyAdiDurumLabel.setVisible(true);
                     soyAdiDogruMu = true ;
        }else{
                     soyAdiDurumLabel.setIcon(Yanlis);
                     soyAdiDurumLabel.setToolTipText("Gireceğiniz İfade Rakam Ve Özel Harf İçermemelidir.");
                     soyAdiDurumLabel.setVisible(true);
                     soyAdiDogruMu= false;
        }
        
        if(sifreGetir(sifreField2).trim().length()>0 && !sifreGetir(sifreField2).contains(" ")){
                      sifreDurumLabel.setIcon(Dogru);
                      sifreDurumLabel.setVisible(true);
                     sifreDogruMu = true ;  
        }else{
                      sifreDurumLabel.setIcon(Yanlis);
                      sifreDurumLabel.setToolTipText("Gireceğiniz İfade Boşluk İçermemelidir."); 
                      sifreDurumLabel.setVisible(true);
                      sifreDogruMu = false ;  
        }

        
        if(kullaniciAdiDogruMu && ogrenciNoDogruMu && adiDogruMu && soyAdiDogruMu && sifreDogruMu ){
                
        Ogrenci o = new Ogrenci(kullaniciAdiTextField1.getText().trim() , ogrenciNoTextField1.getText().trim(), adiTextField2.getText().trim(), soyAdiTextField1.getText().trim(), sifreGetir(sifreField2));
        try {
            o.ogrenciEkle();
        } catch (IOException ex) {
            Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        this.dispose();
         logInMenu lim = new logInMenu();
         lim.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        //şifreyi gösterir
        sifreField2.setEchoChar((char)0);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        // şifreyi yine saklamak için
        sifreField2.setEchoChar('*');
    }//GEN-LAST:event_jButton3MouseReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        //Çıkmak istediğinizden emin ... JFrame formu açar
        this.cikmakEminMiJFrame.setSize(600, 200);
        this.cikmakEminMiJFrame.setLocationRelativeTo(null);
        this.cikmakEminMiJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cikmakEminMiJFrame.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.cikmakEminMiJFrame.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.cikmakEminMiJFrame.dispose();
       this.dispose();
        try {
            logInMenu lim = new logInMenu();
            lim.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(kayitOlEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jLabel10MouseClicked

    private void kullaniciAdiTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciAdiTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciAdiTextField1ActionPerformed
    
    public static String sifreGetir(JPasswordField t){
   //JPasswordField'ten şifreyi getiren method 

        char[] harf = t.getPassword();
         String sifre = "" ;
         for(char c : harf){
             sifre+=c;
         }
         
         return sifre;
    }

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
            java.util.logging.Logger.getLogger(kayitOlEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayitOlEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayitOlEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayitOlEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayitOlEkran().setVisible(true);
            }
        });
    }
    
    private static boolean numaraMı(String x){
    //Parametre olarak girilen string sadece rakamlar olup olmadığını bulan method
        
    for(int i = 0 ; i < x.length(); i++ ){
        if(x.charAt(i) >= 48 && x.charAt(i)<= 57){
        }else{
            return false;
        }
    }
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BannerPanel;
    private javax.swing.JLabel adiDurumLabel;
    private javax.swing.JTextField adiTextField2;
    private javax.swing.JFrame cikmakEminMiJFrame;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton kayitOlButton4;
    private javax.swing.JLabel kullaniciAdiDurumLabel;
    private javax.swing.JTextField kullaniciAdiTextField1;
    private javax.swing.JLabel metinLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel ogrenciNoDurumLabel;
    private javax.swing.JLabel ogrenciNoLabelField;
    private javax.swing.JTextField ogrenciNoTextField1;
    private javax.swing.JLabel sifreDurumLabel;
    private javax.swing.JPasswordField sifreField2;
    private javax.swing.JLabel sifreLabelField;
    private javax.swing.JLabel sifreLabelField1;
    private javax.swing.JLabel soyAdiDurumLabel;
    private javax.swing.JTextField soyAdiTextField1;
    private javax.swing.JLabel usernameLabelField;
    private javax.swing.JLabel usernameLabelField1;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
