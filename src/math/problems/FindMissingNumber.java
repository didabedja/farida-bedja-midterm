package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int sum1=0;
        for(int i=0;i<array.length;i++){
            sum1=sum1+array[i];}

        int sum2 = 0;
        for(int i=1;i<10;i++)
        {
            sum2=sum1+1;
        }
        System.out.println(sum2-sum1);

    }
}