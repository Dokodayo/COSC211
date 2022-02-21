package pgExcercise11_2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import programmingExcercise.programingExcercise;

class Exe11_2Test {

  @Test
  void test() {

    Exe11_2.main(null);
    Person list = new Person("David", "900 Oakwood St", "734 487 0076", "david12@emich.edu");

    Assert.assertTrue(list[0] == David);
    Assert.assertTrue(list[1] == 900 Oakwood St);
    Assert.assertTrue(list[2] == 734 487 0076);
    Assert.assertTrue(list[3] == david12@emich.edu);
    Assert.assertTrue(list.length == 3);
    // Trying to make junit test that checks if there are 4 right objects for Person. 
  }
}
