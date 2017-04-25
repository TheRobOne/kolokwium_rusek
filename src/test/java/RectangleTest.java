import org.junit.Assert;
import org.junit.Test;

import java.awt.Point;
import java.util.ArrayList;

/**
 * Created by maciek on 4/25/17.
 */
public class RectangleTest {

    @Test
    public void generateRectanglePointsTest(){
        Point p0 = new Point(0,0);
        Point p1 = new Point(0,1);
        Point p2 = new Point(1,0);
        Point p3 = new Point(1,1);

        Rectangle rectangle = new Rectangle();
        ArrayList<Point> pointsList = new ArrayList<Point>();

        pointsList = rectangle.generateRectanglePoints(p0, 1);

        ArrayList<Point> categories = new ArrayList<Point>();

        categories.add(p0);
        categories.add(p1);
        categories.add(p2);
        categories.add(p3);

        Assert.assertTrue(pointsList.equals(categories));
    }
}
