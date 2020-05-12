import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.next();
    scanner.close();

    int result = mininumSteps_toPalindrome(inputString);
    System.out.println(result);
  }

  /**
   * Calculates the minimum number of chars, added to the end ot the word, 
   * in order to compose a Palindrome.
   *
   * @return An integer, representing this minimum number of chars.
   */
  public static int mininumSteps_toPalindrome(String str) {

    int minimum_charsToAdd = 0;
    while (str.length() > 0 && isPalindrome(str) == false) {
      minimum_charsToAdd++;
      str = str.substring(1, str.length());
    }

    return minimum_charsToAdd;
  }

  private static boolean isPalindrome(String str) {

    for (int i = 0; i < str.length() / 2; i++) {

      char head = str.charAt(i);
      char tail = str.charAt(str.length() - 1 - i);

      if (head != tail) {
        return false;
      }
    }

    return true;
  }
}
