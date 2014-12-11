import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumeralsTests {

    @Test
    public void test1Returns1() {
        NumeralConverter converter = new NumeralConverter();
        assertThat(converter.fromRomanNumeral("I"), equalTo((Integer)1));
    }

}
