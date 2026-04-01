import java.util.Scanner;

public class search {

    public static void searchNumber(int num,int[] numArray){
        for(int i=0;i<numArray.length;i++){
            if(num==numArray[i]){
                System.out.println("The Number "+ num+ " is present at index :" + i +" in array");
                return;
            }
           
        }
         System.out.println("The Number is not present in array ");

        
    }
    public static void main(String[] args) {
        int[] numberArray={1,2,3,4,56,78,8,84,67};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number want to search from Array ");
        int searchNumber=sc.nextInt();
    
searchNumber(searchNumber,numberArray);
    }
}
