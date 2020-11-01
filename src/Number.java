public class Number {
    char [] arr;
    String str;

    //get String
    void getString(String str){
        this.str =str;
    }

    // check if the digit 3 is a part of n-squared
    void checkIfNSQR(){
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
    }

    // print numerals in reverse order
    void reverse(){
        arr = str.toCharArray();
        int [] i = new int[str.length()];
        for (int j = arr.length-1, k = 0; j>=0; j--, k++)
            i[k] = Character.getNumericValue(arr[j]);
        for (int j: i)
            System.out.print(j);
        System.out.println();
    }

    // swap first and last numerals and print altered number
    void swap(){
        arr = str.toCharArray();
        char first = arr[0];
        char last = arr[arr.length-1];
        arr[0] = last;
        arr[arr.length-1] = first;
        String reverse = new String(arr);
        System.out.println(reverse);
    }

    // add 1's at the beginning and at the end of a numeral
    void add(){
        char[] alt = new char[arr.length+1];
        alt [0] = '1';
        alt [alt.length-1] = '1';
        for (int c = 0; c < alt.length-2; c++)
            alt[c+1] = arr[c];
        String one = new String(alt);
        System.out.println(one);
    }
}