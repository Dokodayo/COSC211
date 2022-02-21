package pgExcercise11_12;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class sumTest {

  @Test
  void testSum() {
    System.out.println("Array has 1, 2, 3, 4, 5");
    double[] list = {1, 2, 3, 4, 5};
    double test = ex11_12.sum(list);

    Assert.assertTrue(test == 15);

  }

}
