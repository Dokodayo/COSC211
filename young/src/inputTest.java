
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class inputTest {


  int testDay = 6;
  int testMonth = 9;
  int testYear = 1997;
  String Month2;
  String testMonthString = "January"; // return 1 -> month2num will be 1
  Date date = new Date(testMonth, testDay, testYear);
  Date date2 = new Date(testMonthString, testDay, testYear);
  int month2num = 1; // expect this value


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

  @Test
  public void testReadInputMonthString() {
    Assert.assertTrue(date2.getMonth() == month2num);
    // date2 give value to month2num
  }


}
