public class NewEllipse {
    private int yCoordinate;
    private int size;
    private int xCoordinate;

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate ;
    }

    public void setXCoordinate(int xCoordinate) {

        this.xCoordinate = xCoordinate;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "NewEllipse{" +
                "height=" + yCoordinate +
                ", size=" + size +
                ", xCoordinate=" + xCoordinate + '}';
    }
}



