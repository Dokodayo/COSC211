package pgExcercise11_2;

import java.util.GregorianCalendar;


class MyDate {
  private int year;
  private int month;
  private int day;



  MyDate() {
    GregorianCalendar date = new GregorianCalendar();
    // Find year, month, and day from date. You write your own code to replace the out-dated get
    // methods
    year = date.get(GregorianCalendar.YEAR);
    month = date.get(GregorianCalendar.MONTH);
    day = date.get(GregorianCalendar.DAY_OF_MONTH);
  }
  // Try to write code by my self but found out this code is exact same code I tried to wirte.



  // Find year, month, and day from date. You write your own code to replace the out-dated get
  // methods
  MyDate(long elapsedTime) {
    upDate(elapsedTime);
  }

  public void upDate(long elapsedTime) {
    GregorianCalendar calander = new GregorianCalendar();
    calander.setTimeInMillis(elapsedTime);
    year = calander.get(GregorianCalendar.YEAR);
    month = calander.get(GregorianCalendar.MONTH);
    day = calander.get(GregorianCalendar.DAY_OF_MONTH);
  }

  MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setDay(int day) {
    this.day = day;
  }
}
