
import java.util.Scanner;

public class Date {
  private String rMonth;
  private int rDay;
  private int rYear; // a four digit number.
  private int rValue;
  String x = "Fatal Error.";


  public Date() {
    rMonth = "January";
    rDay = 1;
    rYear = 1000;
  }

  public Date(int monthInt, int day, int year) {
    setDate(monthInt, day, year);
  }

  public Date(String monthString, int day, int year) {
    setDate(monthString, day, year);
  }

  public Date(int year) {
    if (dateOK(1, 1, year)) {
      this.rMonth = monthString(1);
      this.rDay = 1;
      this.rYear = year;
    } else {
      System.out.println(x);
      System.exit(0);
    }
  }

  public Date(Date aDate) {
    if (aDate == null)// Not a real date.
    {
      extracted();
      System.exit(0);
    }

    rMonth = aDate.rMonth;
    rDay = aDate.rDay;
    rYear = aDate.rYear;
  }

  private void extracted() {
    System.out.println(x);
  }

  public void setDate(int monthInt, int day, int year) {
    if (dateOK(monthInt, day, year)) {
      this.rMonth = monthString(monthInt);
      this.rDay = day;
      this.rYear = year;
    } else {
      System.out.println(x);
      System.exit(0);
    }
  }

  public void setDate(String monthString, int day, int year) {
    if (dateOK(monthString, day, year)) {
      this.rMonth = monthString;
      this.rDay = day;
      this.rYear = year;
    } else {
      System.out.println(x);
      System.exit(0);
    }
  }

  public void setDate(int year) {
    setDate(1, 1, year);
  }

  public void setYear(int year) {
    if ((year < 1000) || (year > 9999)) {
      System.out.println(x);
      System.exit(0);
    } else
      this.rYear = year;
  }

  public void setMonth(int monthNumber) {
    if ((monthNumber <= 0) || (monthNumber > 12)) {
      System.out.println(x);
      System.exit(0);
    } else
      rMonth = monthString(monthNumber);
  }

  public void setDay(int day) {
    if ((day <= 0) || (day > 31)) {
      System.out.println(x);
      System.exit(0);
    } else
      this.rDay = day;
  }

  public int getMonth() {

    return switch (rMonth) {
      case "January" -> 1;
      case "February" -> 2;
      case "March" -> 3;
      case "April" -> 4;
      case "May" -> 5;
      case "June" -> 6;
      case "July" -> 7;
      case "August" -> 8;
      case "September" -> 9;
      case "October" -> 10;
      case "November" -> 11;
      case "December" -> 12;

      default -> {
        System.out.println(x);
        System.exit(0);
        yield 0; // Needed to keep the compiler happy
      }
    };
  }



  /**
   * if (month.equals("January"))
   * 
   * return 1; else if (month.equals("February")) return 2; else if
   * (month.equalsIgnoreCase("March")) return 3; else if (month.equalsIgnoreCase("April")) return 4;
   * else if (month.equalsIgnoreCase("May")) return 5; else if (month.equals("June")) return 6; else
   * if (month.equalsIgnoreCase("July")) return 7; else if (month.equalsIgnoreCase("August")) return
   * 8; else if (month.equalsIgnoreCase("September")) return 9; else if
   * (month.equalsIgnoreCase("October")) return 10; else if (month.equals("November")) return 11;
   * else if (month.equals("December")) return 12; else { System.out.println("Fatal Error");
   * System.exit(0); return 0; // Needed to keep the compiler happy }
   */

  public int getDay() {
    return rDay;
  }

  public int getYear() {
    return rYear;
  }

  public String toString() {
    return (rMonth + " " + rDay + ", " + rYear);
  }

  public boolean equals(Date otherDate) {
    return ((rMonth.equals(otherDate.rMonth)) && (rDay == otherDate.rDay)
        && (rYear == otherDate.rYear));
  }

  public boolean precedes(Date otherDate) {
    return ((rYear < otherDate.rYear)
        || (rYear == otherDate.rYear && getMonth() < otherDate.getMonth())
        || (rYear == otherDate.rYear && rMonth.equals(otherDate.rMonth) && rDay < otherDate.rDay));
  }

  public void readInput() {
    var tryAgain = true;
    var keyboard = new Scanner(System.in);
    while (tryAgain) {
      System.out.println("Enter month, day, and year.");
      System.out.println("Do not use a comma.");
      var monthInput = keyboard.next();
      var dayInput = keyboard.nextInt();
      var yearInput = keyboard.nextInt();
      if (dateOK(monthInput, dayInput, yearInput)) {
        setDate(monthInput, dayInput, yearInput);
        tryAgain = false;
      } else
        System.out.println("Illegal date. Reenter input.");
    }
  }

  private boolean dateOK(int monthInt, int dayInt, int yearInt) {
    return ((monthInt >= 1) && (monthInt <= 12) && (dayInt >= 1) && (dayInt <= 31)
        && (yearInt >= 1000) && (yearInt <= 9999));
  }

  private boolean dateOK(String monthString, int dayInt, int yearInt) {
    return (monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000)
        && (yearInt <= 9999));
  }

  // work on
  private boolean monthOK(String month) {
    return switch (month) {
      case "January" -> true;
      case "February" -> true;
      case "March" -> true;
      case "April" -> true;
      case "May" -> true;
      case "June" -> true;
      case "July" -> true;
      case "August" -> true;
      case "September" -> true;
      case "October" -> true;
      case "November" -> true;
      case "December" -> true;

      default -> false;
    };
  }

  /*
   * private boolean monthOK(String month) { return (month.equals("January") ||
   * month.equals("February") || month.equals("March") || month.equals("April") ||
   * month.equals("May") || month.equals("June") || month.equals("July") || month.equals("August")
   * || month.equals("September") || month.equals("October") || month.equals("November") ||
   * month.equals("December")); }
   */

  public String monthString(int monthNumber) {
    String monthName;
    monthName = switch (monthNumber) {

      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";

      default -> {
        System.out.println(x);
        System.exit(0);
        yield "Error"; // to keep the compiler happy
      }

    };
    return monthName;
  }
}

/*
 * public String monthString(int monthNumber) { String monthName; monthName = switch(monthNumber) {
 * 
 * //case "January" -> 1;
 * 
 * case 1 -> "January"; case 2 -> "February"; case 3 -> "March"; case 4 -> "April"; case 5 -> "May";
 * case 6 -> "June"; case 7 -> "July"; case 8 -> "August"; case 9 -> "September"; case 10 ->
 * "October"; case 11 -> "November"; case 12 -> "December";
 * 
 * defalut -> { System.out.println("Fatal Error"); System.exit(0); yield "Error"; // to keep the
 * compiler happy } };
 **/

/*
 * switch (monthNumber) { case 1: return "January"; case 2: return "February"; case 3: return
 * "March"; case 4: return "April"; case 5: return "May"; case 6: return "June"; case 7: return
 * "July"; case 8: return "August"; case 9: return "September"; case 10: return "October"; case 11:
 * return "November"; case 12: return "December"; default: System.out.println("Fatal Error");
 * System.exit(0); return "Error"; // to keep the compiler happy
 */
