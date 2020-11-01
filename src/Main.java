import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double perimeter;
        double area;
        double radius;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the radius of a circle in centimeters:");
        radius = Double.parseDouble(br.readLine());
        perimeter = Circle.getPerimeter(radius);
        System.out.printf("The perimeter of a circle is: %.2f cm\n", perimeter);
        area = Circle.getArea(radius);
        System.out.printf("The area of the circle is: %.2f cm\n", area);
    }
}
