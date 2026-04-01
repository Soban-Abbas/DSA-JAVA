import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] = 2;
        // numbers[1] = 4;
        // numbers[2] = 6;
        // numbers[3] = 8;
        // numbers[4] = 10;
        // System.out.println(numbers.length);
        // System.out.println("Marks are : " + Arrays.toString(numbers));

Scanner sc=new Scanner(System.in);

        //another way of dec and inilize values in array
String[] names= new String[5];

for(int i=0;i<names.length;i++){
    int n=i+1;
    System.out.println("Enter User : "+ n);
    names[i]=sc.nextLine();
   // sc.nextLine();
}

System.out.println("Names are : " + Arrays.toString(names));

    }
}

