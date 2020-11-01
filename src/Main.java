import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Brick brick = new Brick();
        System.out.println("Enter value of a:");
        brick.getValue(Integer.parseInt(br.readLine()));
        System.out.println("Enter value of b:");
        brick.getValue(Integer.parseInt(br.readLine()));
        System.out.println("Enter value of c:");
        brick.getValue(Integer.parseInt(br.readLine()));
        System.out.println("Enter value of x:");
        brick.getValue(Integer.parseInt(br.readLine()));
        System.out.println("Enter value of y:");
        brick.getValue(Integer.parseInt(br.readLine()));
        brick.Check();
    }
}
