/**
 * Created by CostaHu on 2016/3/25.
 */
public class TestCircle1 {
    public static void main(String[] args) {

        Circle1 circle1 = new Circle1();
        System.out.println("The area of the circle of radius"+
        circle1.radius + " is " + circle1.getArea());

        Circle1 circle12 = new Circle1(25);
        System.out.println("The area of the circle of radius" +
        circle1.radius + " is "+ circle12.getArea());


    }
    static class Circle1{

        double radius;

        Circle1(){
            radius = 1.0;
        }

        Circle1(double newRadius){
            radius = newRadius;
        }
        double getArea(){
            return radius*radius*Math.PI;
        }
    }
}
