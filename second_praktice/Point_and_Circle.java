package second_praktice;

public class Point_and_Circle {
    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    public static class Circle {
        private Point center;
        private double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public double getRadius() {
            return radius;
        }
    }

   public static class Tester {
        public static void main(String[] args) {
            Point point = new Point(2.0, 3.0);
            Circle circle = new Circle(point, 5.0);
            Circle[] circles = new Circle[3];
            circles[0] = new Circle(new Point(0.0, 0.0), 2.0);
            circles[1] = new Circle(new Point(1.0, 1.0), 3.0);
            circles[2] = circle;
            for (int i = 0; i < circles.length; i++) {
                Circle currentCircle = circles[i];
                Point currentCenter = currentCircle.getCenter();
                System.out.println("Circle " + (i + 1) + ":");
                System.out.println("Center: (" + currentCenter.getX() + ", " + currentCenter.getY() + ")");
                System.out.println("Radius: " + currentCircle.getRadius());
                System.out.println("--------------");
            }
        }
    }

}
