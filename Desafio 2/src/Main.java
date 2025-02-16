import java.util.Scanner;

/**
 * Escolha o tamanho da array.
 * Escolha entre cadastrar ninjas, ver a lista de ninjas já cadastrados ou sair do programa.
 * Voce pode alternar entre cadastrar 1 ou 2 ninjas e ver a lista com ninjas cadastrados, e voltar a cadastrar o restante, por exemplo.
 * */

public class Main {
    static void separador(){
        System.out.println("==================================================================================");
    }
    static void mostrarNinjas(String[] arr){
        int count = 0;
        separador();
        for(String nj: arr){
            if(nj==null) count++;
            else System.out.println(nj);
        }

        if(count==arr.length) System.out.println("Nenhum ninja cadastrado!");
        else if (count > 0 && count < arr.length) System.out.println("\nHouve um total de " + count + " espaçado(s) não empreechido(s)");

        separador();

    }

    static void cadastro(String[] arr){
        Scanner entrada = new Scanner(System.in);
        int count = 0;

        System.out.println("\nDigite \"END\" quando quiser parar o cadastro.\n");
        while (count < arr.length){
            if(arr[count]==null) {
                System.out.printf("Você %d espaço(s) restante(s)!%n", arr.length - count);
                System.out.printf("Insira o nome do ninja %d: ", count+1);
                String nome = entrada.nextLine();

                if (nome.equalsIgnoreCase("end")) {
                    System.out.println("\nFIM DO CADASTRO!");
                    break;
                } else {
                    arr[count] = nome;
                    count++;
                }
            }else {
                count++;
            }
        }
        separador();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o tamanho da lista de ninjas: ");
        int tamanho = entrada.nextInt(); entrada.nextLine();

        String[] ListaNinjas = new String[tamanho];
        boolean cond = true;

        while(cond){
            System.out.println("\n==== Menu Ninja ====");
            System.out.println("1. Cadastro Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = entrada.nextInt(); entrada.nextLine();

            switch (escolha){
                case 1: cadastro(ListaNinjas); break;
                case 2: mostrarNinjas(ListaNinjas); break;
                case 3: System.out.println("Adeus!"); cond = false; break;
            }
        }
    }
}
