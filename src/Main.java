import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Number num = new Number();
        System.out.println("Enter a number:");
        // get a number
        num.getString(br.readLine());
        // check if the digit 3 is a part of n-squared
        num.checkIfNSQR();
        // print numerals in reverse order
        num.reverse();
        // swap first and numerals and print altered number
        num.swap();
        // add 1's at the beginning and at the end of a numeral
        num.add();
    }
}
