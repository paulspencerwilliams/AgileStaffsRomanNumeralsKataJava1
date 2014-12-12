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

    @Test
    public void testIIIReturns3() {
        assertThat(converter.fromRomanNumeral("III"), equalTo((Integer)3));
    }

    @Test
    public void testIVReturns4()
    {
        assertThat(converter.fromRomanNumeral("IV"), equalTo((Integer)4));
    }

    @Test
    public void testVReturns5()
    {
        assertThat(converter.fromRomanNumeral("V"), equalTo((Integer)5));
    }

    @Test
    public void testVIReturns6()
    {
        assertThat(converter.fromRomanNumeral("VI"), equalTo((Integer)6));
    }

    @Test
    public void testVIIReturns7()
    {
        assertThat(converter.fromRomanNumeral("VII"), equalTo((Integer)7));
    }

    @Test
    public void testVIIIReturns8()
    {
        assertThat(converter.fromRomanNumeral("VIII"), equalTo((Integer)8));
    }

    @Test
    public void testIXReturns9() {
        assertThat(converter.fromRomanNumeral("IX"), equalTo((Integer)9));
    }

    @Test
    public void testXReturns10() {
        assertThat(converter.fromRomanNumeral("X"), equalTo((Integer)10));
    }

    @Test
    public void testICReturns99() { // I know, I know this is wrong!!
        assertThat(converter.fromRomanNumeral("IC"), equalTo((Integer)99));
    }
}
