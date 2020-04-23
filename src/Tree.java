public class Tree {
    private int x;
    private int y;
    private double degreeFromCenter;

    public Tree() {
    }

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void calculateAndSetDegree(int x, int y){
        double angle = Math.toDegrees(Math.atan2(y - this.y, x - this.x));
        if(angle < 0){
            angle += 360;
        }
        this.degreeFromCenter = angle;
    }
}
