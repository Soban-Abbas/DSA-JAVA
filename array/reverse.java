import java.util.Arrays;

public class reverse {


    public static int[] reverseArray(int[] numArray){


        int[] newReverseArray=new int[numArray.length];
         int index=0;
        for(int i=numArray.length-1;i>=0;i--){
           
            newReverseArray[index]=numArray[i];
            index++;
        }
return newReverseArray;
        
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
     int[] reverse= reverseArray(numbers);
     System.out.println("Original Array : "+ Arrays.toString(numbers));
     System.out.println("reverse array : " +Arrays.toString(reverse));
    }
}
