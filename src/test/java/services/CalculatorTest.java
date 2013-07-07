package services;

import org.junit.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculatorTest {

  @Test
  public void testAdd1plus1() {
    Calculator sut = new Calculator();
    String actual = sut.add(1, 1);
    assertThat(actual, is("2"));
  }
  
  @Test
  public void testAdd1plus2() {
	    Calculator sut = new Calculator();
	    String actual = sut.add(1, 2);
	    assertThat(actual, is("3"));
  }
  
  @Test
  public void testAdd1plusMinus1() {
	    Calculator sut = new Calculator();
	    String actual = sut.add(1, -1);
	    assertThat(actual, is("0"));
  }
}
