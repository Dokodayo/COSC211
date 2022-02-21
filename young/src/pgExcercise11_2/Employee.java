package pgExcercise11_2;

public class Employee extends Person {
  private MyDate dateHired;
  private int office;
  private double salary;


  // Setting Employee object
  public Employee(String name, String address, String phoneNumber, String email, int office,
      double salary) {
    super(name, address, phoneNumber, email);
    this.dateHired = new MyDate();
    this.office = office;
    this.salary = salary;
  }

  // Setting new office
  public void setOffice(int office) {
    this.office = office;
  }

  // Returning value for office
  public int getOffice() {
    return office;
  }

  // Setting new salary
  public void setSalary(double salary) {
    this.salary = salary;
  }

  // Returning value for salary
  public String getSalary() {
    return String.format("%.2f", salary);
  }

  // Setting new dateHired
  public void setDateHired() {
    dateHired = new MyDate();
  }

  // Returning value for Date Hired
  public String getDateHired() {
    return dateHired.getMonth() + "-" + dateHired.getDay() + "-" + dateHired.getYear();
  }

  // Returning a toString
  public String toString() {
    return super.toString() + "\n" + "Office: " + office + "\n" + "Salary: $" + getSalary() + "\n"
        + "Date hired: " + getDateHired();
  }
}
