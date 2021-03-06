
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.CombinableMatcher;

import java.util.Arrays;



public class TestJunitItself {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
}

@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}

@Test
public void testAssertArrayEquals() {
  byte[] expected = "trial".getBytes();
  byte[] actual = "trial".getBytes();
  assertArrayEquals("failure - byte arrays not same", expected, actual);
}

@Test
public void testAssertEquals() {
  assertEquals("failure - not the same value", 5L, 5L);
}

@Test
public void testAssertTrue() {
  assertTrue("failure - should be true", true);
}

@Test
public void testAssertFalse() {
  assertFalse("failure - should be false", false);
}

@Test
public void testAssertNotNull() {
  assertNotNull("should not be null", new Object());
}

@Test
public void testAssertNull() {
  assertNull("should be null", null);
}

@Test
public void testAssertSame() {
  Integer aNumber = Integer.valueOf(768);
  assertSame("should be same object", aNumber, aNumber);
}

@Test
public void testAssertNotSame() {
  assertNotSame("should not be same Object", new Object(), new Object());
}

// JUnit Matchers assertThat
@Test
public void testAssertThatBothContainsString() {
  assertThat("albumen", both(containsString("a")).and(containsString("b")));
}

@Test
public void testAssertThathasItemsContainsString() {
  assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
}

@Test
public void testAssertThatEveryItemContainsString() {
  assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
}

// Core Hamcrest Matchers with assertThat
@Test
public void testAssertThatHamcrestCoreMatchers() {
  assertThat("good", allOf(equalTo("good"), startsWith("good")));
  assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
  assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
  assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
  assertThat(new Object(), not(sameInstance(new Object())));
}

}
