package pgExcercise11_2;

public class Exe11_2 {
  // Main method to run program
  public static void main(String[] args) {
    // Create object for Person, Staff, Employee, Faculty and Student
    Person person = new Person("David", "900 Oakwood St", "734 487 0076", "david12@emich.edu");

    Staff staff = new Staff("Coory", "Stanton St", "734 229 9182", "coory@gmail.com", 302, 72000,
        "Cheif Executive");

    Employee employee =
        new Employee("Jimin", "5th avenue", "675 332 6576", "jimin@gmail.com", 225, 750000);

    Faculty faculty = new Faculty("Evan", "799 Oxford Rd", "734 5839 8893", "evan@emich.edu", 601,
        62000, "9am to 1pm", "Professor");

    Student student =
        new Student("Ashe", "1399 Kingwood St", "734 229 1059", "ashe3@emich.edu", Student.SENIOR);

    // Invoke toString created objects
    System.out.println(person.toString());
    System.out.println(staff.toString());
    System.out.println(employee.toString());
    System.out.println(faculty.toString());
    System.out.println(student.toString());
  }
}
