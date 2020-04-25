import java.util.HashMap;


    public class Parser {

        private static final HashMap<String, Integer> romeDigit;
        private int counter = 0;
        static {
            romeDigit = new HashMap<>();
            romeDigit.put("I", 1);
            romeDigit.put("II", 2);
            romeDigit.put("III", 3);
            romeDigit.put("IV", 4);
            romeDigit.put("V", 5);
            romeDigit.put("VI", 6);
            romeDigit.put("VII", 7);
            romeDigit.put("VIII", 8);
            romeDigit.put("IX", 9);
            romeDigit.put("X", 10);
        }

        public Integer parseStringValue(String number) throws NumberFormatException{
            return romeDigit.containsKey(number)
                    ? getRomeNumber(number)
                    : Integer.valueOf(number);
        }

        private Integer getRomeNumber(String number){
            this.counter++;
            return romeDigit.get(number);
        }

        public int getCounter() {
            return counter;
        }
    }

