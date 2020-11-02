import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args){
        double c1, c2, c3;
        int t1, t2, t3;
        double totalCost1, totalCost2, totalCost3;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("What is the cost per minute for the first call?");
            c1 = Double.parseDouble(br.readLine());
            System.out.println("What is the cost per minute for the second call?");
            c2 = Double.parseDouble(br.readLine());
            System.out.println("What is the cost per minute for the third call?");
            c3 = Double.parseDouble(br.readLine());
            System.out.println("How long did the first call last in minutes?");
            t1 = Integer.parseInt(br.readLine());
            System.out.println("How long did the second call last in minutes?");
            t2 = Integer.parseInt(br.readLine());
            System.out.println("How long did the third call last in minutes?");
            t3 = Integer.parseInt(br.readLine());
            totalCost1 = c1 * t1;
            totalCost2 = c2 * t2;
            totalCost3 = c3 * t3;
            System.out.printf("Total cost of the first call is $%.2f\n", totalCost1);
            System.out.printf("Total cost of the second call is $%.2f\n", totalCost2);
            System.out.printf("Total cost of the third call is $%.2f\n", totalCost3);
            System.out.printf("Total cost of all three calls combined is $%.2f\n", totalCost1 + totalCost2 + totalCost3);
        }catch (IOException exc){
            System.out.println("Input-Output exception");
        }catch (NumberFormatException number){
            System.out.println("Wrong format");
        }
    }
}