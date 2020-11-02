import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) {
        String name;
        String address;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("What is your name?");
            name = br.readLine();
            System.out.println("What is your address?");
            address = br.readLine();
            System.out.println("Your name is: "+name+"\nYour address is: "+address);
        } catch(IOException exc){
            System.out.println("Input-Output Error" + exc);
        }
    }
}