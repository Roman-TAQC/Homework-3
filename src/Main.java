import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person person = new Person();
        System.out.println("What is your name?");
        person.setName(br.readLine());
        System.out.println("What is your address?");
        person.setAddress(br.readLine());
        System.out.println("Your name is: " + person.getName() + "\nYour address is: " + person.getAddress());
    }
}
