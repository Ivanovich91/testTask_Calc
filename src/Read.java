import java.util.Scanner;

public class Read {

    public int readNextInt() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if (i>=0 || i<=10) {
            i = sc.nextInt();
        }
        else {
            System.out.println("Вы ввели неверное значение");
        }
        return i;
    }
}
