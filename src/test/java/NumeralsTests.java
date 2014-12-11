import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumeralsTests {

    @Test
    public void testIReturns1() {
        NumeralConverter converter = new NumeralConverter();
        assertThat(converter.fromRomanNumeral("I"), equalTo((Integer) 1));
    }

    @Test
    public void testIIReturns2() {
        NumeralConverter converter = new NumeralConverter();
        assertThat(converter.fromRomanNumeral("II"), equalTo((Integer)2));
    }

}
