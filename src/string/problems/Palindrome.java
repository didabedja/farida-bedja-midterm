package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String mom, dad ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the words are palindrome or not palindrome");
        mom = sc.nextLine();
        int i, n = mom.length();
        for (i = n-1; i>=0; i--)
        {
            dad = dad+ mom.charAt(i) ;
        }
        if(mom.equalsIgnoreCase(dad))
        {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }

    }
}