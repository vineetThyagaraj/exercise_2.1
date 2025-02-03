import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testConvertToFahrenheit() {
        App test = new App();
        assertEquals( 32.0, test.convertToFahrenheit(0), 0);
        assertEquals( 212.0, test.convertToFahrenheit(100), 0);
        assertEquals( -40.0, test.convertToFahrenheit(-40), 0);
        assertEquals( 98.6, test.convertToFahrenheit(37), 0);
        
    }
}
