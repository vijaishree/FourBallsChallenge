public class NewEllipse {
    private int height;
    private int size = 10;
    private int speed=0;
    private int ballNo;

    public NewEllipse(int ballNo){
        this.ballNo = ballNo;
    }

    public void setHeight(int height) {
        this.height = height*ballNo;
    }

    public int getHeight() {
        return height ;
    }

    public void setSpeed(int speed) {

        this.speed = speed*ballNo;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size*ballNo;
    }

    @Override
    public String toString() {
        return "NewEllipse{" +
                "height=" + height +
                ", size=" + size +
                ", speed=" + speed +
                ", ballNo=" + ballNo +
                '}';
    }
}



