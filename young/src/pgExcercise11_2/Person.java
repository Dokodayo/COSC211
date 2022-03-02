package pgExcercise11_2;

public class Person {
  private String name;
  private String address;
  private String phone;
  private String email;

  // Setting default value of object
  public Person() {
    this(" - ", " - ", " - ", " - ");
  }

  // Constructing object name, address, phone number and email
  public Person(String name, String address, String phone, String email) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  // return name
  public String getName() {
    return name;
  }

  // set new name
  public void setName(String name) {
    this.name = name;
  }

  // return address
  public String getAddress() {
    return address;
  }

  // set new address
  public void setAddress(String address) {
    this.address = address;
  }

  // return phone
  public String getPhone() {
    return phone;
  }

  // set new phone
  public void setPhone(String phone) {
    this.phone = phone;
  }

  // return email
  public String getEmail() {
    return email;
  }

  // set new email
  public void setEmail(String email) {
    this.email = email;
  }

  /*
   * // Return string description public String toString() { return "\n" + "Name: " + name + "\n" +
   * "Address: " + address + "\n" + "Phone Number: " + phone + "\n" + "Email Address: " + email;
   */

  // Returning a toString
  public String toString() {
    return "Person " + getName();

  }
}
