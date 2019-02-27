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
public class TrianguloEquilateroAbajo extends Thread {

    private Turtle tortuga;

    public TrianguloEquilateroAbajo(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
       
            this.tortuga.left(30);
            this.tortuga.forward(50);
            this.tortuga.right(60);
            this.tortuga.forward(50);
            //this.tortuga.left(300);
            //this.tortuga.forward(50);

    }
}