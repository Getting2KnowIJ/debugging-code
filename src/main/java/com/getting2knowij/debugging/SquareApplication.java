package com.getting2knowij.debugging;

public class SquareApplication {
  public static void main(String[] args) {
    Square square = new Square("Square for running");

    String squareDetails = square.toString();

    System.out.println(squareDetails);
  }
}
