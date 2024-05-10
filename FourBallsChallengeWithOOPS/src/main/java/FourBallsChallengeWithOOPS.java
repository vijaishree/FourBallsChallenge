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
    ellipse(newEllipse1.getXAxis(), newEllipse1.getYAxis(), newEllipse1.getSize(), newEllipse1.getSize());

    NewEllipse newEllipse2 = getEllipseDimensions(2);
    ellipse(newEllipse2.getXAxis(), newEllipse2.getYAxis(), newEllipse2.getSize(), newEllipse2.getSize());


    NewEllipse newEllipse3 = getEllipseDimensions(3);
    ellipse(newEllipse3.getXAxis(), newEllipse3.getYAxis(), newEllipse3.getSize(), newEllipse3.getSize());


    NewEllipse newEllipse4 = getEllipseDimensions(4);
    ellipse(newEllipse4.getXAxis(), newEllipse4.getYAxis(), newEllipse4.getSize(), newEllipse4.getSize());

    xCoordinate++;
    }

 public NewEllipse getEllipseDimensions(int ballNo){
        NewEllipse newEllipse = new NewEllipse();
        newEllipse.setYAxis(HEIGHT * ballNo/5);
        newEllipse.setXAxis(xCoordinate * ballNo);
        newEllipse.setSize(size* ballNo);
        return newEllipse;
    }
}
