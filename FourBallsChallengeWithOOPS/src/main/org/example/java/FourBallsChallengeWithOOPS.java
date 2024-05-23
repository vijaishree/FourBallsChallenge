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

    Ellipse ellipseOne = getEllipseDimensions(1);
    ellipse(ellipseOne.getXCoordinate(), ellipseOne.getYCoordinate(), ellipseOne.getSize(), ellipseOne.getSize());

    Ellipse ellipseTwo = getEllipseDimensions(2);
    ellipse(ellipseTwo.getXCoordinate(), ellipseTwo.getYCoordinate(), ellipseTwo.getSize(), ellipseTwo.getSize());


    Ellipse ellipseThree = getEllipseDimensions(3);
    ellipse(ellipseThree.getXCoordinate(), ellipseThree.getYCoordinate(), ellipseThree.getSize(), ellipseThree.getSize());


    Ellipse ellipseFour = getEllipseDimensions(4);
    ellipse(ellipseFour.getXCoordinate(), ellipseFour.getYCoordinate(), ellipseFour.getSize(), ellipseFour.getSize());

    xCoordinate++;
    }

 public Ellipse getEllipseDimensions(int ballNo){
        Ellipse ellipse = new Ellipse();
        ellipse.setYCoordinate(HEIGHT * ballNo/5);
        ellipse.setXCoordinate(xCoordinate * ballNo);
        ellipse.setSize(size* ballNo);
        return ellipse;
    }
}
