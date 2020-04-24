public class Calculator {

    private int a;
    private int b;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int subs() {
        return a - b;
    }

    public int multi() {
        return a * b;
    }

    public int div() {
        return a / b;
    }
}
