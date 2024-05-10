public class NewEllipse {
    private int yCoordinate;
    private int size;
    private int xCoordinate;

    public void setYAxis(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getYAxis() {
        return yCoordinate ;
    }

    public void setXAxis(int xCoordinate) {

        this.xCoordinate = xCoordinate;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getXAxis() {
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



