public class NewEllipse {
    private int height;
    private int size = 10;
    private int speed=0;
    private int ballNo;

    public NewEllipse(int ballNo){
        this.ballNo = ballNo;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height ;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
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



