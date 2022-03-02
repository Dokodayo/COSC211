package pgExcercise11_12;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class sumTest {

  @Test
  public void sumTest() {

    ArrayList<Double> testL = new ArrayList<>();

    testL.add(1.0);
    testL.add(2.0);
    testL.add(3.0);
    testL.add(4.0);
    testL.add(5.3);

    // call double method
    double actual = Ex11_12.sum(testL);
    double expected = 15.3;

    Assert.assertEquals(expected, actual, 0.0000001);

    // assertEquals(expected, actual);



  }

}
