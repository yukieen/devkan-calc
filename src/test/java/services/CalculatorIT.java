package services;

import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.LowLevelAppDescriptor;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorIT extends JerseyTest {

    @Test
    public void testAdd() {
        String actual = resource().path("/add")
                .queryParam("a", "1")
                .queryParam("b", "1")
                .get(String.class);

        assertThat(actual, is("2"));
    }

    @Override
    protected AppDescriptor configure() {
        return new LowLevelAppDescriptor.Builder(Calculator.class).build();
    }
}
