import java.util.Scanner;

/**
 * Escolha o tamanho da array.
 * Escolha entre cadastrar ninjas, ver a lista de ninjas já cadastrados ou sair do programa.
 * Voce pode alternar entre cadastrar 1 ou 2 ninjas e ver a lista com ninjas cadastrados, e voltar a cadastrar o restante, por exemplo.
 * */

public class Main {
    static int count = 0;
    static Scanner entrada = new Scanner(System.in);

    static void separador(){
        System.out.println("\n==================================================================================");
    }
    static void mostrarNinjas(String[] arr){
        separador();

        // Verifica se o índice não está vazio e printa o valor.
        for(int i=0; i < arr.length; i++){
            if(arr[i] != null) System.out.printf("Ninja %d: %s.%n", i+1, arr[i]);
        }

        // Verificando a quantidade de elementos e mostrando para o usuário.
        if(count == 0){System.out.println("\nNenhum ninja cadastrado!");}
        else if(count > 0 && count < arr.length){System.out.println("\nHá um total de " + (arr.length - count) + " espaçado(s) não empreechido(s)");}
        separador();
    }

    static void cadastro(String[] arr, int qntd){
        separador();

        if(count != qntd){
            System.out.println("\nDigite \"END\" quando quiser parar o cadastro.\n");

            while (count < qntd) {

                // Verifica se o slot estiver vazio...
                // Útil se vc interrompeu o cadastro antes e está continuando agora.
                if (arr[count] == null) {
                    System.out.printf("Você tem %d espaço(s) restante(s)!%n", arr.length - count);
                    System.out.printf("Insira o nome do ninja %d: ", count + 1);
                    String nome = entrada.nextLine();
                    System.out.println();

                    // Se digitar 'end', acaba o cadastro, por enquanto.
                    if (nome.equalsIgnoreCase("end")) {
                        System.out.println("\nFIM DO CADASTRO!");
                        break;
                    } else { // Se digitar qualquer outra coisa, adiciona na array.
                        arr[count] = nome;
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }else System.out.println("\nA lista já está completa!");
        separador();
    }

    static void mostrarMenu(){

        System.out.print("Digite a quantidade de ninjas a serem cadastrados: ");
        int limite = entrada.nextInt();
        String[] ListaNinjas = new String[limite];
        boolean cond = true;

        while(cond){
            System.out.println("\n==== Menu Ninja ====");
            System.out.println("1. Cadastro Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = entrada.nextInt(); entrada.nextLine();

            switch (escolha){
                case 1: cadastro(ListaNinjas, limite); break;
                case 2: mostrarNinjas(ListaNinjas); break;
                case 3: System.out.println("\nAdeus!"); cond = false; break;
            }
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}
