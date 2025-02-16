import ninjas.Ninja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ninja ninja1 = new Ninja();
        int count = 1;

        while(count<=3){

            System.out.println("Digite o nome do ninja: ");
            ninja1.setNome(sc.nextLine());

            System.out.println("Digite a idade do ninja: ");
            ninja1.setIdade(Integer.parseInt(sc.nextLine())); // usando 'nextLine' e já convertendo em int
            // para tirar o '\n' do início da STREAM (ver resolução de problemas nos favoritos (JAVA, NO NAVEGADOR))
            // Claro, no artigo, existe uma solução mais elegante que essa....

            System.out.println("Digite a missão do ninja: ");
            ninja1.setMissao(sc.nextLine());


            System.out.println("Digite o nível da missão: ");
            ninja1.setNivelMissao(sc.nextLine());

            ninja1.verificar();
            System.out.printf("O ninja %s tem %d anos, portanto o status de sua missão \"%s\", rank %s, é: %s%n%n", ninja1.getNome(), ninja1.getIdade(), ninja1.getMissao(), ninja1.getNivelMissao().toUpperCase(), ninja1.getStatusDeConclusao());
            count++;
        }


    }
}