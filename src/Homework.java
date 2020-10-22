import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        String str = br.readLine();
        char [] arr;

        // check if the digit 3 is a part of n-squared
        int num = Integer.parseInt(str);
        num *= num;
        String s = Integer.toString(num);
        arr = s.toCharArray();
        boolean flag = false;
        for (char c: arr){
            if (c == '3'){
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Digit 3 is a part of "+str+"-squared");
        else
            System.out.println("Digit 3 is not a part of "+str+"-squared");

        // print the numerals in reverse order
        arr = str.toCharArray();
        int [] i = new int[str.length()];
        for (int j = arr.length-1, k = 0; j>=0; j--, k++)
            i[k] = Character.getNumericValue(arr[j]);
        for (int j: i)
            System.out.print(j);
        System.out.println();

        // swap first and last numerals and print altered number
        arr = str.toCharArray();
        char first = arr[0];
        char last = arr[arr.length-1];
        arr[0] = last;
        arr[arr.length-1] = first;
        String reverse = new String(arr);
        System.out.println(reverse);

        // add 1's at the beginning and at the end of a numeral
        char[] alt = new char[arr.length+1];
        alt [0] = '1';
        alt [alt.length-1] = '1';
        for (int c = 0; c < alt.length-2; c++)
            alt[c+1] = arr[c];
        String one = new String(alt);
        System.out.println(one);
    }
}