/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartoon.battle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CartoonBattle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login l = new Login();
        ArrayList <User> u = new ArrayList<>();
        
        l.setVisible(true);
        l.getT().start();
        l.getPlay().addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                if (!l.getIsiUser().getText().equals("") && u.size() < 5) {
                    u.add(new User(l.getIsiUser().getText()));
                    l.dispose();
                    Home h = new Home(u.get(0).getUsername());
                    h.setVisible(true);
                } else if (!l.getIsiUser().getText().equals("") && u.size() == 5) {
                    JOptionPane.showMessageDialog(l, "The oldest save would be deleted!", "warning",  JOptionPane.WARNING_MESSAGE);
                    u.remove(0);
                    u.add(new User(l.getIsiUser().getText()));
                    l.dispose();
                    Home h = new Home(u.get(0).getUsername());
                    h.setVisible(true);
                } else {
                    l.warnMessage();
                }
            }
        });
    }
    
}
