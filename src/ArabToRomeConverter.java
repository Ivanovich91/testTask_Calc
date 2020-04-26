    import java.util.List;

    public class ArabToRomeConverter {

        public static String arabToRome(int number) {
            List<RomeNum> romanNumerals = RomeNum.getReverseSortedValues();

            int i = 0;
            StringBuilder sb = new StringBuilder();
            while ((number > 0) && (i < romanNumerals.size())) {
                RomeNum currentSymbol = romanNumerals.get(i);
                if (currentSymbol.getValue() <= number) {
                    sb.append(currentSymbol.name());
                    number -= currentSymbol.getValue();
                } else {
                    i++;
                }
            }

            return sb.toString();
        }
    }

