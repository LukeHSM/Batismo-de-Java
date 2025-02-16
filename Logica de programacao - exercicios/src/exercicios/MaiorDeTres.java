package exercicios;
import java.util.Scanner;

public class MaiorDeTres {
    Scanner sc = new Scanner(System.in);

    public void maiorDeTres() {
        int[] nums = new int[3];

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        nums[0] = num1;

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        nums[1] = num2;

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();
        nums[2] = num3;

        int maior = nums[0];

        for(int x: nums){
            if(maior < x) maior = x;
        }

        System.out.println("\nO maior número é " + maior + "\n");
    }
}
