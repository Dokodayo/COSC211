package pgExcercise12_12;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {
  /** Main method */
  public static void main(String[] args) throws Exception {
    // Check command line parameter usage
    if (args.length != 1) {
      System.out.println("Usage: java Exercise12_12 filename");
      System.exit(1);
    }

    // Check if source file exists
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + args[0] + " not exist");
      System.exit(2);
    }

    StringBuilder buffer = new StringBuilder();
    Scanner input = new Scanner(sourceFile);

    while (input.hasNext()) {
      String s = input.nextLine();
      String s1 = s.trim();

      exceptionMethod e = new exceptionMethod(args, s, s1);
      try {
        e.reformatCheck(s, s1);
      } catch (Exception ex) {
        buffer.append(" {");
        try {
          e.reformator(s, s1);
        } catch (Exception exc) {
          buffer.append("\r\n" + s.replace('{', ' '));
          input.close();
          // Write buffer intothe file
          PrintWriter output = new PrintWriter(sourceFile);
          output.print(buffer.toString());
          output.close();
        }
        input.close();
        // write buffer into the file
        PrintWriter output = new PrintWriter(sourceFile);
        output.print(buffer.toString());
        output.close();
      }



      if (s1.charAt(0) == '{') {
        buffer.append(" {");
        if (s1.length() > 1)
          buffer.append("\r\n" + s.replace('{', ' '));
      } else
        buffer.append("\r\n" + s);
    }

    input.close();

    // Write buffer into the file
    PrintWriter output = new PrintWriter(sourceFile);
    output.print(buffer.toString());
    output.close();
  }
}
