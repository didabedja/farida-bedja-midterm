package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            for (i = 1; i <= rows - i; i++) {
                System.out.print(" ");
            }

            for ( i = 1; i <= 2 * i - 1; i++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}