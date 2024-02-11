/*
 * 
 * 
 */
package sinav;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *  
 * @author Malik
 */
public class logInMenu extends javax.swing.JFrame {
    
  public static Ogrenci[] ogrenciler ;

  public logInMenu() throws IOException {
        initComponents();
        ogrenciler = new Ogrenci[ogrenciSayi()];
        ogrenciYukle();
        setLocationRelativeTo(null);
    }

public static boolean kullaniciAdiVarMı(String x) throws IOException{
    //Kayıtlarda parametrede girilen Kullanıcı Adı kullanılıp kullanılmadığı öğrenmek için  
    
    
        for(int i = 0 ; i<ogrenciler.length ; i++ ){
            if(x.trim().equals(ogrenciler[i].getKullaniciAdi())){
                return true ;
            }
        }
        return false ;
    }

public static boolean ogrenciNoVarMı(String x) throws IOException{
    //Kayıtlarda parametrede girilen Öğrenci Numarası kullanılıp kullanılmadığı öğrenmek için  
    
        for(int i = 0 ; i<ogrenciler.length ; i++ ){
            if(x.trim().equals(ogrenciler[i].getOgrenciNo())){
                return true ;
            }
        }
        return false ;
    }

public static int indeksGetirOgrenciNo(String x){
    // Parametrede girilen Öğrenci Numarasının kayıtlardaki indeksi bulmak için
    
    for(int i = 0 ; i<ogrenciler.length ; i++ ){
            if(x.trim().equals(ogrenciler[i].getOgrenciNo())){
                return i ;
            }
        }
        return -1 ;
    }
    
public static int indeksGetirKullaniciAdi(String x){
     // Parametrede girilen Kullanıcı Adının kayıtlardaki indeksi bulmak için
    
    for(int i = 0 ; i<ogrenciler.length ; i++ ){
            if(x.trim().equals(ogrenciler[i].getKullaniciAdi())){
                return i ;
            }
        }
        return -1 ;
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BakcgroundPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        BannerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameLabelField1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        usernameTextField = new javax.swing.JTextField();
        sifreLabelField = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        uyarLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Yapma Ekranı");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BakcgroundPanel.setBackground(new java.awt.Color(37, 37, 37));
        BakcgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(225, 225, 225));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BannerPanel.setBackground(new java.awt.Color(155, 32, 70));
        mainPanel.add(BannerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 20));

        jLabel2.setFont(new java.awt.Font("Dosis ExtraBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Giriş Yap");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        usernameLabelField1.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        usernameLabelField1.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabelField1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabelField1.setText("Kullanıcı Adı :");
        mainPanel.add(usernameLabelField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 89, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        mainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 10));

        usernameTextField.setBackground(new java.awt.Color(225, 225, 225));
        usernameTextField.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameTextField.setToolTipText("Kullanıcı Adınızı Veya Öğrenci Numaranızı Buraya Giriniz.");
        usernameTextField.setBorder(null);
        mainPanel.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 20));

        sifreLabelField.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        sifreLabelField.setForeground(new java.awt.Color(0, 0, 0));
        sifreLabelField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreLabelField.setText("Şifre :");
        mainPanel.add(sifreLabelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, -1));

        jPasswordField1.setBackground(new java.awt.Color(225, 225, 225));
        jPasswordField1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setToolTipText("Şifrenizi Buraya Giriniz.");
        jPasswordField1.setBorder(null);
        mainPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        mainPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 10));

        jButton1.setBackground(new java.awt.Color(225, 225, 225));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/Eyes.png"))); // NOI18N
        jButton1.setToolTipText("Şifreyi Göster.");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 30, 26));

        uyarLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 12)); // NOI18N
        uyarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainPanel.add(uyarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 20));

        jPanel1.setBackground(new java.awt.Color(155, 32, 70));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(187, 187, 187));
        jLabel3.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Giriş Yap");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 90, 25));

        jPanel2.setBackground(new java.awt.Color(155, 32, 70));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kayıt Ol");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        mainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 90, 25));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fırat Üniversitesi @ 2022");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 200, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/FÜUSS.png"))); // NOI18N
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 100));

        BakcgroundPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 340, 460));

        minLabel.setBackground(new java.awt.Color(187, 187, 187));
        minLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 60)); // NOI18N
        minLabel.setForeground(new java.awt.Color(255, 255, 255));
        minLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLabel.setText("-");
        minLabel.setToolTipText("Sekmeyi Sakla.");
        minLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        minLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });
        BakcgroundPanel.add(minLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        closeLabel.setBackground(new java.awt.Color(187, 187, 187));
        closeLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 36)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setToolTipText("Sekmeyi Kapat.");
        closeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        BakcgroundPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BakcgroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        getContentPane().add(BakcgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
     jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
     jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jButton1MouseReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 try {
          if(kullaniciAdiVarMı(usernameTextField.getText())){
              if(sifreDogruMu(indeksGetirKullaniciAdi(usernameTextField.getText()), sifreGetir(jPasswordField1))){
                  Thread.sleep(750);
                  this.dispose();
                  sinavArayuz sa = new sinavArayuz();
                  sa.sinavaGirecekOgrenci = new Ogrenci(ogrenciler[indeksGetirKullaniciAdi(usernameTextField.getText())].getKullaniciAdi(), ogrenciler[indeksGetirKullaniciAdi(usernameTextField.getText())].getOgrenciNo(), ogrenciler[indeksGetirKullaniciAdi(usernameTextField.getText())].getAdi(), ogrenciler[indeksGetirKullaniciAdi(usernameTextField.getText())].getSoyAdi(),ogrenciler[indeksGetirKullaniciAdi(usernameTextField.getText())].getSifre() ,ogrenciler[indeksGetirKullaniciAdi(usernameTextField.getText())].getPuan());
                  sa.adiVeSoyAdiLabel.setText("Öğrenci Adı Soyadı : "+sa.sinavaGirecekOgrenci.getAdi()+" "+sa.sinavaGirecekOgrenci.getSoyAdi());
                  sa.ogrenciNoLabel.setText("Öğrenci Numarası : "+sa.sinavaGirecekOgrenci.getOgrenciNo());
                  sa.ogrenciGirdiMiLabel.setText("Öğrenci Sınavı Girdi ve Bitirdi Mi : "+((sa.sinavaGirecekOgrenci.getPuan()>=0) ? "Evet" : "Hayır"));
                  if(sa.ogrenciGirdiMiLabel.getText().contains("Evet")){
                      sa.sinavBaslatLabel.setText("Ana Ekrana Dön");
                      sa.uyarLabel.setForeground(Color.red);
                      sa.uyarLabel.setText("Sınava Önceden Girdiğiniz İçin Artık Giremiyorsunuz. Aşağdaki Butona Tıklayarak Ana Ekrana Dönebilirisiniz.");
                  }else{
                      sa.sinavBaslatLabel.setText("Sınavı Başlat");
                      sa.uyarLabel.setText("");
                  }
                  sa.baslat.setSize(800,600);
                  sa.baslat.setLocationRelativeTo(null);
                  sa.baslat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  sa.baslat.setVisible(true);
              }else{
                  uyarLabel.setForeground(Color.red);
                 uyarLabel.setText("Girdiğiniz Kullanıcı Adı/Öğrenci Numarası Veya Şifre Yanlıştır.");
              }
              
          }else if (ogrenciNoVarMı(usernameTextField.getText())){
              if(sifreDogruMu(indeksGetirOgrenciNo(usernameTextField.getText()), sifreGetir(jPasswordField1))){
                  Thread.sleep(750);
                  this.dispose();
                  sinavArayuz sa = new sinavArayuz();
                  sa.sinavaGirecekOgrenci = new Ogrenci(ogrenciler[indeksGetirOgrenciNo(usernameTextField.getText())].getKullaniciAdi(), ogrenciler[indeksGetirOgrenciNo(usernameTextField.getText())].getOgrenciNo(), ogrenciler[indeksGetirOgrenciNo(usernameTextField.getText())].getAdi(), ogrenciler[indeksGetirOgrenciNo(usernameTextField.getText())].getSoyAdi(),ogrenciler[indeksGetirOgrenciNo(usernameTextField.getText())].getSifre() ,ogrenciler[indeksGetirOgrenciNo(usernameTextField.getText())].getPuan());
                  sa.adiVeSoyAdiLabel.setText("Öğrenci Adı Soyadı : "+sa.sinavaGirecekOgrenci.getAdi()+" "+sa.sinavaGirecekOgrenci.getSoyAdi());
                  sa.ogrenciNoLabel.setText("Öğrenci Numarası : "+sa.sinavaGirecekOgrenci.getOgrenciNo());
                  sa.ogrenciGirdiMiLabel.setText("Öğrenci Sınavı Girdi ve Bitirdi Mi : "+((sa.sinavaGirecekOgrenci.getPuan()>=0) ? "Evet" : "Hayır"));
                  if(sa.ogrenciGirdiMiLabel.getText().contains("Evet")){
                      sa.sinavBaslatLabel.setText("Ana Ekrana Dön");
                      sa.uyarLabel.setForeground(Color.red);
                      sa.uyarLabel.setText("Sınava Önceden Girdiğiniz İçin Artık Giremiyorsunuz. Aşağdaki Butona Tıklayarak Ana Ekrana Dönebilirisiniz.");
                  }else{
                      sa.sinavBaslatLabel.setText("Sınavı Başlat");
                      sa.uyarLabel.setText("");
                  }
                  sa.baslat.setSize(800,600);
                  sa.baslat.setLocationRelativeTo(null);
                  sa.baslat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  sa.baslat.setVisible(true);
              }else{
                  uyarLabel.setForeground(Color.red);
                  uyarLabel.setText("Girdiğiniz Kullanıcı Adı/Öğrenci Numara Veya Şifre Yanlıştır.");   
              }
          }else{
              uyarLabel.setForeground(Color.red);
              uyarLabel.setText("Girdiğiniz Kullanıcı Adı/Öğrenci Numara Veya Şifre Yanlıştır.");
          }
      } catch (Exception ex) {
          Logger.getLogger(logInMenu.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

                this.dispose();
      try {
           kayitOlEkran koe = new kayitOlEkran();
           koe.setVisible(true);
      } catch (Exception ex) {
          Logger.getLogger(logInMenu.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
       this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
    System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    public static String sifreGetir(JPasswordField t){
        //JPasswordField'ten şifreyi getiren method 
        char[] harf = t.getPassword();
         String sifre = "" ;
         for(char c : harf){
             sifre+=c;
         }
         return sifre;
    }
    
    public static void ogrenciYukle() throws IOException{
        //Öğrencileri Classtaki Diziye Yüklemek İçin 
        
        File sistemDosyasi = new File(getPath()+"\\FÜUSS");
        if(!sistemDosyasi.exists()){
            sistemDosyasi.mkdir();
        }
        File ogrenciler = new File(getPath()+"\\FÜUSS\\OgrenciKayıtları.txt");
            
            if(!ogrenciler.exists()){
                ogrenciler.createNewFile();
            }

            if(ogrenciSayi()>0){
                
            Scanner input = new Scanner(ogrenciler); 
            int i = 0 ;
            while(input.hasNext()){
            logInMenu.ogrenciler[i] = new Ogrenci(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()));
            i++;
            }
     }
            System.out.println("Kayıtlardaki Öğrenci Sayısı : "+ogrenciSayi());
    }
    
    public static void kayitliyOgrenciRapor(){
        for(int i =0 ; i < ogrenciler.length ; i++){
            System.out.println("Öğrenci "+(i+1)+" :");
            System.out.println("Kullanıcı Adı : "+ogrenciler[i].getKullaniciAdi());
            System.out.println("Öğrenci Numarası : "+ogrenciler[i].getOgrenciNo());
            System.out.println("Öğrenci Adı : "+ogrenciler[i].getAdi());
            System.out.println("Öğrenci Adı : "+ogrenciler[i].getSoyAdi());
            System.out.println("===============================================\n");
        }
    }
    
    public static boolean sifreDogruMu(int indeks, String sifre){
        
        
        if(sifre.equals(ogrenciler[indeks].getSifre())){
            return true ;
        }else{
            return false ;
        }
    }
    
    public static int ogrenciSayi() throws IOException{
        //Öğrenciler Kaç Tane Oldukları Bulmak için
        
        int sayac = 0 ;
        
        File sistemDosyasi = new File(getPath()+"\\FÜUSS");
        if(!sistemDosyasi.exists()){
            sistemDosyasi.mkdir();
        }
        File ogrenciler = new File(getPath()+"\\FÜUSS\\OgrenciKayıtları.txt");
            
            if(!ogrenciler.exists()){
                ogrenciler.createNewFile();
            }
            Scanner input = new Scanner(ogrenciler); 
            while(input.hasNext()){
                input.nextLine(); input.nextLine(); input.nextLine(); input.nextLine(); input.nextLine(); input.nextLine();
                sayac++;
            }
return sayac;            
    }
    
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new logInMenu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(logInMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
                    
    }

    public static String getPath(){
        
        String[] gecici = Paths.get("").toAbsolutePath().getParent().toString().replace("\\", "/").split("/");;
        
        String directory = "";
        for(int i = 0 ; i<gecici.length ; i++){
            if(gecici[i].equals("Users")){
                directory+=gecici[i]+"\\";
                directory+=gecici[i+1]+"\\";
                directory+="Documents";
                break;
            }else {
                directory+=gecici[i]+"\\";
            }
        }
        return directory;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BakcgroundPanel;
    private javax.swing.JPanel BannerPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel sifreLabelField;
    private javax.swing.JLabel usernameLabelField1;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel uyarLabel;
    // End of variables declaration//GEN-END:variables

}
