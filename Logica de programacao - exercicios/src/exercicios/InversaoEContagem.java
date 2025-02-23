package exercicios;

import java.util.Scanner;

public class InversaoEContagem {
    Scanner sc = new Scanner(System.in);
    private String novaString = "";

    public void inverterEContar(){
        System.out.print("Digite algo a ser invertido (SEM espaço): ");
        String num = sc.next();
        int count = num.length(); // contagem

        // inversão
        for(int i=(num.length()-1); 0 <= i; i--){
            char charactere = num.charAt(i);
            novaString += charactere;
        }

        System.out.printf("%n%s (Isso contém %d characteres).%n%n", novaString, count);
        count = 0;
        novaString = "";

        // Aqui? (Palíndromo)
    }

    //  ADD VERIFICAÇÃO SE A PALAVRA É UM PALÍNDROMO
    //  (PODE SER UM MÉTODO que é chamado dentro do método já existente)...
}
