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
        
        l.setLocationRelativeTo(null);
        l.setResizable(false);
        
        l.setVisible(true);
        l.getT().start();
        //Masuk Home
        l.getPlay().addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                if (!l.getIsiUser().getText().equals("")) {
                    if (u.size() == 5) {
                        JOptionPane.showMessageDialog(l, "The oldest save would be deleted!", "Warning",  JOptionPane.WARNING_MESSAGE);
                        u.remove(0);
                    }
                    u.add(new User(l.getIsiUser().getText()));
                    l.setVisible(false);
                    Home h = new Home(u.get(u.size() - 1).getUsername(), String.valueOf(u.get(u.size() - 1).getGold()));
                    h.setLocationRelativeTo(null);
                    h.setResizable(false);
                    h.setVisible(true);
                    
                    //Logout
                    h.getLogout().addMouseListener(new MouseAdapter(){
                        public void mousePressed(MouseEvent me){
                            h.setVisible(false);
                            l.setVisible(true);
                            l.menuUtama();
                        }
                    });
                    
                    //Shop <Daniello>
                    h.getShop().addMouseListener(new MouseAdapter(){
                        public void mousePressed(MouseEvent me){
                            System.out.println("Test Shop");
                        }
                    });
                    
                    //Kingdom <Jessica>
                    h.getKingdom().addMouseListener(new MouseAdapter(){
                        public void mousePressed(MouseEvent me){
                            System.out.println("Test Kingdom");
                        }
                    });
                    
                    //Battle <Febrian>
                    h.getBattle().addMouseListener(new MouseAdapter(){
                        public void mousePressed(MouseEvent me){
                            Battle b = new Battle(u.get(u.size()-1).getTroop());
                            b.setLocationRelativeTo(null);
                            b.setResizable(false);
                            h.setVisible(false);
                            b.setVisible(true);
                            b.getBack().addMouseListener(new MouseAdapter(){
                                public void mousePressed(MouseEvent me){
                                    b.dispose();
                                    if(b.getTroopT() != null){
                                        b.getTroopT().stop();
                                        b.setTroopT(null);
                                        b.setTroop(null);
                                        b.setTrooplab(null);
                                    }
                                    h.setVisible(true);
                                }
                            });
                        }
                    });
                } else {
                    l.warnMessage();
                }
            }
        });
    }
    
}
