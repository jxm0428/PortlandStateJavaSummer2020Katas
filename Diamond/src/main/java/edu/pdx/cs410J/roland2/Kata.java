package edu.pdx.cs410J.roland2;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    char target = args[0].toUpperCase().charAt(0);
    for(char cur = 'A'; cur < target; ++cur){
      int spaces = target - cur;
      String line = "";
      for(int i = 0; i < spaces; ++i){
        line += " ";
      }
      line += cur;
      if(cur != 'A') {
        for (int i = 0; i < (2 * (cur - 'A') - 1); ++i) {
          line += " ";
        }
        line += cur;
      }
      System.out.println(line);
    }
    for(char cur = target; cur >= 'A'; --cur){
      int spaces = target - cur;
      String line = "";
      for(int i = 0; i < spaces; ++i){
        line += " ";
      }
      line += cur;
      if(cur != 'A') {
        for (int i = 0; i < (2 * (cur - 'A') - 1); ++i) {
          line += " ";
        }
        line += cur;
      }
      System.out.println(line);
    }
  }
}