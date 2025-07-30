# codeChallenge
Code Challenge for Taller


Jose Peixoto <js.peixotoalves@gmail.com>
17:04 (há 2 minutos)
para mim

import java.util.*;
import java.lang.*;
import java.io.*;

/**Length of the longest substring without repeating characters

Given a string str, find the length of the longest substring without repeating characters.

Example:
For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.

For “BBBB” the longest substring is “B”, with length 1.

For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7
**/

// The main method must be in a class named "Main".
class Main {
  public static void main(String[] args) {
    String longestString = null;
    int lengthForLongestString = 0;
    String str = "BABB";
    char[] caracteres = str.toCharArray();

    for (int i = 0; i < caracteres.length; i++) {
      if (lengthForLongestString == 0) {
        lengthForLongestString++;
        longestString += caracteres[i];
      } else {
        if (!longestString.indexOf(caracteres[i].string)) {
          longestString += caracteres[i];
          lengthForLongestString++;
        } else {
            lengthForLongestString++;
            longestString += caracteres[i];
            System.out.println("longestString = " + longestString.substring(1, lengthForLongestString));
            System.out.println("lengthForLongestString = " + (lengthForLongestString-1));
            longestString = null;
            lengthForLongestString = 0;
        }
      }
    }

  }
}
