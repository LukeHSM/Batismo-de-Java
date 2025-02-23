package exercicios;

import java.util.Scanner;

public class Fatorial {
    Scanner sc = new Scanner(System.in);
    private long soma = 1L;
    private String frase = "";

    public void fatorial() {
        System.out.print("\n\nDigite um número: ");
        long n = sc.nextInt();

        for(long i=n; 0<i; i--){
            if(i!=1){
                frase+=(i + " . ");
                soma*=i;
            }else{
                frase+=(i + " = ");
                soma*=i;
            }
        }
        System.out.printf("%d! = %s%d", n, frase, soma);
        frase = "";
        soma = 1;
    }
}
