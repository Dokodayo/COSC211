package programmingExcercise;

import java.util.Scanner;

public class programingExcercise {

  private static double[][] inputArray;
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {


    System.out.println("Enter number of points:");

    int numberofPoints = sc.nextInt(); // receive number of points

    inputArray = new double[numberofPoints][3]; //

    System.out.println("Please enter value for the number of points");

    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = inputArray();
    }

    int[] closestPointArr = closestPoints(inputArray);

    displayClosestPoints(closestPointArr[0], closestPointArr[1]);

  }

  public static double[] inputArray() {

    double[] tempArray = new double[3]; // x,y,z inside

    tempArray[0] = sc.nextDouble();
    tempArray[1] = sc.nextDouble();
    tempArray[2] = sc.nextDouble();

    return tempArray;
  }

  /** Compute the distance between two points (x1, y1) and (x2, y2) */
  public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
  }

  public static int[] closestPoints(double[][] inputArray) {

    // indices in the point array. Setting initial two points with var p1 and var p2
    int p1 = 0, p2 = 1;
    double shortestDistance = distance(inputArray[p1][0], inputArray[p1][1], inputArray[p1][2],
        inputArray[p2][0], inputArray[p2][1], inputArray[p2][2]); //

    for (int i = 0; i < inputArray.length; i++) {
      for (int j = i + 1; j < inputArray.length; j++) {
        double distance = distance(inputArray[i][0], inputArray[i][1], inputArray[i][2],
            inputArray[j][0], inputArray[j][1], inputArray[j][2]);

        if (shortestDistance > distance) {
          p1 = i; // giving updated value to p1 and p2
          p2 = j;
          shortestDistance = distance; // update the distance too
        }
      }
    }

    int[] closestPointArr = new int[] {p1, p2};
    return closestPointArr;

  }

  public static void displayClosestPoints(int p1, int p2) {
    System.out.println("The closest two points are " + "(" + inputArray[p1][0] + ", "
        + inputArray[p1][1] + ", " + inputArray[p1][2] + ") and (" + inputArray[p2][0] + ", "
        + inputArray[p2][1] + ", " + inputArray[p2][2] + ")");

  }

}
