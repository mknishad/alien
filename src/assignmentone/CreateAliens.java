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
public class CreateAliens{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alien martian = new Martian("Mart", "Maroon", 3);
        Alien jupiterian = new Jupiterian("Jup", "Yellow", 1);
        
        System.out.println(martian);
        System.out.println(jupiterian);
    }
    
}
