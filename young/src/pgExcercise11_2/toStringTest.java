package pgExcercise11_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class toStringTest {

  @Test
  public void employeeStringTest() {
    Employee e =
        new Employee("John", "east circle", "123 456 789", "dpark6@emich.edu", 102, 6000.00);
    String actual = e.toString();
    String expected = "Employee John";
    assertEquals(expected, actual);

    // add person, student, faculty, staff toString tests.


  }

  @Test
  public void personStringTest() {
    Person p = new Person("David", "900 Oakwood St", "734 487 0076", "david12@emich.edu");
    String actual = p.toString();
    String expected = "Person David";
    assertEquals(expected, actual);

  }

  @Test
  public void facultyStringTest() {
    Faculty f = new Faculty("Evan", "799 Oxford Rd", "734 5839 8893", "evan@emich.edu", 601, 62000,
        "9am to 1pm", "Professor");
    String actual = f.toString();
    String expected = "Faculty Evan";
    assertEquals(expected, actual);
  }

  @Test
  public void staffStringTest() {
    Staff sf = new Staff("Coory", "Stanton St", "734 229 9182", "coory@gmail.com", 302, 72000,
        "Cheif Executive");
    String actual = sf.toString();
    String expected = "Staff Coory";
    assertEquals(expected, actual);

  }

  @Test
  public void studentStringTest() {
    Student st =
        new Student("Ashe", "1399 Kingwood St", "734 229 1059", "ashe3@emich.edu", Student.SENIOR);
    String actual = st.toString();
    String expected = "Student Ashe";
    assertEquals(expected, actual);

  }

}
