public class maxandmin {

    public static void min(int[] n) {
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("Minimum in arrray is :" + min);

    }

    public static void max(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }

           
        }
         System.out.println("Maximum number in array is : " + max);

    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
max(num);
min(num);
        


    }
}
