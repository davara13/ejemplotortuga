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
public class Circle extends Thread{
    private Turtle tortuga;
    
    public Circle(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        this.tortuga.right(45);
           this.tortuga.forward(56.56);
        for (int i = 0; i < 3; i++) {
            this.tortuga.right(90);
            this.tortuga.forward(56.56);
        }

    }
}
