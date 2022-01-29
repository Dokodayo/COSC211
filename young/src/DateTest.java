import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DateTest {

  int testDay = 6;
  int testMonth = 9;
  int testYear = 1997;
  Date date = new Date(testMonth, testDay, testYear);


  @Test
  public void testReadInputDay() {
    Assert.assertTrue(date.getDay() == testDay);
  }

  @Test
  public void testReadInputMonth() {
    Assert.assertTrue(date.getMonth() == testMonth);
  }

  @Test
  public void testReadInputYear() {
    Assert.assertTrue(date.getMonth() == testMonth);
  }

}
