package pgExcercise11_2;

public class Faculty extends Employee {
  // Creating data fields
  private String rank;
  private String officeHours;


  // Constructors - name, address, phone, email, office number, salary, officeHours and rank
  public Faculty(String name, String address, String phone, String email, int officeNumber,
      double salary, String officeHours, String rank) {
    super(name, address, phone, email, officeNumber, salary);
    this.rank = rank;
    this.officeHours = officeHours;

  }

  // Setting rank
  public String getRank() {
    return rank;
  }

  // Setting new rank
  public void setRank(String rank) {
    this.rank = rank;
  }

  // Returning office hours
  public String getOfficeHours() {
    return officeHours;
  }
  // Setting new office hours

  public void setOfficeHours(String officeHours) {
    this.officeHours = officeHours;
  }

  /*
   * // Returning toString public String toString() { return super.toString() + "\n" + "Rank: " +
   * rank + "\n" + "Office hours: " + officeHours;
   */
  public String toString() {
    return "Faculty " + getName();

  }
}
