import processing.core.PApplet;

public class FourBallsChallengeWithOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public int xCoordinate = 0;
    public int size = 10;
    public static void main(String[] args){
        PApplet.main(FourBallsChallengeWithOOPS.class,args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

    NewEllipse newEllipse1 = getEllipseDimensions(1);
    ellipse(newEllipse1.getXCoordinate(), newEllipse1.getYCoordinate(), newEllipse1.getSize(), newEllipse1.getSize());

    NewEllipse newEllipse2 = getEllipseDimensions(2);
    ellipse(newEllipse2.getXCoordinate(), newEllipse2.getYCoordinate(), newEllipse2.getSize(), newEllipse2.getSize());


    NewEllipse newEllipse3 = getEllipseDimensions(3);
    ellipse(newEllipse3.getXCoordinate(), newEllipse3.getYCoordinate(), newEllipse3.getSize(), newEllipse3.getSize());


    NewEllipse newEllipse4 = getEllipseDimensions(4);
    ellipse(newEllipse4.getXCoordinate(), newEllipse4.getYCoordinate(), newEllipse4.getSize(), newEllipse4.getSize());

    xCoordinate++;
    }

 public NewEllipse getEllipseDimensions(int ballNo){
        NewEllipse newEllipse = new NewEllipse();
        newEllipse.setYCoordinate(HEIGHT * ballNo/5);
        newEllipse.setXCoordinate(xCoordinate * ballNo);
        newEllipse.setSize(size* ballNo);
        return newEllipse;
    }
}
