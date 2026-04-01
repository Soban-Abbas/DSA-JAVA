import java.util.Scanner;

public class sumandAvg {

    public static double avg(int[] num) {
        int sum = sum(num);

        double avg = (double)sum / num.length;

        return avg;
    }

    public static int sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // another way of dec and inilize values in array
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            int n = i + 1;
            System.out.print("Enter number  " + n + " : ");
            numbers[i] = sc.nextInt();
            // sc.nextLine();
        }


        double avg=avg(numbers);
        System.out.println("Avg of numbers are : "+ avg);

    }
}
