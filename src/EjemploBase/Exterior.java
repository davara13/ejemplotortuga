/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author daaariaspa
 */
public class Exterior extends Thread{
    private Turtle tortuga;
    
    public Exterior(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        //tortuga.hideTurtle();
        this.tortuga.right(45);
           this.tortuga.forward(56.56);
        for (int i = 0; i < 3; i++) {
            this.tortuga.right(90);
            this.tortuga.forward(56.56);
        }
        tortuga.setPos(60,40);
        this.tortuga.right(180);
        this.tortuga.forward(14.14);
        this.tortuga.left(125);
        this.tortuga.forward(14.14);
        this.tortuga.left(120);
        this.tortuga.forward(14.14);
        
        tortuga.setPos(60,-40);
        this.tortuga.left(135);
        this.tortuga.forward(14.14);
        this.tortuga.left(125);
        this.tortuga.forward(14.14);

        
        tortuga.setPos(97,4.24);
        this.tortuga.forward(14.14);
        this.tortuga.right(120);
        this.tortuga.forward(14.14);
        this.tortuga.right(120);
        this.tortuga.forward(14.14);
        
        this.tortuga.right(195);
    }
}
