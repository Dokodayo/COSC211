package pgExcercise12_12;

import java.io.File;

public class exceptionMethod {

  private String[] args;
  private static String s;
  private static String s1;

  public exceptionMethod(String[] args) {
    this.args = args;
  }

  public exceptionMethod(String[] args, String s, String s1) {
    this.args = args;
    this.s = s;
    this.s1 = s1;

  }

  public String checkCommand(String[] args) throws Exception {
    this.args = args;
    if (args.length != 1) {
      throw new Exception();

    }
    return "args length equals 1";

  }

  public String checkSource(String[] args) throws Exception {
    this.args = args;
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
      throw new Exception();
    }
    return "Source file exists";
  }

  public static String reformatCheck(String ss, String s2) throws Exception {
    s = ss;
    s1 = s2;
    if (s1.charAt(0) == '{') {
      throw new Exception();
    }
    return s1;
  }

  public static String reformator(String ss, String s2) throws Exception {
    s = ss;
    s1 = s2;
    if (s1.length() > 1) {
      throw new Exception();
    }
    return s1;
  }

}


// if (s1.length() > 1) buffer.append("\r\n" + s.replace('{', ' '));
// else
// buffer.append("\r\n" + s);
