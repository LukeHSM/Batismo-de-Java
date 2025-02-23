import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
    Scanner sc = new Scanner(System.in);
    int numMenu = 0;
    double saldo;
    double taxa;

    public ContaCorrente(){
        this.saldo = 0;
        this.taxa = 1;
    }

    public ContaCorrente(double saldo){
        this.saldo = saldo;
        this.taxa = 1;
    }

    public ContaCorrente(double saldo, double taxa){
        this.saldo = saldo;
        this.taxa = taxa;
    }

    @Override
    public void consultarSaldo(){
        System.out.printf("Seu saldo é %.2f%n%n", saldo);
    }

    @Override
    public void depositar(double qntd){
        qntd -= (qntd*(taxa/100));
        saldo+= qntd;
        System.out.println("Foi descontado " + taxa + "% do valor total.\nValor real depositado: " + qntd);
    }

    public void menu(){
        while(numMenu != 3) {
            System.out.println("-------- Menu --------");
            System.out.println("1 - Para consultar saldo.");
            System.out.println("2 - Para depósito.");
            System.out.println("3 - Sair.");
            System.out.print(": ");
            numMenu = sc.nextInt();
            sc.nextLine(); // consome o \n do buffer que o nextInt() deixa;
            verificarNum(numMenu);
        }

    }

    public void verificarNum(int numMenu){
        switch (numMenu){
            case 1:
                this.consultarSaldo(); break;
            case 2:
                System.out.println("Digite a quantidade (se necessário,  separe com vírgula apenas)");
                System.out.print(": ");
                double num = sc.nextDouble();
                this.depositar(num);
                System.out.println();
                break;
            default: break;
        }
    }
}