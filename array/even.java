import java.util.Arrays;
public class even {

    public static int[] evennumbers(int[] n) {
          int[] evenArray={};
        for(int i=0;i<n.length;i++){
          
            if(n[i]%2==0){
               int[] newArray=new int[evenArray.length+1];
               for(int j=0;j<evenArray.length;j++){
newArray[j]=evenArray[j];
               }
               newArray[evenArray.length]=n[i];
               evenArray=newArray;
            }
            
        }
        return evenArray;
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,5,6,8,14,28};
int[] even=evennumbers(numbers);
System.out.println(Arrays.toString(even));
    }
}
