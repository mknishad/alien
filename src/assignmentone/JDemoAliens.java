/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nishad Khan
 */
public class JDemoAliens extends JPanel {
    
    public void paint(Graphics g) {
        Martian martian = new Martian("Marry", "Red", 1);
        martian.draw(g, 30, 30);
        Jupiterian jupiterian = new Jupiterian("Jones", "Gray", 3);
        jupiterian.draw(g, 200, 30);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aliens");
        frame.getContentPane().add(new JDemoAliens());
        frame.setSize(330, 360);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
