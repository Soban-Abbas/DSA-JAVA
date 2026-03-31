package mathods;

import java.util.Scanner;

public class maxof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd Number :");
        double n2 = sc.nextDouble();
        System.out.print("Enter 3rd Number :");
        double n3 = sc.nextDouble();
  double max=Math.max(n1,Math.max(n2, n3));
  System.out.println("Maximum Number is "+ max);
    }
}
