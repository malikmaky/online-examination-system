/*
 * 
 * 
 */
package sinav;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static sinav.logInMenu.getPath;
import static sinav.logInMenu.ogrenciSayi;

/**
 *
 * @author Malik
 */
public class sinavArayuz extends javax.swing.JFrame{
Soru[] sorular ;
public static int soruSayisi ;
public static Ogrenci sinavaGirecekOgrenci ;
public  char[] secilenCevaplar ;
public static Ogrenci[] ogrenciler1;


    public sinavArayuz() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        sorular = new Soru[soruSay()];
        secilenCevaplar = new char[soruSay()];
        soruSayisi = 0 ; 
        ogrenciler1 = new Ogrenci[ogrenciSayi()];
        sorulariYukle();
        sinaviBaşlat();
    }
    
    public void sorulariYukle() throws IOException{
        //Soruları classtaki diziye yüklemek için kullanılan bir method 
        
        File sistemDosyasi = new File(getPath()+"\\FÜUSS");
        if(!sistemDosyasi.exists()){
            sistemDosyasi.mkdir();
        }
        
        File sorularDosya = new File(getPath()+"\\FÜUSS\\sorular.txt");
        
        if(soruSay()>0){
            Scanner input = new Scanner(sorularDosya); 
            int i = 0 ;
            while(input.hasNext()){
                sorular[i] = new Soru(input.nextLine(),new String[]{input.nextLine(), input.nextLine(),input.nextLine(),input.nextLine()}, input.nextLine().charAt(7) );
                i++;
            }
            
            System.out.println("YÜKLENEN SORULAR :\n-----------------------------");
            for(Soru c : sorular){
                System.out.println("SORU :"+c.soruMetni);
                System.out.println("CEVAPLAR :"+c.cevaplar[0]+" "+c.cevaplar[1]+" "+c.cevaplar[2]+" "+c.cevaplar[3]);
                System.out.println("Dogru cevap : "+c.cevapSikki+"\n");
            }
        }
        
    }
    
    public static int soruSay() throws IOException{
        //.txt dosyadaki soru sayisi bulmak için kullanılan bir method
        
        int sayac = 0 ;
        
        File sistemDosyasi = new File(getPath()+"\\FÜUSS");
        if(!sistemDosyasi.exists()){
            sistemDosyasi.mkdir();
        }
        File sorular = new File(getPath()+"\\FÜUSS\\sorular.txt");
            
            if(sorular.exists()){
            Scanner input = new Scanner(sorular); 
            while(input.hasNext()){
                input.nextLine(); input.nextLine(); input.nextLine(); input.nextLine(); input.nextLine(); input.nextLine();
                sayac++;
            }
        }
return sayac;            
    }
    
    public void soruGoster() throws IOException{
        //Soruları diziden alıp JFrame formda göstermek için
        
      if(soruSayisi==soruSay()-1){
                sonrakiSoruLabel.setText("Sınavı Bitir");
            }else{
                sonrakiSoruLabel.setText("Sonraki Soru");
            }
        soruMetinLabel1.setText("Soru "+(soruSayisi+1)+" :");
        soruMetinLabel2.setText(sorular[soruSayisi].soruMetni);
        cevap1RadioButton.setText(sorular[soruSayisi].cevaplar[0]);
        cevap2RadioButton.setText(sorular[soruSayisi].cevaplar[1]);
        cevap3RadioButton.setText(sorular[soruSayisi].cevaplar[2]);
        cevap4RadioButton.setText(sorular[soruSayisi].cevaplar[3]);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        baslat = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        sinavBaslatLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        adiVeSoyAdiLabel = new javax.swing.JLabel();
        ogrenciNoLabel = new javax.swing.JLabel();
        ogrenciGirdiMiLabel = new javax.swing.JLabel();
        uyarLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        closeLabel1 = new javax.swing.JLabel();
        minLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cikmakEminMiJFrame = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        metinLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        anaEkranDonPanel = new javax.swing.JPanel();
        anaEkranaDonLabel = new javax.swing.JLabel();
        sonrakiSoruPanel = new javax.swing.JPanel();
        sonrakiSoruLabel = new javax.swing.JLabel();
        oncekiSoruPanel = new javax.swing.JPanel();
        oncekiSoruLabel = new javax.swing.JLabel();
        soruMetinLabel2 = new javax.swing.JLabel();
        cevap1RadioButton = new javax.swing.JRadioButton();
        cevap2RadioButton = new javax.swing.JRadioButton();
        cevap3RadioButton = new javax.swing.JRadioButton();
        cevap4RadioButton = new javax.swing.JRadioButton();
        soruMetinLabel1 = new javax.swing.JLabel();
        puanLabel = new javax.swing.JLabel();
        uyarPuanLabel = new javax.swing.JLabel();
        secimiTemizPanel = new javax.swing.JPanel();
        secimiTemizLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        anaEkranLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        baslat.setUndecorated(true);
        baslat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(155, 32, 70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sinavBaslatLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 18)); // NOI18N
        sinavBaslatLabel.setForeground(new java.awt.Color(255, 255, 255));
        sinavBaslatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinavBaslatLabel.setText("Sınavı Başlat");
        sinavBaslatLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sinavBaslatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinavBaslatLabelMouseClicked(evt);
            }
        });
        jPanel4.add(sinavBaslatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 130, 40));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sınava Girecek Öğrencinin Bilgileri :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 32, 70), 10, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adiVeSoyAdiLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        adiVeSoyAdiLabel.setForeground(new java.awt.Color(0, 0, 0));
        adiVeSoyAdiLabel.setText("jLabel");
        jPanel5.add(adiVeSoyAdiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        ogrenciNoLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        ogrenciNoLabel.setForeground(new java.awt.Color(0, 0, 0));
        ogrenciNoLabel.setText("jLabel");
        jPanel5.add(ogrenciNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        ogrenciGirdiMiLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        ogrenciGirdiMiLabel.setForeground(new java.awt.Color(0, 0, 0));
        ogrenciGirdiMiLabel.setText("jLabel");
        jPanel5.add(ogrenciGirdiMiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 310, 180));

        uyarLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 16)); // NOI18N
        uyarLabel.setForeground(new java.awt.Color(255, 0, 0));
        uyarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uyarLabel.setText("Sınava Önceden Girdiğiniz İçin Artık Giremiyorsunuz. Aşağdaki Butona Tıklayarak Ana Ekrana Dönebilirisiniz");
        jPanel2.add(uyarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        baslat.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 500));

        jPanel7.setBackground(new java.awt.Color(155, 32, 70));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Logout_Icon_30Pixels.png"))); // NOI18N
        logoutLabel.setToolTipText("Giriş Ekranına Dön.");
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });
        jPanel7.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        baslat.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 30, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeLabel1.setBackground(new java.awt.Color(187, 187, 187));
        closeLabel1.setFont(new java.awt.Font("Roboto Slab Medium", 0, 36)); // NOI18N
        closeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel1.setText("X");
        closeLabel1.setToolTipText("Sekmeyi Kapat.");
        closeLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        closeLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(closeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        minLabel1.setBackground(new java.awt.Color(187, 187, 187));
        minLabel1.setFont(new java.awt.Font("Roboto Slab Medium", 0, 60)); // NOI18N
        minLabel1.setForeground(new java.awt.Color(255, 255, 255));
        minLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLabel1.setText("-");
        minLabel1.setToolTipText("Sekmeyi Sakla.");
        minLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        minLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(minLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Sınav BANNER copy.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        baslat.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        cikmakEminMiJFrame.setUndecorated(true);
        cikmakEminMiJFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        metinLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 24)); // NOI18N
        metinLabel.setForeground(new java.awt.Color(0, 0, 0));
        metinLabel.setText("Ana Ekrana Dönmek İstediğinizden Emin Misiniz ?");
        jPanel9.add(metinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel10.setBackground(new java.awt.Color(155, 32, 70));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 30));

        jPanel11.setBackground(new java.awt.Color(155, 32, 70));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, 30));

        cikmakEminMiJFrame.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 170));

        jPanel12.setBackground(new java.awt.Color(155, 32, 70));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        cikmakEminMiJFrame.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

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
        getContentPane().add(minLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anaEkranDonPanel.setBackground(new java.awt.Color(155, 32, 70));
        anaEkranDonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anaEkranDonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        anaEkranDonPanel.setVisible(false);

        anaEkranaDonLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 16)); // NOI18N
        anaEkranaDonLabel.setForeground(new java.awt.Color(255, 255, 255));
        anaEkranaDonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anaEkranaDonLabel.setText("Ana Ekrana Don");
        anaEkranaDonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anaEkranaDonLabelMouseClicked(evt);
            }
        });
        anaEkranDonPanel.add(anaEkranaDonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(anaEkranDonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 120, 40));

        sonrakiSoruPanel.setBackground(new java.awt.Color(155, 32, 70));
        sonrakiSoruPanel.setForeground(new java.awt.Color(51, 51, 51));
        sonrakiSoruPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sonrakiSoruPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sonrakiSoruLabel.setBackground(new java.awt.Color(187, 187, 187));
        sonrakiSoruLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        sonrakiSoruLabel.setForeground(new java.awt.Color(255, 255, 255));
        sonrakiSoruLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sonrakiSoruLabel.setText("Sonraki Soru");
        sonrakiSoruLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sonrakiSoruLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sonrakiSoruLabelMouseClicked(evt);
            }
        });
        sonrakiSoruPanel.add(sonrakiSoruLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 35));

        jPanel1.add(sonrakiSoruPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 125, 35));

        oncekiSoruPanel.setBackground(new java.awt.Color(155, 32, 70));
        oncekiSoruPanel.setForeground(new java.awt.Color(51, 51, 51));
        oncekiSoruPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oncekiSoruPanel.setVisible(false);
        oncekiSoruPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oncekiSoruLabel.setBackground(new java.awt.Color(187, 187, 187));
        oncekiSoruLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 14)); // NOI18N
        oncekiSoruLabel.setForeground(new java.awt.Color(255, 255, 255));
        oncekiSoruLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oncekiSoruLabel.setText("Önceki Soru");
        oncekiSoruLabel.setVisible(false);
        oncekiSoruLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oncekiSoruLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oncekiSoruLabelMouseClicked(evt);
            }
        });
        oncekiSoruPanel.add(oncekiSoruLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 35));

        jPanel1.add(oncekiSoruPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        soruMetinLabel2.setFont(new java.awt.Font("Dosis ExtraBold", 1, 34)); // NOI18N
        soruMetinLabel2.setForeground(new java.awt.Color(0, 0, 0));
        soruMetinLabel2.setText("SORU METNİ");
        jPanel1.add(soruMetinLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 760, 50));

        buttonGroup1.add(cevap1RadioButton);
        cevap1RadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cevap1RadioButton.setText("jRadioButton1");
        cevap1RadioButton.setBorderPainted(true);
        cevap1RadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cevap1RadioButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cevap1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        buttonGroup1.add(cevap2RadioButton);
        cevap2RadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cevap2RadioButton.setText("jRadioButton1");
        jPanel1.add(cevap2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        buttonGroup1.add(cevap3RadioButton);
        cevap3RadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cevap3RadioButton.setText("jRadioButton1");
        jPanel1.add(cevap3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        buttonGroup1.add(cevap4RadioButton);
        cevap4RadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cevap4RadioButton.setText("jRadioButton1");
        jPanel1.add(cevap4RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        soruMetinLabel1.setFont(new java.awt.Font("Dosis ExtraBold", 1, 22)); // NOI18N
        soruMetinLabel1.setForeground(new java.awt.Color(0, 0, 0));
        soruMetinLabel1.setText("Soru");
        jPanel1.add(soruMetinLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 650, 50));

        puanLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 24)); // NOI18N
        puanLabel.setForeground(new java.awt.Color(0, 0, 0));
        puanLabel.setText("Aldığınız Not : 100.00");
        puanLabel.setVisible(false);
        jPanel1.add(puanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, 40));

        uyarPuanLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 18)); // NOI18N
        uyarPuanLabel.setForeground(new java.awt.Color(0, 0, 0));
        uyarPuanLabel.setText("Sınavı Başarıyla Bitirdiniz Aşağıdaki Butona Tıklayarak Ana Menüye Dönebilirsiniz.");
        uyarPuanLabel.setVisible(false);
        jPanel1.add(uyarPuanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 670, -1));

        secimiTemizPanel.setBackground(new java.awt.Color(155, 32, 70));
        secimiTemizPanel.setForeground(new java.awt.Color(51, 51, 51));
        secimiTemizPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        secimiTemizPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secimiTemizLabel.setBackground(new java.awt.Color(187, 187, 187));
        secimiTemizLabel.setFont(new java.awt.Font("Dosis ExtraBold", 1, 13)); // NOI18N
        secimiTemizLabel.setForeground(new java.awt.Color(255, 255, 255));
        secimiTemizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secimiTemizLabel.setText("Seçimi Temizle");
        secimiTemizLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        secimiTemizLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secimiTemizLabelMouseClicked(evt);
            }
        });
        secimiTemizPanel.add(secimiTemizLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 105, 35));

        jPanel1.add(secimiTemizPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 105, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 500));

        jPanel8.setBackground(new java.awt.Color(155, 32, 70));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anaEkranLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/Home_Icon_30Pixels.png"))); // NOI18N
        anaEkranLabel.setToolTipText("Ana Ekrana Dön");
        anaEkranLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anaEkranLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anaEkranLabelMouseClicked(evt);
            }
        });
        jPanel8.add(anaEkranLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Sınav BANNER copy.jpg"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sinaviBaşlat() throws IOException{
        soruMetinLabel2.setVisible(true);
        cevap1RadioButton.setVisible(true);
        cevap2RadioButton.setVisible(true);
        cevap3RadioButton.setVisible(true);
        cevap4RadioButton.setVisible(true);
        sonrakiSoruLabel.setVisible(true);
        sonrakiSoruPanel.setVisible(true);
        secimiTemizLabel.setVisible(true);
        secimiTemizPanel.setVisible(true);
        soruGoster();
    }
    
    public double puanHesapla() throws IOException{
        //Seçilen cevaplar ve doğru cevaplar arasında karşılaştırma
        
        double not = 0 ;
        
        for(int j = 0 ; j<sorular.length ; j++){
            if(sorular[j].cevapSikki==secilenCevaplar[j] ){
                not++;
            }
        }           
        not = not * (100.0/soruSay());
        return not ;
    }
    
    public static void ogrenciBilgileriUpdate(Ogrenci ogrenci1) throws FileNotFoundException, IOException{
           //Öğrencinin sınavda aldığı puan .txt dosyada kaydetmek için kullanılan bir method        
        
        File ogrencileri = new File(getPath()+"\\FÜUSS\\OgrenciKayıtları.txt");
        
        ogrenciYukle();
        
        FileWriter fw = new FileWriter(ogrencileri);
        
        for(int i = 0 ; i<ogrenciler1.length ; i++){
            if(ogrenciler1[i].getKullaniciAdi().equals(ogrenci1.getKullaniciAdi()) && ogrenciler1[i].getOgrenciNo().equals(ogrenci1.getOgrenciNo())){
                fw.write(ogrenci1.getKullaniciAdi()+"\n");
                fw.write(ogrenci1.getOgrenciNo()+"\n");
                fw.write(ogrenci1.getAdi()+"\n");
                fw.write(ogrenci1.getSoyAdi()+"\n");
                fw.write(ogrenci1.getSifre()+"\n");
                fw.write(ogrenci1.getPuan()+"\n");
            }else{
                fw.write(ogrenciler1[i].getKullaniciAdi()+"\n");
                fw.write(ogrenciler1[i].getOgrenciNo()+"\n");
                fw.write(ogrenciler1[i].getAdi()+"\n");
                fw.write(ogrenciler1[i].getSoyAdi()+"\n");
                fw.write(ogrenciler1[i].getSifre()+"\n");
                fw.write(ogrenciler1[i].getPuan()+"\n");
            }
        }
         fw.close();
    }
    
     public static void ogrenciYukle() throws IOException{
          //Öğrencileri Classtaki Diziye Yüklemek İçin 

         
        File sistemDosyasi = new File(getPath()+"\\FÜUSS");
        if(!sistemDosyasi.exists()){
            sistemDosyasi.mkdir();
        }
        File ogrencilerx = new File(getPath()+"\\FÜUSS\\OgrenciKayıtları.txt");
            
            if(!ogrencilerx.exists()){
                ogrencilerx.createNewFile();
            }

            if(ogrenciSayi()>0){
                
            Scanner input = new Scanner(ogrencilerx); 
            int i = 0 ;
            while(input.hasNext()){
            sinavArayuz.ogrenciler1[i] = new Ogrenci(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()));
            i++;
      }
     }
            for(Ogrenci c : ogrenciler1){
                System.out.println("Öğrenci Adi : "+c.getAdi());
            }
    }
    
    private void sonrakiSoruLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonrakiSoruLabelMouseClicked
    try {
        if(sonrakiSoruLabel.getText().contains("Bitir")){
            
            if(cevap1RadioButton.isSelected()){
             secilenCevaplar[soruSayisi] = cevap1RadioButton.getText().charAt(0);
            }else if(cevap2RadioButton.isSelected()){
             secilenCevaplar[soruSayisi] = cevap2RadioButton.getText().charAt(0);
            }else if(cevap3RadioButton.isSelected()){
                secilenCevaplar[soruSayisi] = cevap3RadioButton.getText().charAt(0);
            }else if(cevap4RadioButton.isSelected()){
                secilenCevaplar[soruSayisi] = cevap4RadioButton.getText().charAt(0);
            }else{
                 secilenCevaplar[soruSayisi] = 'X';
            }
            
            sinaviSakla();
            puanLabel.setVisible(true);
            anaEkranDonPanel.setVisible(true);
            uyarPuanLabel.setVisible(true);
            sinavaGirecekOgrenci.setPuan((float) Math.round(puanHesapla() * 100) / 100);
            ogrenciBilgileriUpdate(sinavaGirecekOgrenci);
            uyarPuanLabel.setText("Sınavı Başarıyla Bitirdiniz Aşağıdaki Butona Tıklayarak Ana Menüye Dönebilirsiniz.");
            puanLabel.setText("Aldığınız Not : "+ (float) Math.round(puanHesapla() * 100) / 100);
        }else{
        if(soruSayisi<soruSay()){
            if(soruSayisi==soruSay()-1){
                sonrakiSoruLabel.setText("Sınavı Bitir");
            }else{
                sonrakiSoruLabel.setText("Sonraki Soru");
            }

            if(cevap1RadioButton.isSelected()){
             secilenCevaplar[soruSayisi] = cevap1RadioButton.getText().charAt(0);
            }else if(cevap2RadioButton.isSelected()){
             secilenCevaplar[soruSayisi] = cevap2RadioButton.getText().charAt(0);
            }else if(cevap3RadioButton.isSelected()){
                secilenCevaplar[soruSayisi] = cevap3RadioButton.getText().charAt(0);
            }else if(cevap4RadioButton.isSelected()){
                secilenCevaplar[soruSayisi] = cevap4RadioButton.getText().charAt(0);
            }else{
                 secilenCevaplar[soruSayisi] = 'X';
            }
            
            buttonGroup1.clearSelection();
            soruSayisi++;
            soruGoster();
            
            if(secilenCevaplar[soruSayisi]=='A'){
                cevap1RadioButton.setSelected(true);
            }else if(secilenCevaplar[soruSayisi]=='B'){
                cevap2RadioButton.setSelected(true);
            }else if(secilenCevaplar[soruSayisi]=='C'){
                cevap3RadioButton.setSelected(true);
            }else if(secilenCevaplar[soruSayisi]=='D'){
                cevap4RadioButton.setSelected(true);
            }
            
        }
        if(soruSayisi>0){
            oncekiSoruLabel.setVisible(true);
            oncekiSoruPanel.setVisible(true);
        }
            }
    } catch (IOException ex) {
        Logger.getLogger(sinavArayuz.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_sonrakiSoruLabelMouseClicked

    private void oncekiSoruLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oncekiSoruLabelMouseClicked
     
    try {
        if(soruSay()>0){
            if(soruSayisi==1){
            oncekiSoruLabel.setVisible(false);
            oncekiSoruPanel.setVisible(false);
            }
            
            
            if(cevap1RadioButton.isSelected()){
             secilenCevaplar[soruSayisi] = cevap1RadioButton.getText().charAt(0);
            }else if(cevap2RadioButton.isSelected()){
             secilenCevaplar[soruSayisi] = cevap2RadioButton.getText().charAt(0);
            }else if(cevap3RadioButton.isSelected()){
                secilenCevaplar[soruSayisi] = cevap3RadioButton.getText().charAt(0);
            }else if(cevap4RadioButton.isSelected()){
                secilenCevaplar[soruSayisi] = cevap4RadioButton.getText().charAt(0);
            }else{
                 secilenCevaplar[soruSayisi] = 'X';
            }
            
            buttonGroup1.clearSelection();
            soruSayisi--;
            soruGoster();
            
            if(secilenCevaplar[soruSayisi]=='A'){
                cevap1RadioButton.setSelected(true);
            }else if(secilenCevaplar[soruSayisi]=='B'){
                cevap2RadioButton.setSelected(true);
            }else if(secilenCevaplar[soruSayisi]=='C'){
                cevap3RadioButton.setSelected(true);
            }else if(secilenCevaplar[soruSayisi]=='D'){
                cevap4RadioButton.setSelected(true);
            }
        }
            } catch (IOException ex) {
        Logger.getLogger(sinavArayuz.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_oncekiSoruLabelMouseClicked

    private void sinavBaslatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinavBaslatLabelMouseClicked
     if(sinavBaslatLabel.getText().contains("Ana")){
         this.baslat.dispose();
         this.dispose();
         try {
         logInMenu lim= new logInMenu();
         lim.setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(sinavArayuz.class.getName()).log(Level.SEVERE, null, ex);
         }
     }else if(sinavBaslatLabel.getText().contains("Başlat")){
        this.baslat.dispose();
     this.setVisible(true);
     }
    }//GEN-LAST:event_sinavBaslatLabelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        this.cikmakEminMiJFrame.setSize(600, 200);
        this.cikmakEminMiJFrame.setLocationRelativeTo(null);
        this.cikmakEminMiJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cikmakEminMiJFrame.setVisible(true);         
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void anaEkranLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anaEkranLabelMouseClicked
        this.cikmakEminMiJFrame.setSize(600, 200);
        this.cikmakEminMiJFrame.setLocationRelativeTo(null);
        this.cikmakEminMiJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cikmakEminMiJFrame.setVisible(true);     
    }//GEN-LAST:event_anaEkranLabelMouseClicked

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void minLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabel1MouseClicked
               this.baslat.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabel1MouseClicked

    private void closeLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabel1MouseClicked

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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.cikmakEminMiJFrame.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void anaEkranaDonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anaEkranaDonLabelMouseClicked
       this.dispose();
    try {
        logInMenu lim = new logInMenu();
        lim.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(sinavArayuz.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_anaEkranaDonLabelMouseClicked

    private void cevap1RadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cevap1RadioButtonMouseClicked
        
    }//GEN-LAST:event_cevap1RadioButtonMouseClicked

    private void secimiTemizLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secimiTemizLabelMouseClicked
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_secimiTemizLabelMouseClicked

    public void test(){
    }
    
    private void sinaviSakla(){
        soruMetinLabel1.setVisible(false);
        soruMetinLabel2.setVisible(false);
        cevap1RadioButton.setVisible(false);
        cevap2RadioButton.setVisible(false);
        cevap3RadioButton.setVisible(false);
        cevap4RadioButton.setVisible(false);
        sonrakiSoruLabel.setVisible(false);
        sonrakiSoruPanel.setVisible(false);
        oncekiSoruLabel.setVisible(false);
        oncekiSoruPanel.setVisible(false);
        secimiTemizLabel.setVisible(false);
        secimiTemizPanel.setVisible(false);
    }
    
    public static void main(String args[]) throws IOException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sinavArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sinavArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sinavArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sinavArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        sinavArayuz sa = new sinavArayuz();
        sa.baslat.setSize(800,600);
        sa.baslat.setLocationRelativeTo(null);
        sa.baslat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sa.baslat.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel adiVeSoyAdiLabel;
    private javax.swing.JPanel anaEkranDonPanel;
    private javax.swing.JLabel anaEkranLabel;
    private javax.swing.JLabel anaEkranaDonLabel;
    protected javax.swing.JFrame baslat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cevap1RadioButton;
    private javax.swing.JRadioButton cevap2RadioButton;
    private javax.swing.JRadioButton cevap3RadioButton;
    private javax.swing.JRadioButton cevap4RadioButton;
    private javax.swing.JFrame cikmakEminMiJFrame;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel closeLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel metinLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel minLabel1;
    protected javax.swing.JLabel ogrenciGirdiMiLabel;
    protected javax.swing.JLabel ogrenciNoLabel;
    private javax.swing.JLabel oncekiSoruLabel;
    private javax.swing.JPanel oncekiSoruPanel;
    protected javax.swing.JLabel puanLabel;
    private javax.swing.JLabel secimiTemizLabel;
    private javax.swing.JPanel secimiTemizPanel;
    protected javax.swing.JLabel sinavBaslatLabel;
    private javax.swing.JLabel sonrakiSoruLabel;
    private javax.swing.JPanel sonrakiSoruPanel;
    private javax.swing.JLabel soruMetinLabel1;
    private javax.swing.JLabel soruMetinLabel2;
    protected javax.swing.JLabel uyarLabel;
    private javax.swing.JLabel uyarPuanLabel;
    // End of variables declaration//GEN-END:variables
}
