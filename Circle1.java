/**
 * Created by CostaHu on 2016/3/25.
 */
public class Circle1 {
    public static void main(String[] args) {

        Circle1 circle1 = new Circle1();
        System.out.println("The area of circle of radius " + circle1.radius +
                " is " +circle1.getArea() );

        Circle1 circle12 = new Circle1();
        System.out.println(circle12.toString());
    }
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
