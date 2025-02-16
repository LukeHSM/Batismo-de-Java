package exercicios;

import java.util.Scanner;

/**
 * isInteger(String) = verifica se a string pode ser convertida em Integer (Caso sim, retorna true. Se não, retorna false).
 * */

public class ParOuImpar {
    Scanner sc = new Scanner(System.in);

    public void parOuImpar(){
        System.out.print("Digite um número inteiro: ");
        String numString = sc.next();

        if(isInteger(numString)){
            int num = Integer.parseInt(numString);
            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " é um número PAR!\n");
                } else System.out.println(num + " é um número ÍMPAR!\n");
            } else System.out.println(num + " é igual a ZERO!\n");
        } else System.out.println("Isso NÃO É um número inteiro...\n");
    }

    public boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
