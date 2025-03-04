

public class Main {
    public static void main(String[] args){
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 14;
        naruto.missao = "aaaaa";
        naruto.dificuldadeMissao = "B";
        naruto.info();

        Ninja sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 14;
        sasuke.missao = "aaaaa";
        sasuke.dificuldadeMissao = "Y";
        sasuke.info();
    }
}