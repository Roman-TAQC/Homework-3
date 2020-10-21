import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, x, y;
        boolean flag = false;
        System.out.println("Enter value of a:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter value of b:");
        b = Integer.parseInt(br.readLine());
        System.out.println("Enter value of c:");
        c = Integer.parseInt(br.readLine());
        System.out.println("Enter value of x:");
        x = Integer.parseInt(br.readLine());
        System.out.println("Enter value of y:");
        y = Integer.parseInt(br.readLine());

        if(a<=x && b<=y || a<=y && b<=x)
            flag = true;
        if(a<=x && c<=y || a<=y && c<=x)
            flag = true;
        if(b<=x && c<=y || b<=y && c<=x)
            flag = true;

        if (flag)
            System.out.println("GREAT! The brick is small enough to fit in!");
        else
            System.out.println("Sorry the brick is too big, not today :(");
        }
    }