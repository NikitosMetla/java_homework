package second_praktice;
import java.util.Objects;

public class Circles_class {

    public static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        public boolean equals(Circle otherCircle) {
            return this.radius == otherCircle.radius;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Circle circle = (Circle) obj;
            return Double.compare(circle.radius, radius) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(radius);
        }
    }

    public static class CircleTest {
        public static void main(String[] args) {
            Circle circle1 = new Circle(5.0);
            Circle circle2 = new Circle(7.5);

            System.out.println("Radius of circle1: " + circle1.getRadius());
            circle1.setRadius(8.0);
            System.out.println("New radius of circle1: " + circle1.getRadius());

            System.out.println("Area of circle2: " + circle2.calculateArea());

            System.out.println("Circumference of circle2: " + circle2.calculateCircumference());

            if (circle1.equals(circle2)) {
                System.out.println("Circle1 and Circle2 have the same radius.");
            } else {
                System.out.println("Circle1 and Circle2 have different radius = "
                        + (circle1.getRadius() - circle2.getRadius()));
            }
        }
    }

}
