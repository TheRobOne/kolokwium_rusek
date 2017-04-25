import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by maciek on 4/25/17.
 */
public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void setUp(){
        rectangle = new Rectangle();
    }

    @Test
    public void generateRectanglePointsTest(){
        Point p0 = new Point(0,0);
        Point p1 = new Point(1,0);
        Point p2 = new Point(0,1);
        Point p3 = new Point(1,1);


        ArrayList<Point> pointsList;

        pointsList = rectangle.generateRectanglePoints(p0, 1);

        ArrayList<Point> categories = new ArrayList<Point>();

        categories.add(p0);
        categories.add(p1);
        categories.add(p2);
        categories.add(p3);

        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        Assert.assertTrue(pointsList.equals(categories));
    }
}
