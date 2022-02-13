package programmingExcercise;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class inputArrayTest {

  @Test
  void testInputArray() {
    System.out.println("Enter 4, 5, 10");


    double[] myArr = programingExcercise.inputArray();

    Assert.assertTrue(myArr[0] == 4);
    Assert.assertTrue(myArr[1] == 5);
    Assert.assertTrue(myArr[2] == 10);
    Assert.assertTrue(myArr.length == 3);

  }

}
