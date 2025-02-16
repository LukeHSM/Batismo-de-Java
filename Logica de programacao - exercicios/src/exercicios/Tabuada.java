package exercicios;
import java.util.Scanner;

public class Tabuada {
    Scanner sc = new Scanner(System.in);

    public void escolherNum(){
       String num;
       System.out.print("Insira um número inteiro: ");
       num = sc.next();
       System.out.println();

       if(isInteger(num)){
           fazerTabuada(num);
           separador();
       }else{
           System.out.printf("O elemento \"%s\" NÃO É um número inteiro...!%n", num);
           separador();
       }

    }

    public void fazerTabuada(String str){
        int numEscolhido = Integer.parseInt(str);
        for(int i=2; i<11; i++){
            System.out.printf("%d x %d = %d%n", numEscolhido, i, numEscolhido*i);
        }
    }

    public boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void separador(){
        System.out.println("\n---------------------------------------------------------------------------\n");
    }
}
