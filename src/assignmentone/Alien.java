/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

/**
 *
 * @author Nishad Khan
 */
public abstract class Alien {
    protected String name;
    protected String color;
    private int numberOfEyes;

    public Alien(String name, String color, int numberOfEyes) {
        this.name = name;
        this.color = color;
        this.numberOfEyes = numberOfEyes;
    }

    @Override
    public String toString() {
        return "Alien{" + "name=" + name + ", color=" + color + ", numberOfEyes=" + numberOfEyes + '}';
    }
    
}
