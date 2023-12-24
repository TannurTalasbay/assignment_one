import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    public Shape(ArrayList<Point> points){
        this.points = points;
    }
    public double perimeter(){
        double p = 0;
        for(int i = 0; i < points.size(); i++){
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            p += current.distanceTo(next);
        }
        return p;
    }
}
