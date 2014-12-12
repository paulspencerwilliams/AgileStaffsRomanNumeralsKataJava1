
public class NumeralConverter {
    public Integer fromRomanNumeral(String romanNumeral) {
        if (romanNumeral.contains("V") || romanNumeral.contains("X") || romanNumeral.contains("C")) {
            if (romanNumeral.contains("V")) {
                return HandleSpecial("V", 5, romanNumeral);
            }
            else if (romanNumeral.contains("X")) {
                return HandleSpecial("X", 10,  romanNumeral);
            }
            else {
                return HandleSpecial("C", 100, romanNumeral);
            }
        }
        return romanNumeral.length();
    }

    private Integer HandleSpecial(String special, int valueOfSpecial, String romanNumeral) {
        if (romanNumeral.equals("I" + special)) {
            return valueOfSpecial -1;
        }
        return calculateSpecialFollowedByIs(valueOfSpecial, romanNumeral);
    }

    private int calculateSpecialFollowedByIs(int valueOfSpecial, String romanNumeral) {
        return romanNumeral.length() + valueOfSpecial - 1;
    }
}
