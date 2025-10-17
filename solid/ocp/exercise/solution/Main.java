package solid.ocp.exercise.solution;

public class Main {

	public static void main(String[] args) {

        System.out.println("Circle Area: " + Calculator.calculateArea(new Circle(5)));
        System.out.println("Rectangle Area: " + Calculator.calculateArea(new Rectangle(4, 6)));
        System.out.println("Triangle Area: " + Calculator.calculateArea(new Triangle(8, 2)));
        System.out.println("Parallelogram Area: " + Calculator.calculateArea(new Parallelogram(8, 3)));

	}

}