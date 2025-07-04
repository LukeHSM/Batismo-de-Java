package lukehsm;

import java.util.Scanner;

/**
 * SOLICTAR QUE O USUÁRIO DIGITE UMA SENHA ATÉ QUE ESTA CUMPRA TODOS OS REQUESITOS:
 * Mínimo de 8 caracteres
 * Ao menos uma letra maiúscula
 * Ao menos um número
 * Ao menos um caractere especial
 * */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cond = false;
        String senha;

        while (true) {
            System.out.print("\n\nSENHA: ");
            senha = sc.next();

            System.out.println("Mínimo de 8 caracteres: " + minCaractere(senha));
            System.out.println("Ao menos uma maiúscula: " + minMaiuscula(senha));
            System.out.println("Tem char numérico: " + minNumero(senha));
            System.out.println("Tem char especial: " + minCharEspecial(senha));
        }

    }


    // Mínimo de 8 caracteres
    private static boolean minCaractere(String senha){
        int count = 0;

        for (char c: senha.toCharArray()) count++;

        if (count >= 8) return true;
        else return false;
    }

    // Ao menos uma letra maiúscula
    private static boolean minMaiuscula(String senha){
        int count = 0;

        for (char c: senha.toCharArray()){
            if (c >= 65 && c <= 90) count++;
        }

        if (count > 0) return true;
        return false;
    }

    // Ao menos um número
    private static boolean minNumero(String senha){
        int count = 0;

        for (char c: senha.toCharArray()){
            if (c >= 48 && c <= 57) count++;
        }

        if (count > 0) return true;
        else return false;
    }

    // Ao menos um caractere especial
    private static boolean minCharEspecial(String senha){
        int count = 0;

        for (char c: senha.toCharArray()){
            if (c >= 33 && c <= 126){
                if (!((c >= 65 && c <= 90) || (c >= 65+32 && c <= 90+32) || (c >= 48 && c <= 57))) count++;
            }
        }

        if (count > 0) return true;
        else return false;
    }
}