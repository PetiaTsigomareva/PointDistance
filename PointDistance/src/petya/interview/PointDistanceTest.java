package petya.interview;

import java.util.ArrayList;
import java.util.List;

public class PointDistanceTest {
	public static void main(String[] args) {

		Point point = new Point(2, 2);
		Point nearestPoint;
		List<Point> nearestTwoPoint = new ArrayList<Point>();

		List<Point> pointsList = new ArrayList<Point>();

		pointsList.add(new Point(3, 2));
		pointsList.add(new Point(4, 2));
		pointsList.add(new Point(1, 2));
		pointsList.add(new Point(5, 2));
		pointsList.add(new Point(3, 6));
		pointsList.add(new Point(4, 1));
		pointsList.add(new Point(0, 2));

		nearestPoint = point.getNearestPoint(pointsList);

		System.out.println(" The min distance is between point " + point
				+ " and point " + nearestPoint + " = " + point.getDistance(nearestPoint));

		nearestTwoPoint = Point.getNearestTwoPointsFromList(pointsList);

		System.out.println(" The min distance is between point " + nearestTwoPoint.get(0) + " and point " + nearestTwoPoint.get(1) + " = "
				+ nearestTwoPoint.get(0).getDistance(nearestTwoPoint.get(1)));
	}
}