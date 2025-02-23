import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(34.55, 10);
        Scanner sc = new Scanner(System.in);

        cc.menu();
    }
}