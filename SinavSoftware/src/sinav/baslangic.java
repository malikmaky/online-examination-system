/*
 * 
 * 
 */
package sinav;

import java.io.IOException;

public class baslangic extends javax.swing.JFrame {

    public baslangic() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yuzdeLabel = new javax.swing.JLabel();
        yukleniyorLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yuzdeLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        yuzdeLabel.setForeground(new java.awt.Color(255, 255, 255));
        yuzdeLabel.setText("% 0");
        getContentPane().add(yuzdeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        yukleniyorLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        yukleniyorLabel.setForeground(new java.awt.Color(255, 255, 255));
        yukleniyorLabel.setText("Yükleniyor...");
        getContentPane().add(yukleniyorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/Loading Spinner.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 160, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinav/Giriş Ekranı.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 800, 600));

        jPanel1.setBackground(new java.awt.Color(155, 32, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 800, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws InterruptedException, IOException {
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
            java.util.logging.Logger.getLogger(baslangic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(baslangic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(baslangic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(baslangic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        baslangic b = new baslangic();
        b.setVisible(true);
        
        for(int i = 1 ; i<=100 ; i++){
            Thread.sleep(10);
            b.yuzdeLabel.setText("% "+i);
            if(i==100){
                Thread.sleep(500);
            b.dispose();
           logInMenu lim = new logInMenu();
           lim.setVisible(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel yukleniyorLabel;
    private javax.swing.JLabel yuzdeLabel;
    // End of variables declaration//GEN-END:variables
}
