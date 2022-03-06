package pgExcercise12_12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



class Exercise12_12Test {

  @BeforeAll
  static void setUpBeforeCalss() throws Exception {}

  String[] args = {"hi"};

  @Test
  void testreformator() throws Exception {
    String[] args = {};
    String s = "{";
    String s1 = s.trim();
    exceptionMethod em = new exceptionMethod(args, s, s1);
    String actual = em.reformator(s, s1);
    String expected = "{";
    assertEquals(actual, expected);
  }



  @Test
  void testreformatCheck() throws Exception {
    String[] args = {};
    String s = "{";
    String s1 = s.trim();
    exceptionMethod em = new exceptionMethod(args, s, s1);

    Throwable e = null;
    try {
      em.reformatCheck(s, s1);
    } catch (Exception ex) {
      e = ex;
    }
    assertTrue(e instanceof Exception);
  }

  @Test
  void testcheckSource() throws Exception {
    String[] args = {};
    exceptionMethod em = new exceptionMethod(args);
    Throwable e = null;
    try {
      em.checkSource(args);
    } catch (Exception ex) {
      System.out.println("source file does not exist");
      e = ex;
    }
    assertTrue(e instanceof Exception);
  }

  @Test
  void testcheckCommand() throws Exception {
    String[] args = {"hi"};
    exceptionMethod em = new exceptionMethod(args);
    try {
      em.checkCommand(args);
    } catch (Exception ex) {
      System.out.println("args length does not equal 1");
    }
    String actual = em.checkCommand(args);
    String expected = "args length equals 1";
    assertEquals(actual, expected);
  }



}
