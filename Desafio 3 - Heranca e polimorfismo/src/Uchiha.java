public class Uchiha extends Ninja{
    private String habilidadeEspecial = "Sharingan";

    @Override
    public void info(){
        System.out.println("\nNome do ninja: " + this.nome);
        System.out.println("Idade do ninja: " + this.idade);
        System.out.println("Habilidade especial: " + this.habilidadeEspecial);
        System.out.println("Missão: " + this.missao);
        System.out.println("Nível da missão: " + this.dificuldadeMissao);

        if(this.idade < 15){
            if(this.dificuldadeMissao.equalsIgnoreCase("D") || this.dificuldadeMissao.equalsIgnoreCase("C")){
                this.statusMissao = "Concluída";
            }else if(this.dificuldadeMissao.equalsIgnoreCase("A") || this.dificuldadeMissao.equalsIgnoreCase("B") || this.dificuldadeMissao.equalsIgnoreCase("S")){
                this.statusMissao = "Não-concluída";
            }else this.statusMissao = "Missão inválida";
        }else if(this.dificuldadeMissao.equalsIgnoreCase("S") || this.dificuldadeMissao.equalsIgnoreCase("A") || this.dificuldadeMissao.equalsIgnoreCase("B") || this.dificuldadeMissao.equalsIgnoreCase("C") || this.dificuldadeMissao.equalsIgnoreCase("D")) {
            this.statusMissao = "Concluída";
        }else this.statusMissao = "Missão inválida";

        System.out.println("Status da missão: " + this.statusMissao);
    }
}
