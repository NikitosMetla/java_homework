package second_praktice;

public class Ball_class {
    public static class Ball{
        private double x;
        private double y;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double get_X(){
            return this.x;
        }

        public double get_Y(){
            return this.y;
        }

        public void set_X(double new_x){
            this.x = new_x;
        }

        public void set_Y(double new_y){
            this.y = new_y;
        }

        public void set_XY(double new_x, double new_y) {
            this.x = new_x;
            this.y = new_y;
        }

        @Override
        public String toString(){
            return "x = " + x + " y = " + y;
        }
    }

    public static class TestBall{
        public static void main(String[] args){
            Ball ball = new Ball(12.35, 17.89);
            System.out.println(ball.toString());
            System.out.println("--------------");
            ball.set_X(13.678);
            ball.set_Y(2345.5234);
            System.out.println(ball.toString());
            ball.set_XY(123.234, 12345.5467);
            System.out.println("--------------");
            System.out.println(ball.toString());
        }
    }

}
