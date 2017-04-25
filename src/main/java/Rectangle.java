import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by maciek on 4/25/17.
 */
public class Rectangle {
    public Rectangle(){

    }

    public ArrayList generateRectanglePoints(Point pointOfEngagment, int movement){
        ArrayList<Point> pointsList = new ArrayList<Point>();
        int xCoordinate = (int) pointOfEngagment.getX();
        int yCoordinate = (int) pointOfEngagment.getY();

        Point p1 = new Point(xCoordinate + movement, yCoordinate);
        Point p2 = new Point(xCoordinate, yCoordinate + movement);
        Point p3 = new Point(xCoordinate + movement, yCoordinate + movement);

        pointsList.add(pointOfEngagment);
        pointsList.add(p1);
        pointsList.add(p2);
        pointsList.add(p3);

        System.out.println(pointOfEngagment.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());



        return pointsList;
    }



}
