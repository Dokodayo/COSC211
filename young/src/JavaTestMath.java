
public class JavaTestMath {

public static void testAddExact_simple() {
  int actual = Math.addExact(4, 6);
  int expected = 10;
  if (actual != expected) pr("Uh, oh " + actual + " should be " + expected);
}

public static void testAddExact_asInJava() {
  long actualLong = 2_000_000_000 + 1_987_654_321;
  long expectedLong = 3_987_654_321L;
  if (actualLong != expectedLong) pr("Uh, oh, " + actualLong + " should be " + expectedLong);
}

public static void testAddExact_long() {
  long actualLong = Math.addExact(2_000_000_000L, 1_987_654_321);
  long expectedLong = 3_987_654_321L;
  if (actualLong != expectedLong) pr("Uh, oh, " + actualLong + " should be " + expectedLong);
}

public static void testAddExact_tooBig() {
  long actualLong = Math.addExact(2_000_000_000, 1_987_654_321);
  long expectedLong = 3_987_654_320L; //3_987_654_321L;
  if (actualLong != expectedLong) pr("Uh, oh, " + actualLong + " should be " + expectedLong);
}

private static void pr(String s) {
  System.out.println(s);
}

public static void main(String[] args) {
  testAddExact_simple();
  testAddExact_asInJava();
  testAddExact_long();
  testAddExact_tooBig();
}

}














