
public class NumeralConverter {
    public Integer fromRomanNumeral(String romanNumeral) {
        if (romanNumeral.contains("V")) {
            return HandleVs(romanNumeral);
        }
        return romanNumeral.length();
    }

    private Integer HandleVs(String romanNumeral) {
        if (romanNumeral.equals("IV")) {
            return 4;
        }
        return calculateVFollowedByIs(romanNumeral);
    }

    private int calculateVFollowedByIs(String romanNumeral) {
        return romanNumeral.length() + 5 - 1;
    }
}
