package mathods;

import java.util.Scanner;

public class permComb {
    public static int factorial(int v) {
        int result = 1;
        for (int i = v; i > 0; i--) {

            result = result * i;

        }
        return result;

    }

    public static double combination(int n, int r) {


if(n<0 || r<0 || n<r){ //valdation is imp -ive number fatorial is undefidned if r>n which 
    //mean when n-r => 3-5 =-2 again undefien so r<n should b 
System.out.println("Wrong input ");
return -1;
}

        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int diffRN = n - r;
        int diffRNFacorial = factorial(diffRN);
        int denominator = rFactorial * diffRNFacorial;
        return nFactorial / denominator;
    }

    public static int permutation(int n , int r ){
        if(n<0||r<0||n<r){
            System.out.println("Invalid Input ");
            return -1;
        }
        int nFactorial=factorial(n);
        int diffRN=n-r;
        int diffRNFacorial=factorial(diffRN);
        return nFactorial/diffRNFacorial;
    }

    public static void main(String[] args) {

        // combination formula
        // ncr=n!/r!(n-r)!

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of C : ");
        int c = sc.nextInt();
        System.out.print("Enter Value of R : ");
        int r = sc.nextInt();

        System.out.println( " The combination of given Values is:"+combination(c, r));
        
        System.out.println( " The permutaion  of given Values is:"+permutation(c, r));

    }
}
