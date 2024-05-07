package org.example;
import processing.core.PApplet;
public class FourBallsChallengeWithoutOOPS extends  PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int x1 = 0;
    private int x2 = 0;
    private int x3 = 0;
    private int x4 = 0;

    public static void main(String[] args) {
        PApplet.main("org.example.FourBallsChallengeWithoutOOPS", args);
    }

    @Override
    public void settings() {
        super.settings();
        
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){

        ellipse(x1,HEIGHT/5, DIAMETER, DIAMETER);
        
        ellipse(x2,2 * HEIGHT/5, 2*DIAMETER, 2*DIAMETER);
        
        ellipse(x3,3 * HEIGHT/5, 3*DIAMETER, 3*DIAMETER);
        
        ellipse(x4,4 * HEIGHT/5, 4*DIAMETER, 4*DIAMETER);
        
        x1++;
        
        x2+=2;
        
        x3+=3;
        
        x4+=4;
    }

}
