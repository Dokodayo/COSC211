package pgExcercise11_2;

public class Staff extends Employee {
  // Data Fields
  private String title;

  // Constructing object
  public Staff(String name, String address, String phone, String email, int office, double salary,
      String title) {
    super(name, address, phone, email, office, salary);
    this.title = title;
  }

  // Return title
  public String getTitle() {
    return title;
  }

  // set new title
  public void setTitle(String title) {
    this.title = title;
  }

  // String for description
  public String toString() {
    return super.toString() + "\n" + "Title: " + title;
  }
}
