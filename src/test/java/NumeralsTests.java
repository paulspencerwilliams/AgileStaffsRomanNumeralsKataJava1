import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumeralsTests {

    private final NumeralConverter converter = new NumeralConverter();

    @Test
    public void testIReturns1() {
        assertThat(converter.fromRomanNumeral("I"), equalTo((Integer) 1));
    }

    @Test
    public void testIIReturns2() {
        assertThat(converter.fromRomanNumeral("II"), equalTo((Integer)2));
    }

}
