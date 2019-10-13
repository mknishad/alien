/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

import java.awt.Graphics;

/**
 *
 * @author Nishad Khan
 */
public class Martian extends Alien {

    public Martian(String name, String color, int numberOfEyes) {
        super(name, color, numberOfEyes);
    }
    
    public void draw(Graphics g, int x, int y) {
        g.drawRect(x, y, 100, 100);
        g.drawOval(x+45, y+25, 10, 10);
        g.fillOval(x+50, y+28, 5, 5);
        g.drawOval(x+20, y+25, 10, 10);
        g.fillOval(x+25, y+28, 5, 5);
        g.drawOval(x+70, y+25, 10, 10);
        g.fillOval(x+75, y+28, 5, 5);
        g.drawLine(x+50, y+100, x+50, y+200);
        g.drawLine(x, y+150, x+100, y+150);
        g.drawLine(x, y+200, x+100, y+200);
        g.drawLine(x, y+200, x, y+250);
        g.drawLine(x+100, y+200, x+100, y+250);
        g.drawString("Martian", x, y+280);
    }
}
