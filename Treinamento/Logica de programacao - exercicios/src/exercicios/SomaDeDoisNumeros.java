package exercicios;

import java.util.Scanner;

public class SomaDeDoisNumeros {
    Scanner sc = new Scanner(System.in);

    public void somaDoisNumeros(){
        System.out.print("INSIRA O PRIMEIRO NÚMERO: ");
        int num1 = sc.nextInt();
        System.out.print("INSIRA O SEGUNDO NÚMERO: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
    }
}
