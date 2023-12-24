public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point distance){
        double nx = distance.x - this.x;
        double ny = distance.y - this.y;
        return Math.sqrt(nx*nx + ny*ny);
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

}