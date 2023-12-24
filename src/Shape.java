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
    public double longestSide(){
        double max = 0;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).distanceTo(points.get(j));
                if (distance > max) {
                    max = distance;
                }
            }
        }
        return max;
    }
    public double averageSide() {
        double all = 0;
        for(int i = 0; i < points.size(); i++){
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            all += current.distanceTo(next);
        }
        return all / points.size();
    }
}
