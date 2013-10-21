package petya.interview;

import java.util.ArrayList;
import java.util.List;

public class Point {

	private double x;

	private double y;

	public Point() {
		super();
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double getDistance(Point point) {

		double result;

		result = Math.sqrt(((this.x - point.x) * (this.x - point.x)) + ((this.y - point.y) * (this.y - point.y)));

		return result;
	}

	public Point getNearestPoint(List<Point> points) {
		double distance;
		double minDistance = Double.MAX_VALUE;
		Point resultPoint = null;

		for (Point point : points) {
			distance = getDistance(point);

			if (distance < minDistance) {
				minDistance = distance;
				resultPoint = point;
			}
		}
		return resultPoint;
	}

	public static List<Point> getNearestTwoPointsFromList(List<Point> points) {
		List<Point> resultList = new ArrayList<Point>();
		double distance;
		double minDistance = Double.MAX_VALUE;

		for (int i = 0; i < points.size(); i++) {
			for (int j = i + 1; j < points.size(); j++) {
				distance = points.get(i).getDistance(points.get(j));

				if (distance < minDistance) {
					minDistance = distance;
					resultList.clear();
					resultList.add(points.get(i));
					resultList.add(points.get(j));
				}
			}
		}

		return resultList;

	}
}
