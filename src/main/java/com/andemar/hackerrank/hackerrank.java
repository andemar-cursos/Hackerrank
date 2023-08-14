package com.andemar.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hackerrank {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bufferedReader.readLine().trim());

    if (isOdd(number)) {
      System.out.println("Weird");

    } else if(!isOdd(number) && inclusive(number, 2, 5)) {
      System.out.println("Not Weird");

    } else if(!isOdd(number) && inclusive(number, 6, 20)) {
      System.out.println("Weird");

    } else if(!isOdd(number) && inclusive(number, 21, 1000000)) {
      System.out.println("Not Weird");
    }

    bufferedReader.close();
  }

  private static boolean inclusive(int number, int min, int max) {
    return (number >= min) && (number <= max);
  }

  private static boolean isOdd(int number) {
    return (number%2) != 0;
  }


}

