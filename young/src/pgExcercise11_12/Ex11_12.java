package pgExcercise11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_12 {

  /*
  public static void main(String[] args) {
    // Main Method

    // Creating Scanner
    Scanner input = new Scanner(System.in);
    // Ask user to input
    System.out.print("Enter 5 numbers: ");
    // Creating array
    ArrayList<Double> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      list.add(input.nextDouble());
    }
    // Display the sum of the list
    System.out.println("Sum of inputs are: " + sum(list));
  }
*/
  
  // Return the numbers to ArrayList
  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (double i : list) {
      sum += i;
    }
    return sum;
  }

}
