import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;


public class MathAddExactSpike {

@Test
public void testAddExact_simple() {
  int actual = Math.addExact(4, 5);
  int expected = 9;
  assertEquals(expected, actual);
}

@Test
public void testAddExact_asInJava() {
  long actualLong = 2_000_000_000 + 1_987_654_321;
  long expectedLong = 3_987_654_321L;
  assertEquals(expectedLong, actualLong);
}

@Test
public void testAddExact_long() {
  long actualLong = Math.addExact(2_000_000_000L, 1_987_654_321);
  long expectedLong = 3_987_654_321L;
  assertEquals(expectedLong, actualLong);
}

@Test(expected=ArithmeticException.class)
public void testAddExact_tooBig() {
  long actualLong = Math.addExact(2_000_000_000, 1_987_654_321);
      // Throws ArithmeticException("integer overflow")
  long expectedLong = 3_987_654_321L;      // never executed
  assertEquals(expectedLong, actualLong);  // never executed
}

@Test
public void testOrdinaryDivision() {
  double actual = 1 / 3.0;
  float expected = 1 / 3.0f;
//  System.out.println("Diff: " + (actual - expected));
  assertEquals(expected, actual, .0000001);
}


}
