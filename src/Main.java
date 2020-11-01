import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Call call = new Call();
        System.out.println("What is the cost per minute for the first call?");
        call.getCost(Double.parseDouble(br.readLine()));
        System.out.println("What is the cost per minute for the second call?");
        call.getCost(Double.parseDouble(br.readLine()));
        System.out.println("What is the cost per minute for the third call?");
        call.getCost(Double.parseDouble(br.readLine()));
        System.out.println("How long did the first call last in minutes?");
        call.getTime(Integer.parseInt(br.readLine()));
        System.out.println("How long did the second call last in minutes?");
        call.getTime(Integer.parseInt(br.readLine()));
        System.out.println("How long did the third call last in minutes?");
        call.getTime(Integer.parseInt(br.readLine()));
        call.totalCost();
        call.combinedCost();
    }
}
