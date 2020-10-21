import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius, perimeter, area;
        System.out.println("Please enter the radius of a circle in centimeters:");
        radius = Double.parseDouble(br.readLine());
        perimeter = radius * 2 * Math.PI;
        System.out.printf("The perimeter of a circle is: %.2f cm\n", perimeter);
        area = radius * radius * Math.PI;
        System.out.printf("The area of the circle is: %.2f cm\n", area);
    }
}