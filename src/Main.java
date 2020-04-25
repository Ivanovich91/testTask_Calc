import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        while(true) {
            System.out.println("Введите выражение:");
            String expresion = read.readNextExpression();  //Выражение введенное с клавиатуры
            Pattern operationsPattern = Pattern.compile("[-/*+]"); //перечислили арифм операции

            String[] expressionPair = operationsPattern.split(expresion);   //массив с введенными числами
            if(expressionPair.length != 2){
                System.out.println("Выражение содержит более двух чисел");
                continue;
            }

            Parser parser = new Parser();
            Integer firstNumber = parser.parseStringValue(expressionPair[0]);
            Integer secondNumber = parser.parseStringValue(expressionPair[1]);

            if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10 || parser.getCounter() == 1) {
                throw new NumberFormatException("ошибка");
            }

            char stringOperation = expresion.toCharArray()[expressionPair[0].length()]; //Берем знак стоящий после первого числа
            Operation operation = null;
            for (Operation opp : Operation.values()) {
                if (opp.operation.equals(String.valueOf(stringOperation))) {
                    operation = opp;
                }
            }
            System.out.println(operation.calc(new Calculator(firstNumber, secondNumber)));
        }
    }
}
