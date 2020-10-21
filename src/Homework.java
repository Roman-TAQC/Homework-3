import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String address;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("What is your address?");
        address = br.readLine();
        System.out.println("Your name is: "+name+"\nYour address is: "+address);
    }
}