package pgExcercise11_2;

public class Student extends Person {
  private int status;

  // setting numbers for status. 1 ~ 4
  public final static int FRESHMAN = 1;
  public final static int SOPHOMORE = 3;
  public final static int JUNIOR = 2;
  public final static int SENIOR = 4;

  public Student(String name, String address, String phone, String email, int status) {
    super(name, address, phone, email);
    this.status = status;
  }

  // set status
  public void setStatus(int status) {
    this.status = status;
  }

  // using switch for setting status
  public String getStatus() {
    switch (status) {
      case 1:
        return "FRESHMAN";
      case 2:
        return "SOPHOMORE";
      case 3:
        return "JUNIOR";
      case 4:
        return "SENIOR";
      default:
        return "No information";
    }
  }

  // Return string for description
  public String toString() {
    return super.toString() + "\n" + "Status: " + getStatus();
  }
}
