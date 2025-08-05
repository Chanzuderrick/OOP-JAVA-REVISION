import java.lang.Math;
public class Circle extends Shape {
    double radius;

    //constructor

    Circle(double radius) {
        this.radius = radius;

    }

    @Override
    double area(){
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

}