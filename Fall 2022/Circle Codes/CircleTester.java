public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		if (Double.compare(circle1.getX(), -3.0) == 0 && Double.compare(circle1.getY(), 4.0) == 0)
			System.out.println("PASSED: Set X and Y");
		else
			System.out.println("FAILED: Set X and Y");

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why? Since calling the circle it's self will print
		// automatically call the toString method
		System.out.println("circle1=" + circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		if (Double.compare(circle2.getRadius(), 5.3) == 0)
			System.out.println("PASSED: Set radius");
		else
			System.out.println("FAILED: Set radius");

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("circle2=" + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("circle1 \ndiameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: "
				+ circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle2 \ndiameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: "
				+ circle2.perimeter());

		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle() == true) {
			System.out.println("circle1 is a unit circle");
		} else {
			System.out.println("circle1 is NOT a unit circle");
		}

		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true) {
			System.out.println("circle2 is a unit circle");
		} else {
			System.out.println("circle2 is NOT a unit circle");
		}

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// creating a instance of a unit circle and checking if the unit circle method
		// can detect it
		circle1.setX(0);
		circle1.setY(0);
		circle1.setRadius(1);
		System.out.println("\ncircle1=" + circle1);
		System.out.println("circle2=" + circle2);

		if (Double.compare(circle1.getX(), 0) == 0 && Double.compare(circle1.getY(), 0) == 0
				&& Double.compare(circle1.getRadius(), 1) == 0)
			System.out.println("PASSED: Set x, y, and radius");
		else
			System.out.println("FAILED: Set x, y, and radius");

		if (circle1.isUnitCircle() == true)
			System.out.println("PASSED: circle1 is a Unit Circle");
		else
			System.out.println("FAILED: circle1 is NOT a Unit Circle");

		// the area of the unit circle is PI
		if (Double.compare(circle1.area(), Math.PI) == 0)
			System.out.println("PASSED: Area of a Unit Circle is " + circle1.area());
		else
			System.out.println("FAILED: Area of a Unit Circle is NOT" + circle1.area());

		// the perimeter of a unit circle is 2PI
		if (Double.compare(circle1.perimeter(), 2 * Math.PI) == 0)
			System.out.println("PASSED: Perimeter of a Unit Circle is " + circle1.perimeter());
		else
			System.out.println("FAILED: Perimeter of a Unit Circle is NOT" + circle1.perimeter());

		// the diameter of a unit circle is 2
		if (Double.compare(circle1.diameter(), 2) == 0)
			System.out.println("PASSED: diameter of a Unit Circle is " + circle1.diameter());
		else
			System.out.println("FAILED: diameter of a Unit Circle is NOT" + circle1.diameter());

		// circle1 should not be equal to circle2
		if (circle1.equals(circle2) == false)
			System.out.println("PASSED: circle1 is NOT the exact same circle2");
		else
			System.out.println("FAILED: circle1 is the exact same circle2");

		// circle1 should be the same size as circle2
		if (circle1.compareTo(circle2) != 0)
			System.out.println("PASSED: circle1 is NOT the same size as circle2");
		else
			System.out.println("FAILED: circle1 is the same size as circle2");

		// circle1 should be smaller than circle2
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: circle1 is smaller than circle2");
		else
			System.out.println("FAILED: circle1 is NOT smaller than circle2");

		// circle 1 should intersect circle2
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: circle1 intersects circle2");
		else
			System.out.println("FAILED: circle1 does NOT intersects circle2");

		circle2.setRadius(1);
		if (Double.compare(circle1.getRadius(), 1) == 0)
			System.out.println("PASSED: Set radius");
		else
			System.out.println("FAILED: Set radius");

		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);
		// circle2 has the size of a unit circle but is not since its points is not 0,0
		// its not a unit circle
		if (circle2.isUnitCircle() == false)
			System.out.println("PASSED: circle2 is NOT a unit circle");
		else
			System.out.println("FAILED: circle2 is a unit circle");

		// circle 1 should NOT intersect circle2
		if (circle2.intersects(circle2) == false)
			System.out.println("PASSED: circle1 does NOT intersects circle2");
		else
			System.out.println("FAILED: circle1 does intersects circle2");

		// the area of circle2 is PI
		if (Double.compare(circle2.area(), Math.PI) == 0)
			System.out.println("PASSED: Area of circle2 is " + circle2.area());
		else
			System.out.println("FAILED: Area of circle2 is NOT" + circle2.area());

		// the perimeter of circle2 is 2PI
		if (Double.compare(circle2.perimeter(), 2 * Math.PI) == 0)
			System.out.println("PASSED: Perimeter of circle2 is " + circle2.perimeter());
		else
			System.out.println("FAILED: Perimeter of circle2 is NOT" + circle2.perimeter());

		// the diameter of circle2 is 2
		if (Double.compare(circle2.diameter(), 2) == 0)
			System.out.println("PASSED: diameter of circle2 is " + circle2.diameter());
		else
			System.out.println("FAILED: diameter of circle2 is NOT" + circle2.diameter());

		// circle2 does not equals circle1 because the point is different
		if (circle2.equals(circle1) == false)
			System.out.println("PASSED: circle2 is NOT the same as circle1");
		else
			System.out.println("FAILED: circle2 is the same as circle1");

		// test for radius of negative should not change
		circle1.setRadius(-1);
		if (circle1.getRadius() != -1)
			System.out.println("PASSED: radius can NOT be -1");
		else
			System.out.println("FAILED: radius can be -1");

		System.out.println("circle1=" + circle1);

		// circle2 should be equal is size to circle1
		if (circle2.compareTo(circle1) == 0)
			System.out.println("PASSED: circle2 and circle1 is the same size");
		else
			System.out.println("FAILED: circle2 and circle1 is NOT the same size");

		// circle2 should NOT be smaller circle1
		if (circle2.isSmaller(circle1) == false)
			System.out.println("PASSED: circle2 is NOT smaller than circle1");
		else
			System.out.println("FAILED: circle2 is smaller than circle1");

		// set circle2 to 0,1
		circle2.setX(0.0);
		circle2.setY(1.0);
		if (Double.compare(circle2.getX(), 0) == 0 && Double.compare(circle2.getY(), 1) == 0)
			System.out.println("PASSED: Set x and y");
		else
			System.out.println("FAILED: Set x and y");

		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// circle2 should be 1 unit away from circle1
		if (Double.compare(circle2.distance(circle1), 1) == 0)
			System.out.println("PASSED: circle2 is " + circle2.distance(circle1) + " unit away from circle1");
		else
			System.out.println("FAILED: circle2 is " + circle2.distance(circle1) + " unit away from circle1");

		// circle2 should NOT intersect circle1
		if (circle2.intersects(circle1))
			System.out.println("PASSED: circle2 intersects circle1");
		else
			System.out.println("FAILED: circle2 does NOT intersects circle1");

		// set circle2 to 1,0
		circle2.setX(1.0);
		circle2.setY(0.0);
		if (Double.compare(circle2.getX(), 1) == 0 && Double.compare(circle2.getY(), 0) == 0)
			System.out.println("PASSED: Set x and y");
		else
			System.out.println("FAILED: Set x and y");

		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// circle2 should be 1 unit away from circle1
		if (Double.compare(circle2.distance(circle1), 1) == 0)
			System.out.println("PASSED: circle2 is " + circle2.distance(circle1) + " unit away from circle1");
		else
			System.out.println("FAILED: circle2 is " + circle2.distance(circle1) + " unit away from circle1");

		// set circle2 to 3,4
		circle2.setX(3.0);
		circle2.setY(4.0);
		circle1.setRadius(Math.PI);
		if (Double.compare(circle2.getX(), 3) == 0 && Double.compare(circle2.getY(), 4) == 0
				&& Double.compare(circle1.getRadius(), Math.PI) == 0)
			System.out.println("PASSED: Set x, y, and radius");
		else
			System.out.println("FAILED: Set x, y, and radius");

		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// circle2 should be 1 unit away from circle1
		if (Double.compare(circle2.distance(circle1), 5) == 0)
			System.out.println("PASSED: circle2 is " + circle2.distance(circle1) + " unit away from circle1");
		else
			System.out.println("FAILED: circle2 is " + circle2.distance(circle1) + " unit away from circle1");

		// circle1 area should be pi * pi * pi
		if (Double.compare(circle1.area(), Math.PI * circle1.getRadius() * circle1.getRadius()) == 0)
			System.out.println("PASSED: circle1 has an area of " + circle1.area());
		else
			System.out.println("FAILED: circle1 has an area of " + circle1.area());

		// circle1 perimeter should be 2 * pi * pi
		if (Double.compare(circle1.perimeter(), 2 * Math.PI * circle1.getRadius()) == 0)
			System.out.println("PASSED: circle1 has an perimeter of " + circle1.perimeter());
		else
			System.out.println("FAILED: circle1 has an perimeter of " + circle1.perimeter());

		// circle1 diameter should be 2 * pi
		if (Double.compare(circle1.diameter(), 2 * circle1.getRadius()) == 0)
			System.out.println("PASSED: circle1 has an diameter of " + circle1.diameter());
		else
			System.out.println("FAILED: circle1 has an diameter of " + circle1.diameter());

		// circle1 is NOT a unit circle
		if (circle1.isUnitCircle() == false)
			System.out.println("PASSED: circle1 is NOT a unit circle");
		else
			System.out.println("FAILED: circle1 is a unit circle");

		// circle1 is NOT smaller than circle2
		if (circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: circle1 is NOT smaller than circle2");
		else
			System.out.println("FAILED: circle1 is smaller than circle2");

		// circle1 is NOT the same size as circle2
		if (circle1.compareTo(circle2) != 0)
			System.out.println("PASSED: circle1 is NOT the same size as circle2");
		else
			System.out.println("FAILED: circle1 is the same size as circle2");

		// Set circle2 to 0,0 and radius pi
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(Math.PI);
		if (Double.compare(circle2.getX(), 0) == 0 && Double.compare(circle2.getY(), 0) == 0
				&& Double.compare(circle2.getRadius(), Math.PI) == 0)
			System.out.println("PASSED: Set x, y, and radius");
		else
			System.out.println("FAILED: Set x, y, and radius");

		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// circle2 equals circle1
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: circle2 is the exact same as circle1");
		else
			System.out.println("FAILED: circle2 is NOT the exact same as circle1");
	}

}