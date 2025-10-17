package solid.ocp.exercise.solution;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
        
    }
}