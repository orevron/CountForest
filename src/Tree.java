public class Tree implements Comparable<Tree>{
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

    public double getDegreeFromCenter() {
        return degreeFromCenter;
    }

    public void setDegreeFromCenter(double degreeFromCenter) {
        this.degreeFromCenter = degreeFromCenter;
    }

    public void calculateAndSetDegree(int x, int y){
        double angle = Math.toDegrees(Math.atan2(y - this.y, x - this.x));
        if(angle < 0){
            angle += 360;
        }
        this.degreeFromCenter = angle;
    }

    @Override
    public int compareTo(Tree o) {
        if(this.degreeFromCenter<o.degreeFromCenter){
            return -1;
        }else if(o.degreeFromCenter<this.degreeFromCenter) {
            return 1;
        }
        return 0;
    }
}
