package programmingExcercise;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class distanceTest {


  @Test
  void testDistance() {

    double test = programingExcercise.distance(1, 1, 2, 2, 3, 3);

    Assert.assertTrue(test >= 0);

  }

}
