import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeConverterTest {
    private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testconvert1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected,actual);
    }
    @Test
    public void testconvert2() {
        String expected = "C";
        String actual = converter.convert(75);
        assertEquals(expected,actual);
    }
}