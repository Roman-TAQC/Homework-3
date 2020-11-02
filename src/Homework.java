import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) {
        double radius, perimeter, area;

            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
                System.out.println("Please enter the radius of a circle in centimeters:");
                radius = Double.parseDouble(br.readLine());
                perimeter = radius * 2 * Math.PI;
                System.out.printf("The perimeter of a circle is: %.2f cm\n", perimeter);
                area = radius * radius * Math.PI;
                System.out.printf("The area of the circle is: %.2f cm\n", area);
            }catch (IOException exc){
                System.out.println("Input-Output exception");
            }catch (NumberFormatException number){
                System.out.println("You entered a symbol, not a number");
        }
    }
}