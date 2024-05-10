public class NewEllipse {
    private int height;
    private int size;
    private int speed;
    //private int ballNo;


    public void setYAxis(int height) {
        this.height = height;
    }

    public int getYAxis() {
        return height ;
    }

    public void setXAxis(int speed) {

        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getXAxis() {
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

                '}';
    }
}



