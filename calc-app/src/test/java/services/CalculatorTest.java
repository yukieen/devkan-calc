package services;

import org.junit.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator sut = new Calculator();
    String actual = sut.add(1, 1);
    assertThat(actual, is("2"));
  }
}
