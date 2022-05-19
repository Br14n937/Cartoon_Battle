/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cartoon.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private Timer t;
    private static int waktu = 0;
    
    public Login() {
        initComponents();
        //Icon Image <Wajib di tiap form>
        ImageIcon img = new ImageIcon("C:\\Users\\User\\Documents\\iSTTS\\Semester 2\\4 - Kamis\\2 - Pemrograman Berorientasi Objek\\Pelajaran\\Proyek Cartoon Wars\\Cartoon Battle\\src\\Images\\Icon.jpg");
        this.setIconImage(img.getImage());
        //Icon Invisible
        Background.setVisible(false);
        Username.setVisible(false);
        IsiUser.setVisible(false);
        Warning.setVisible(false);
        Play.setVisible(false);
        ActionListener act = new ActionListener(){
            boolean x = true;
            boolean y = false;
            public void actionPerformed(ActionEvent event) {
                waktu++;
                if (waktu == 10) {
                    Background1.setVisible(false);
                    Background2.setVisible(false);
                    Cartoon.setVisible(false);
                    Background.setVisible(true);
                    Username.setVisible(true);
                    IsiUser.setVisible(true);
                    Play.setVisible(true);
                    t.stop();
                } else {
                    if (x) {
                        x = false;
                        y = true;
                        Background1.setVisible(true);
                        Background2.setVisible(false);
                    } else {
                        x = true;
                        y = false;
                        Background1.setVisible(false);

                    }
                     Background2.setVisible(true);
                    }
            }
        };
        t = new Timer(300, act);
    }
    
    public Timer getT() {
        return t;
    }

    public int getWaktu() {
        return waktu;
    }

    public JButton getPlay() {
        return Play;
    }

    public JTextField getIsiUser() {
        return IsiUser;
    }
    public void warnMessage() {
        Warning.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cartoon = new javax.swing.JLabel();
        Background1 = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        IsiUser = new javax.swing.JTextField();
        Play = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cartoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cartoon.png"))); // NOI18N
        getContentPane().add(Cartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Intro1.jpg"))); // NOI18N
        getContentPane().add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Intro2.jpg"))); // NOI18N
        getContentPane().add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Warning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Warning.png"))); // NOI18N
        getContentPane().add(Warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 390, -1));

        Username.setFont(new java.awt.Font("Lato Black", 1, 36)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        IsiUser.setFont(new java.awt.Font("Lato Black", 1, 48)); // NOI18N
        IsiUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiUserActionPerformed(evt);
            }
        });
        getContentPane().add(IsiUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 390, -1));

        Play.setFont(new java.awt.Font("Lato Black", 1, 48)); // NOI18N
        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Play.png"))); // NOI18N
        Play.setBorderPainted(false);
        Play.setContentAreaFilled(false);
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 420, 140));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Intro.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IsiUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsiUserActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel Cartoon;
    private javax.swing.JTextField IsiUser;
    private javax.swing.JButton Play;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Warning;
    // End of variables declaration//GEN-END:variables
}
