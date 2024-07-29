public class Circle {

	private String name; // declare the private String instance name
	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// ----------------------------------------------
	// getName - returns the value of name
	// ----------------------------------------------
	public String getName() {
		return name;
		// Your code goes here
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return x;
		// Your code goes here
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String n) {
		name = n;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double num) {
		x = num;
		// Your code goes here
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double num) {
		y = num;
		// Your code goes here
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double num) {
		if (num >= 0) {
			radius = num;

		} else {

		}
		// Your code goes here
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		return Math.PI * radius * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		return 2 * Math.PI * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		return 2 * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (Double.compare(x, 0) == 0 && Double.compare(y, 0) == 0 && Double.compare(radius, 1) == 0) {
			return true;
		} else {
			return false;
		}
		// Your code goes here
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {
		return "name: " + name + "\ncenter: (" + x + ", " + y + ")\nradius: " + radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// equals - return true when the radius and centers of
	// both circles are the same and false otherwise.
	// --------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		if (Double.compare(anotherCircle.getX(), x) == 0 && Double.compare(anotherCircle.getY(), y) == 0
				&& Double.compare(anotherCircle.getRadius(), radius) == 0) {
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------
	// distance - return distance between the center of the
	// two circles.
	// --------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(anotherCircle.getX() - x, 2) + Math.pow(anotherCircle.getY() - y, 2));
	}

	// --------------------------------------------------------
	// isSmaller - return true if the circle executing the
	// method is smaller than the parameter
	// circle and false otherwise.
	// --------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		if (Double.compare(radius, anotherCircle.getRadius()) < 0) {
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------
	// compareTo - return 1 if the circle executing is bigger,
	// return -1 if the circle executing is
	// smaller, and return 0 otherwise.
	// --------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if (Double.compare(radius, anotherCircle.getRadius()) > 0) {
			return 1;
		} else if (Double.compare(radius, anotherCircle.getRadius()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	// --------------------------------------------------------
	// intersects - return 1 if the circle executing is bigger,
	// return -1 if the circle executing is
	// smaller, and return 0 otherwise.
	// --------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.getRadius())) {
			return true;
		} else {
			return false;
		}
	}
}