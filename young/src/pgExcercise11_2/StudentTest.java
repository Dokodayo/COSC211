package pgExcercise11_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StudentTest {

  @Test
  public void testStudentToString() {
    Student testStudent = new Student("student", null, null, null, 0);

    String expected = "Student: student";
    String actual = testStudent.toString();

    assertEquals(expected, actual);
  }
}

