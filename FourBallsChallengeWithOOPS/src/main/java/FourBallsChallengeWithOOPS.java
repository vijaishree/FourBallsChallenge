import processing.core.PApplet;

public class FourBallsChallengeWithOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public int speed = 0;
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
    ellipse(newEllipse1.getSpeed(), newEllipse1.getHeight(), newEllipse1.getSize(), newEllipse1.getSize());

   NewEllipse newEllipse2 = getEllipseDimensions(2);
   ellipse(newEllipse2.getSpeed(), newEllipse2.getHeight(), newEllipse2.getSize(), newEllipse2.getSize());


    NewEllipse newEllipse3 = getEllipseDimensions(3);
    ellipse(newEllipse3.getSpeed(), newEllipse3.getHeight(), newEllipse3.getSize(), newEllipse3.getSize());


    NewEllipse newEllipse4 = getEllipseDimensions(4);
    ellipse(newEllipse4.getSpeed(), newEllipse4.getHeight(), newEllipse4.getSize(), newEllipse4.getSize());
    speed++;
    }

 public NewEllipse getEllipseDimensions(int ballNo){
        NewEllipse newEllipse = new NewEllipse(ballNo);
        newEllipse.setHeight(HEIGHT/5);
        newEllipse.setSpeed(speed);
        System.out.println(newEllipse.toString());
        return newEllipse;
    }
}
