package programmingExcercise;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class cloestPointsTest {

  @Test
  void testClosestPoints() {
    // test size of array type of value
    // 33 53

    double[][] testArr1 = new double[][] {{2, 4, 5}, {12, 52, 33}, {3, 4, 1}};


    int[] pointsArr1 = programingExcercise.closestPoints(testArr1); // output int arr

    Assert.assertTrue(pointsArr1[0] == 0); // p1 & index
    Assert.assertTrue(pointsArr1[1] == 2); // p2 & index


  }


  @Test
  void testClosestPoints1() {

    double[][] testArr2 =
        new double[][] {{12, 52, 33}, {2, 4, 5}, {3, 4, 1}, {31, 12, 3}, {7, 21, 9}};
    // p1 = index


    int[] pointsArr2 = programingExcercise.closestPoints(testArr2); // output int arr

    Assert.assertTrue(pointsArr2[0] == 1); // p1 & index
    Assert.assertTrue(pointsArr2[1] == 2); // p2 & index


    // 8.7
  }

}
