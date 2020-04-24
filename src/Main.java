public class Main {

    public static void main(String[] args) {

        Read read = new Read();
        int one;
        int two;
        char op;
        System.out.println("Введите данные для вычисления: ");
        one = read.readNextInt();
        two = read.readNextInt();


        Calculator calculator = new Calculator(one, two);
    }
}
